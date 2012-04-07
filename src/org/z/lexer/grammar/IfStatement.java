package org.z.lexer.grammar;

public class IfStatement implements ComplexStatement, Renderable
{
	
	private Expression condition;
	
	private Block block = new Block();

	public Block getBlock()
	{
		return block;
	}

	public void setBlock(Block block)
	{
		this.block = block;
	}

	public Expression getCondition()
	{
		return condition;
	}

	public void setCondition(Expression condition)
	{
		this.condition = condition;
	}

	@Override
	public String toString()
	{
		return "if(" + condition.toString() + ") { " + block.toString() + "}\n";
	}
	
}
