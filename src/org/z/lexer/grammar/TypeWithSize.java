package org.z.lexer.grammar;

import java.util.ArrayList;

public class TypeWithSize extends Type
{
	
	private ArrayList<Expression> sizes = new ArrayList<Expression>();
	
	public void addSize(Expression size)
	{
		sizes.add(size);
	}

	public ArrayList<Expression> getSizes()
	{
		return sizes;
	}

	public void setSizes(ArrayList<Expression> sizes)
	{
		this.sizes = sizes;
	}
	
}
