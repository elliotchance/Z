package org.z.lexer.grammar;

public class ObjectAccess implements BinaryExpression
{
	
	private Expression left;
	
	private Expression right;

	public Expression getLeft()
	{
		return left;
	}

	public void setLeft(Expression left)
	{
		this.left = left;
	}

	public Expression getRight()
	{
		return right;
	}

	public void setRight(Expression right)
	{
		this.right = right;
	}

	@Override
	public String toString()
	{
		String r = (left == null ? "null" : left.toString());
		if(right != null)
			r += "." + (right == null ? "null" : right.toString());
		return r;
	}
	
}