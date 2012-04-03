package org.z.lexer.grammar;

import java.util.ArrayList;

public class ObjectAccess implements BinaryExpression
{
	
	private Expression left;
	
	private ArrayList<Identifier> accessors = new ArrayList<Identifier>();

	public Expression getLeft()
	{
		return left;
	}

	public void setLeft(Expression left)
	{
		this.left = left;
	}

	public ArrayList<Identifier> getAccessors()
	{
		return accessors;
	}

	public void setAccessors(ArrayList<Identifier> accessors)
	{
		this.accessors = accessors;
	}
	
	public void addAccessor(Identifier accessor)
	{
		accessors.add(accessor);
	}

	@Override
	public String toString()
	{
		String r = (left == null ? "null" : left.toString());
		for(Identifier accessor : accessors)
			r += "." + accessor.toString();
		return r;
	}
	
}
