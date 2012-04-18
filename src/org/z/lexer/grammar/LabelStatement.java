package org.z.lexer.grammar;

public class LabelStatement extends SimpleStatement
{
	
	private String name;

	public LabelStatement(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}
