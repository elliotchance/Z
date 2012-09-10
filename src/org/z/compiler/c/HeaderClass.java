package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.lexer.grammar.Type;

public class HeaderClass extends CompileEntity
{
	
	private CompiledFile cf = null;
	
	public HeaderClass(org.z.compiler.c.File f, CompiledFile cf, org.z.lexer.grammar.Class c) throws CompilerException
	{
		this.cf = cf;
		
		// register class in library
		org.z.library.Class libClass = new org.z.library.Class(c.getFullName());
		f.getLibrary().registerClass(libClass);
		
		cf.appendContent("includes", "#ifndef _H_" + c.getFullName().replace('.', '_') + "\n");
		cf.appendContent("includes", "#define _H_" + c.getFullName().replace('.', '_') + " 1\n\n");
		cf.appendContent("includes", "#include \"library.h\"\n");
		// do not include Object on itself
		if(!c.getFullName().replace('.', '_').equals("java_lang_Object"))
			cf.appendContent("includes", "#include \"java_lang_Object.h\"\n");
		cf.setSectionOrder(new String[] { "includes", "body" });
		
		cf.appendContent("struct " + c.getFullName().replace('.', '_') + ";\n\n");
		
		cf.appendContent("struct " + c.getFullName().replace('.', '_') + " {\n");
		for(org.z.lexer.grammar.Method m : c.getBody().getMethods()) {
			cf.appendContent("\t" + jTags(m));
			
			// return type
			Type returnType = m.getReturnType();
			
			// null returnType means it must be a constructor
			if(returnType == null) {
				cf.appendContent("void (*" + m.getName());
			}
			else {
				returnType.resolveType(f);
				org.z.compiler.c.Type.register(returnType, cf, f);
				cf.appendContent(Method.getCType(returnType, "struct ") + " (*" + m.getName());
			}
			
			// method pointer
			for(org.z.lexer.grammar.Argument arg : m.getArguments()) {
				org.z.compiler.c.Type.register(arg.getType(), cf, f);
			}
			String sig = m.getArguments().getSignature(f.getCompiler());
			if(!sig.equals("")) {
				cf.appendContent("_" + sig);
			}
			cf.appendContent(")(");
			
			// arguments
			if(!m.isStatic()) {
				cf.appendContent(c.getFullName().replace('.', '_') + "*");
				if(!Method.getCTypes(m).equals("")) {
					cf.appendContent(", ");
				}
			}
			cf.appendContent(Method.getCTypes(m) + ");\n");
			
			// register method in library
			String methodReturnType = "";
			if(m.getReturnType() != null) {
				methodReturnType = m.getReturnType().toString();
			}
			libClass.addMethod(new org.z.library.Method(methodReturnType, m.getName(), m.getArguments().toString()));
		}
		cf.appendContent("};\n\n");
		
		// method prototypes
		for(org.z.lexer.grammar.Method m : c.getBody().getMethods()) {
			cf.appendContent(jTags(m));
			
			// null returnType means it must be a constructor
			if(m.getReturnType() == null)
				cf.appendContent("void ");
			else {
				org.z.compiler.c.Type.register(m.getReturnType(), cf, f);
				cf.appendContent(Method.getCType(m.getReturnType(), "struct ") + " ");
			}
			
			cf.appendContent(c.getFullName().replace('.', '_') + "_" + m.getName());
			String sig = m.getArguments().getSignature(f.getCompiler());
			if(!sig.equals(""))
				cf.appendContent("_" + sig);
			cf.appendContent("(");
			if(!m.isStatic()) {
				cf.appendContent(c.getFullName().replace('.', '_') + "*");
				if(!Method.getCTypes(m).equals(""))
					cf.appendContent(", ");
			}
			cf.appendContent(Method.getCTypes(m) + ");\n");
		}
		cf.appendContent("\n#endif\n");
	}
	
	public final String jTags(org.z.lexer.grammar.Method m)
	{
		String s = "";
		if(m.getPermission() != null && !m.getPermission().equals(""))
			s += "j" + m.getPermission() + " ";
		if(m.isFinal())
			s += "jfinal ";
		if(m.isStatic())
			s += "jstatic ";
		if(m.isNative())
			s += "jnative ";
		if(m.isSynchronized())
			s += "jsynchronized ";
		return s;
	}
	
}
