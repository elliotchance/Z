package org.z.lexer.grammar;

import java.util.ArrayList;

public class Generic
{
	
	private ArrayList<Type> types = new ArrayList<Type>();

	public Generic()
	{
	}

	public Generic(Type type)
	{
		this.types = new ArrayList<Type>();
		this.types.add(type);
	}

	public ArrayList<Type> getTypes()
	{
		return types;
	}

	public void setTypes(ArrayList<Type> types)
	{
		this.types = types;
	}
	
	public void addType(Type type)
	{
		this.types.add(type);
	}
	
}
