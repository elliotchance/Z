package org.z.lexer.grammar;

public class ReturnStatement extends SimpleStatement
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
		String r = "return";
		if(expression != null)
			r += " " + expression.toString();
		return r;
	}

	@Override
	public String toString(int indent)
	{
		return indent(indent) + toString();
	}
	
}
