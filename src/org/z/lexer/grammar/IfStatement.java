package org.z.lexer.grammar;

public class IfStatement extends ComplexStatement
{
	
	private Expression condition;
	
	private Block block = new Block();
	
	private Block elseBlock = null;

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

	public Block getElseBlock()
	{
		return elseBlock;
	}

	public void setElseBlock(Block elseBlock)
	{
		this.elseBlock = elseBlock;
	}

	@Override
	public String toString(int indent)
	{
		String r = indent(indent) + "if(" + condition.toString() + ") {\n" + block.toString(indent + 1) +
			indent(indent) + "}\n";
		if(elseBlock != null)
			r += indent(indent) + "else {\n" + block.toString(indent + 1) + indent(indent) + "}\n";
		return r;
	}
	
}
