package org.z.library;

import java.util.ArrayList;

public class Class
{
	
	private String name;
	
	private ArrayList<Variable> variables = new ArrayList<Variable>();
	
	private ArrayList<Method> methods = new ArrayList<Method>();
	
	public Class(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return toString(0);
	}
	
	public String toString(int indent)
	{
		String r = Library.getIndent(indent) + name;
		for(Variable v : variables)
			r += "\n" + Library.getIndent(indent + 1) + v.toString();
		for(Method m : methods)
			r += "\n" + Library.getIndent(indent + 1) + m.toString();
		return r;
	}
	
	public Class addVariable(Variable v)
	{
		variables.add(v);
		return this;
	}
	
	public Class addMethod(Method m)
	{
		methods.add(m);
		return this;
	}
	
}
