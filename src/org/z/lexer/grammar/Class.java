package org.z.lexer.grammar;

import java.util.ArrayList;

public class Class
{
	
	private String name = null;
	
	private boolean isPublic = false;
	
	private ArrayList<Method> methods = new ArrayList<Method>();

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isIsPublic()
	{
		return isPublic;
	}

	public void setIsPublic(boolean isPublic)
	{
		this.isPublic = isPublic;
	}
	
	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		r.append((isPublic ? "public " : ""));
		r.append("class ");
		r.append(name);
		r.append(" {");
		
		for(Method m : methods) {
			r.append("\n");
			r.append(m.toString());
			r.append("\n");
		}
		
		r.append("}\n");
		return r.toString();
	}
	
	public void addMethod(Method m)
	{
		methods.add(m);
	}

	public ArrayList<Method> getMethods()
	{
		return methods;
	}
	
}
