package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.lexer.grammar.Type;

public class HeaderClass extends CompileEntity
{
	
	public HeaderClass(org.z.compiler.c.File f, CompiledFile cf, org.z.lexer.grammar.Class c) throws CompilerException
	{
		// register class in library
		org.z.library.Class libClass = new org.z.library.Class(c.getFullName());
		f.getLibrary().registerClass(libClass);
		
		cf.appendContent("#include \"library.h\"\n\n");
		
		cf.appendContent("struct _" + c.getFullName().replace('.', '_') + ";\n\n");
		
		cf.appendContent("typedef struct _" + c.getFullName().replace('.', '_') + " {\n");
		for(org.z.lexer.grammar.Method m : c.getBody().getMethods()) {
			cf.appendContent("\t" + jTags(m));
			
			Type returnType = m.getReturnType();
			if(returnType != null && !Type.isNativeType(returnType.getBase()))
				f.addImport(returnType.getAbsoluteType(f.getCompiler()).getBase());
			cf.appendContent(Method.getCType(returnType, "struct _") + " (*" + m.getName());
			String sig = m.getArguments().getSignature();
			if(!sig.equals(""))
				cf.appendContent("_" + m.getArguments().getSignature());
			cf.appendContent(")(");
			if(!m.isStatic()) {
				cf.appendContent(c.getFullName().replace('.', '_') + "*");
				if(!Method.getCTypes(m).equals(""))
					cf.appendContent(", ");
			}
			cf.appendContent(Method.getCTypes(m) + ");\n");
			
			// register method in library
			String methodReturnType = "";
			if(m.getReturnType() != null)
				methodReturnType = m.getReturnType().toString();
			libClass.addMethod(new org.z.library.Method(methodReturnType, m.getName(), m.getArguments().toString()));
		}
		cf.appendContent("} " + c.getFullName().replace('.', '_') + ";\n\n");
		
		// method prototypes
		for(org.z.lexer.grammar.Method m : c.getBody().getMethods()) {
			cf.appendContent(jTags(m) + Method.getCType(m.getReturnType(), "struct _") + " " + c.getFullName().replace('.', '_') + "_" + m.getName());
			String sig = m.getArguments().getSignature();
			if(!sig.equals(""))
				cf.appendContent("_" + m.getArguments().getSignature());
			cf.appendContent("(");
			if(!m.isStatic()) {
				cf.appendContent(c.getFullName().replace('.', '_') + "*");
				if(!Method.getCTypes(m).equals(""))
					cf.appendContent(", ");
			}
			cf.appendContent(Method.getCTypes(m) + ");\n");
		}
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
