package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;

public class HeaderClass extends CompileEntity
{
	
	public HeaderClass(org.z.compiler.c.File f, CompiledFile cf, org.z.lexer.grammar.Class c) throws CompilerException
	{
		// register class in library
		org.z.library.Class libClass = new org.z.library.Class(c.getFullName());
		f.getLibrary().registerClass(libClass);
		
		cf.appendContent("#include \"library.h\"\n\n");
		
		cf.appendContent("typedef struct {\n");
		for(org.z.lexer.grammar.Method m : c.getMethods()) {
			cf.appendContent("\t" + m.getReturnType().toString() + " (*" + m.getName() + "_" + m.getArguments().getSignature() + ")(" + Method.getCTypes(m) + ");\n");
			
			// register method in library
			libClass.addMethod(new org.z.library.Method(m.getReturnType().toString(), m.getName(), m.getArguments().toString()));
		}
		cf.appendContent("} " + c.getFullName().replace('.', '_') + ";\n\n");
		
		// method prototypes
		for(org.z.lexer.grammar.Method m : c.getMethods())
			cf.appendContent(m.getReturnType().toString() + " " + c.getFullName().replace('.', '_') + "_" + m.getName() + "_" + m.getArguments().getSignature() + "(" + Method.getCTypes(m) + ");\n");
	}
	
}
