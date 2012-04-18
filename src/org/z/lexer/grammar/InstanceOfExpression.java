package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class InstanceOfExpression implements Expression
{
	
	private Expression left;
	
	private Type right;

	public InstanceOfExpression()
	{
	}

	public InstanceOfExpression(Expression left)
	{
		this.left = left;
	}

	public Expression getLeft()
	{
		return left;
	}

	public void setLeft(Expression left)
	{
		this.left = left;
	}

	public Type getRight()
	{
		return right;
	}

	public void setRight(Type right)
	{
		this.right = right;
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		throw new CompilerException("Not supported yet.");
	}
	
}
