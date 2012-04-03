package org.z.library;

public class Method
{
	
	private String name;
	
	private String returnType;
	
	private String args;
	
	public Method(String returnType, String name, String args)
	{
		this.returnType = returnType;
		this.name = name;
		this.args = args;
	}

	@Override
	public String toString()
	{
		return name + "(" + args + ") : " + returnType;
	}

	public String getArgs()
	{
		return args;
	}

	public void setArgs(String args)
	{
		this.args = args;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getReturnType()
	{
		return returnType;
	}

	public void setReturnType(String returnType)
	{
		this.returnType = returnType;
	}
	
}
