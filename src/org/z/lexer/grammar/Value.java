package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class Value implements UnaryExpression, Renderable
{
	
	private Object value;
	
	public Value()
	{
		this.value = null;
	}
	
	public Value(Object value)
	{
		this.value = value;
	}

	public Object getValue()
	{
		return value;
	}

	public void setValue(Object value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return value.toString();
	}
	
	@Override
	public Type getDataType() throws CompilerException
	{
		if(value instanceof String)
			return new Type("String");
		if(value instanceof Float)
			return new Type("float");
		throw new CompilerException("Unknown object type: " + value.getClass());
	}
	
}
