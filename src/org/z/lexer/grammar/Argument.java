package org.z.lexer.grammar;

public class Argument implements JavaRenderable
{
	
	private Type type;
	
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Type getType()
	{
		return type;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

	@Override
	public String renderJava() throws Exception
	{
		return type.renderJava() + " " + name;
	}
	
}
