package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class Value implements Expression
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
			return new Type("java.lang.String");
		if(value instanceof Float)
			return new Type("float");
		if(value instanceof Integer)
			return new Type("int");
		if(value instanceof Boolean)
			return new Type("boolean");
		if(value instanceof Character)
			return new Type("char");
		if(value instanceof Double)
			return new Type("double");
		if(value instanceof Long)
			return new Type("long");
		
		if(value instanceof Identifier) {
			//throw new CompilerException("Unknown identifier: " + value.toString());
			return new Type("void");
		}
		
		throw new CompilerException("Unknown object type: " + value.getClass());
	}
	
}
