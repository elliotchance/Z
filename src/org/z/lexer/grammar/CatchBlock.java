package org.z.lexer.grammar;

public class CatchBlock extends Block
{
	
	private String exceptionClass;
	
	private String exceptionVariable;
	
	private Block block = new Block();

	public String getExceptionClass()
	{
		return exceptionClass;
	}

	public void setExceptionClass(String exceptionClass)
	{
		this.exceptionClass = exceptionClass;
	}

	public String getExceptionVariable()
	{
		return exceptionVariable;
	}

	public void setExceptionVariable(String exceptionVariable)
	{
		this.exceptionVariable = exceptionVariable;
	}

	public Block getBlock()
	{
		return block;
	}

	public void setBlock(Block statements)
	{
		this.block = statements;
	}
	
}
