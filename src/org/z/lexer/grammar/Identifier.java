package org.z.lexer.grammar;

public class Identifier implements Expression
{
	
	private String identifier;
	
	public Identifier(String identifier)
	{
		this.identifier = identifier;
	}

	@Override
	public String renderJava() throws Exception
	{
		return identifier;
	}
	
}
