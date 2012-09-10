package org.z.lexer.grammar;

import java.util.ArrayList;

public class CatchBlock extends Block
{
	
	private ArrayList<String> exceptionClasses = new ArrayList<String>();
	
	private String exceptionVariable;
	
	private Block block = new Block();

	public ArrayList<String> getExceptionClasses()
	{
		return exceptionClasses;
	}

	public void setExceptionClasses(ArrayList<String> exceptionClasses)
	{
		this.exceptionClasses = exceptionClasses;
	}

	public void addExceptionClass(String exceptionClass)
	{
		exceptionClasses.add(exceptionClass);
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
