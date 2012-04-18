package org.z.lexer.grammar;

public class AdditionExpression extends BinaryExpression
{
	
	public AdditionExpression()
	{
		super();
	}
	
	public AdditionExpression(Expression left, String op, Expression right)
	{
		super(left, op, right);
	}
	
}
