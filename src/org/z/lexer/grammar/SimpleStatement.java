package org.z.lexer.grammar;

public class SimpleStatement extends Statement
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
	public String toString(int indent)
	{
		if(expression == null)
			return "???";
		return indent(indent) + expression.toString() + ";";
	}
	
}
