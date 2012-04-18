package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class CastExpression implements Expression
{
	
	private Type type;
	
	private Expression expression;

	public Expression getExpression()
	{
		return expression;
	}

	public void setExpression(Expression expression)
	{
		this.expression = expression;
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
	public Type getDataType() throws CompilerException
	{
		throw new CompilerException("Not supported yet.");
	}
	
}
