package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class ThrowExpression extends Renderable implements Expression
{
	
	private Expression expression;

	public Expression getExpression()
	{
		return expression;
	}

	public void setExpression(Expression expression)
	{
		this.expression = expression;
	}

	@Override
	public String toString()
	{
		return "throw " + expression.toString();
	}

	@Override
	public String toString(int indent)
	{
		return indent(indent) + toString();
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
