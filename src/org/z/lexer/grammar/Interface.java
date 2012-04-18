package org.z.lexer.grammar;

public class Interface
{
	
	private String name;
	
	private String permission = null;
	
	private ClassBody body;

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

	public ClassBody getBody()
	{
		return body;
	}

	public void setBody(ClassBody body)
	{
		this.body = body;
	}
	
}
