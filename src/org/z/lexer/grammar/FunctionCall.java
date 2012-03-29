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
	public String renderJava() throws Exception
	{
		String r = expression.renderJava();
		if(arguments != null)
			r += "(" + arguments.renderJava() + ")";
		return r;
	}
	
}
