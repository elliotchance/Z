package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class Argument extends CompileEntity
{
	
	private org.z.lexer.grammar.Argument a;
	
	public Argument(org.z.lexer.grammar.Argument a)
	{
		this.a = a;
	}

	@Override
	public String render() throws CompilerException
	{
		return "int" /*a.getType().toString()*/ + " " + a.getName();
	}
	
}
