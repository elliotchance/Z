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
		return a.getType().toString() + " " + a.getName();
	}
	
	public String getType()
	{
		return a.getType().toString();
	}
	
	public String getName()
	{
		return a.getName();
	}
	
}
