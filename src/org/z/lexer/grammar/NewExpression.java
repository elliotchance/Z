package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class NewExpression implements Expression
{
	
	protected Type type;
	
	protected ExpressionList arguments;

	public ExpressionList getArguments()
	{
		return arguments;
	}

	public void setArguments(ExpressionList arguments)
	{
		this.arguments = arguments;
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
		String r = "new " + type.toString();
		return r;
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		throw new CompilerException("Not supported yet.");
	}
	
}
