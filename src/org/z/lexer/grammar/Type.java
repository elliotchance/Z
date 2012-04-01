package org.z.lexer.grammar;

public class Type
{
	
	private String base;
	
	private int depth = 0;

	public String getBase()
	{
		return base;
	}

	public void setBase(String base)
	{
		this.base = base;
	}

	public int getDepth()
	{
		return depth;
	}

	public void setDepth(int depth)
	{
		this.depth = depth;
	}

	@Override
	public String toString()
	{
		String r = base;
		for(int i = 0; i < depth; ++i)
			r += "[]";
		return r;
	}
	
}