package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class Identifier implements Expression, Renderable
{
	
	private String identifier;
	
	public Identifier(String identifier)
	{
		this.identifier = identifier;
	}

	@Override
	public String toString()
	{
		return identifier;
	}
	
	@Override
	public Type getDataType() throws CompilerException
	{
		throw new CompilerException("Not supported.");
	}
	
}
