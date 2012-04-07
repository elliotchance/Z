package org.z.lexer.grammar;

public class Right implements Renderable
{
	
	private String operator;
	
	private Expression expression;

	public Right(String operator, Expression expression)
	{
		this.operator = operator;
		this.expression = expression;
	}

	public Expression getExpression()
	{
		return expression;
	}

	public void setExpression(Expression expression)
	{
		this.expression = expression;
	}

	public String getOperator()
	{
		return operator;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
	}
	
}
