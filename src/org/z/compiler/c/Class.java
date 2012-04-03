package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;

public class Class extends CompileEntity
{
	
	public Class(org.z.compiler.c.Compiler comp, CompiledFile cf, org.z.lexer.grammar.Class c) throws CompilerException
	{
		for(org.z.lexer.grammar.Method m : c.getMethods())
			new Method(comp, cf, c, m);
	}
	
}
