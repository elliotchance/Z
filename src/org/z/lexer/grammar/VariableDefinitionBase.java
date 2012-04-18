package org.z.lexer.grammar;

public class VariableDefinitionBase
{
	
	private String name;
	
	private Expression defaultValue = null;
	
	private int addDepth = 0;
	
	public int incrementAddDepth()
	{
		return ++addDepth;
	}

	public int getAddDepth()
	{
		return addDepth;
	}

	public void setAddDepth(int addDepth)
	{
		this.addDepth = addDepth;
	}

	public Expression getDefaultValue()
	{
		return defaultValue;
	}

	public void setDefaultValue(Expression defaultValue)
	{
		this.defaultValue = defaultValue;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}
