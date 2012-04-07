package org.z.lexer.grammar;

import java.util.ArrayList;

public class ExceptionStatement implements ComplexStatement, Renderable
{
	
	private TryBlock tryBlock = null;
	
	private ArrayList<CatchBlock> catchBlocks = new ArrayList<CatchBlock>();
	
	private FinallyBlock finallyBlock = null;

	public ArrayList<CatchBlock> getCatchBlocks()
	{
		return catchBlocks;
	}

	public void setCatchBlocks(ArrayList<CatchBlock> catchBlocks)
	{
		this.catchBlocks = catchBlocks;
	}
	
	public void addCatchBlock(CatchBlock catchBlock)
	{
		catchBlocks.add(catchBlock);
	}

	public FinallyBlock getFinallyBlock()
	{
		return finallyBlock;
	}

	public void setFinallyBlock(FinallyBlock finallyBlock)
	{
		this.finallyBlock = finallyBlock;
	}

	public TryBlock getTryBlock()
	{
		return tryBlock;
	}

	public void setTryBlock(TryBlock tryBlock)
	{
		this.tryBlock = tryBlock;
	}
	
}
