package org.z.lexer.grammar;

public class Argument implements Renderable
{
	
	private Type type;
	
	private String name;
	
	private boolean isFinal;

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
	public String toString()
	{
		return (isFinal ? "final " : "") + type.toString() + " " + name;
	}

	public boolean isIsFinal()
	{
		return isFinal;
	}

	public void setIsFinal(boolean isFinal)
	{
		this.isFinal = isFinal;
	}
	
}
