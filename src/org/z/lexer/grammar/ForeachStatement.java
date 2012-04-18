package org.z.lexer.grammar;

public class ForeachStatement extends ComplexStatement
{
	
	private Type type;
	
	private String var;
	
	private Expression array;
	
	private Block block = new Block();

	public Expression getArray()
	{
		return array;
	}

	public void setArray(Expression array)
	{
		this.array = array;
	}

	public Block getBlock()
	{
		return block;
	}

	public void setBlock(Block block)
	{
		this.block = block;
	}

	public Type getType()
	{
		return type;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

	public String getVar()
	{
		return var;
	}

	public void setVar(String var)
	{
		this.var = var;
	}

	@Override
	public String toString(int indent)
	{
		String r = indent(indent) + "for(" + type.toString() + " " + var + " : " +
			array.toString() + ") {\n" + block.toString(indent + 1) + indent(indent) + "}\n";
		return r;
	}
	
}
