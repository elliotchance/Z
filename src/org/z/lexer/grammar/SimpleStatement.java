package org.z.lexer.grammar;

public class SimpleStatement implements Statement, Renderable
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
		return expression.toString();
	}
	
}
