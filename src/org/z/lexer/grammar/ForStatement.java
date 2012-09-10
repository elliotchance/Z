package org.z.lexer.grammar;

public class ForStatement extends ComplexStatement
{
	
	private SimpleStatement before;
	
	private Expression condition;
	
	private ExpressionList iterate;
	
	private Block block = new Block();

	public SimpleStatement getBefore()
	{
		return before;
	}

	public void setBefore(SimpleStatement before)
	{
		this.before = before;
	}

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

	public ExpressionList getIterate()
	{
		return iterate;
	}

	public void setIterate(ExpressionList iterate)
	{
		this.iterate = iterate;
	}

	@Override
	public String toString(int indent)
	{
		String r = indent(indent) + "for(";
		if(before != null)
			r += before.toString();
		r += "; ";
		if(condition != null)
			r += condition.toString();
		r += "; ";
		if(iterate != null)
			r += iterate.toString();
		r += ") {\n" + block.toString(indent + 1) + indent(indent) + "}\n";
		return r;
	}
	
}
