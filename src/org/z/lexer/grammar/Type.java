package org.z.lexer.grammar;

public class Type implements JavaRenderable
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
	public String renderJava() throws Exception
	{
		String r = base;
		for(int i = 0; i < depth; ++i)
			r += "[]";
		return r;
	}
	
}
