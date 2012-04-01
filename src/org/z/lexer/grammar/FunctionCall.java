package org.z.lexer.grammar;

public class FunctionCall implements Expression
{
	
	private Expression expression;
	
	private ExpressionList arguments;

	public ExpressionList getArguments()
	{
		return arguments;
	}

	public void setArguments(ExpressionList arguments)
	{
		this.arguments = arguments;
	}

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
		String r = expression.toString();
		if(arguments != null)
			r += "(" + arguments.toString() + ")";
		return r;
	}
	
}
