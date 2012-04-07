package org.z.lexer.grammar;

public class SynchronizedStatement implements Statement, Renderable
{
	
	private Expression expression;
	
	private Block block;

	public Expression getExpression()
	{
		return expression;
	}

	public void setExpression(Expression expression)
	{
		this.expression = expression;
	}

	public Block getBlock()
	{
		return block;
	}

	public void setBlock(Block block)
	{
		this.block = block;
	}
	
}
