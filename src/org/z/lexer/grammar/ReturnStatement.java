package org.z.lexer.grammar;

public class ReturnStatement extends SimpleStatement implements Renderable
{
	
	private Expression expression;

	@Override
	public Expression getExpression()
	{
		return expression;
	}

	@Override
	public void setExpression(Expression expression)
	{
		this.expression = expression;
	}

	@Override
	public String toString()
	{
		return "return " + expression.toString();
	}
	
}
