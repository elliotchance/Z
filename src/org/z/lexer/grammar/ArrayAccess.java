package org.z.lexer.grammar;

public class ArrayAccess extends BinaryExpression
{
	
	public ArrayAccess()
	{
	}
	
	public ArrayAccess(Expression left)
	{
		this.left = left;
	}
	
}
