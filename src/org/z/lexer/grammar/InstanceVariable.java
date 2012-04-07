package org.z.lexer.grammar;

public class InstanceVariable implements Renderable
{
	
	private String name;
	
	private String permission;
	
	private boolean isStatic;
	
	private boolean isFinal;
	
	private boolean isVolatile;
	
	private SimpleStatement statement;
	
	private Type type;

	public boolean isIsFinal()
	{
		return isFinal;
	}

	public void setIsFinal(boolean isFinal)
	{
		this.isFinal = isFinal;
	}

	public boolean isIsStatic()
	{
		return isStatic;
	}

	public void setIsStatic(boolean isStatic)
	{
		this.isStatic = isStatic;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPermission()
	{
		return permission;
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	public SimpleStatement getStatement()
	{
		return statement;
	}

	public void setStatement(SimpleStatement statement)
	{
		this.statement = statement;
	}

	public Type getType()
	{
		return type;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

	public boolean isVolatile()
	{
		return isVolatile;
	}

	public void setIsVolatile(boolean isVolatile)
	{
		this.isVolatile = isVolatile;
	}
	
}
