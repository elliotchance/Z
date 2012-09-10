package org.z.lexer.grammar;

public class EnumValue
{
	
	protected String name;
	
	protected Expression value;
	
	protected ExpressionList arguments;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Expression getValue()
	{
		return value;
	}

	public void setValue(Expression value)
	{
		this.value = value;
	}

	public ExpressionList getArguments()
	{
		return arguments;
	}

	public void setArguments(ExpressionList arguments)
	{
		this.arguments = arguments;
	}
	
}
