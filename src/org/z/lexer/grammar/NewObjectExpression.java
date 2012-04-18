package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class NewObjectExpression extends NewExpression
{
	
	private ArrayValue value;
	
	private Expression length;

	public Expression getLength()
	{
		return length;
	}

	public void setLength(Expression length)
	{
		this.length = length;
	}

	public ArrayValue getValue()
	{
		return value;
	}

	public void setValue(ArrayValue value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		String r = "new " + type.toString();
		if(arguments != null)
			r += "(" + arguments.toString() + ")";
		return r;
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		return new Type("???");
		//throw new CompilerException("Not supported yet.");
	}
	
}
