package org.z.lexer.grammar;

public class Value implements UnaryExpression
{
	
	private Object value;

	public Object getValue()
	{
		return value;
	}

	public void setValue(Object value)
	{
		this.value = value;
	}

	@Override
	public String renderJava() throws Exception
	{
		return value.toString();
	}
	
}
