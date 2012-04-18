package org.z.lexer.grammar;

public class Argument
{
	
	protected Type type;
	
	protected String name;
	
	protected boolean isFinal;

	public Argument()
	{
	}

	public Argument(Type type, String name)
	{
		this.type = type;
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

	public boolean isFinal()
	{
		return isFinal;
	}

	public void setIsFinal(boolean isFinal)
	{
		this.isFinal = isFinal;
	}
	
	public Argument getAbsoluteType()
	{
		if(type.getBase().equals("String"))
			return new Argument(new Type("java.lang.String"), name);
		return this;
	}
	
}
