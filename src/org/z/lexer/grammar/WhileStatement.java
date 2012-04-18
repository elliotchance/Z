package org.z.lexer.grammar;

public class WhileStatement extends ComplexStatement
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
	public String toString(int indent)
	{
		String r = indent(indent) + "while(" + condition.toString() + ") {\n" +
			block.toString(indent + 1) + indent(indent) + "}\n";
		return r;
	}
	
}
