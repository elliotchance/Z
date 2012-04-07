package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;

public class Method extends CompileEntity
{
	
	public Method(org.z.compiler.c.File f, CompiledFile cf, org.z.lexer.grammar.Class c,
		org.z.lexer.grammar.Method m) throws CompilerException
	{
		//if(m.isStatic())
		//	cf.appendContent("static ");
		cf.appendContent(m.getReturnType().toString() + " ");
		cf.appendContent(c.getName() + "_" + m.getName() + "(");
		for(org.z.lexer.grammar.Argument a : m.getArguments())
			cf.appendContent(new Argument(a).render());
		cf.appendContent(") {\n");
		for(org.z.lexer.grammar.Statement s : m.getBlock())
			cf.appendContent("\t" + new Statement(f, s).render() + ";\n");
		cf.appendContent("}\n");
	}
	
}
