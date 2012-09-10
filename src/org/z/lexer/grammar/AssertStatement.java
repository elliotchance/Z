package org.z.lexer.grammar;

public class AssertStatement extends SimpleStatement
{
	
	private Expression expression;
	
	private Expression informationExpression;

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
		String r = "assert";
		if(expression != null)
			r += " " + expression.toString();
		return r;
	}

	@Override
	public String toString(int indent)
	{
		return indent(indent) + toString();
	}

	public Expression getInformationExpression()
	{
		return informationExpression;
	}

	public void setInformationExpression(Expression informationExpression)
	{
		this.informationExpression = informationExpression;
	}
	
}
