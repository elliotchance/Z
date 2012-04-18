package org.z.lexer.grammar;

public class AnnotationKeyValue
{
	
	private String name;
	
	private Expression value;

	public AnnotationKeyValue(String name, Expression value)
	{
		this.name = name;
		this.value = value;
	}

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
	
}
