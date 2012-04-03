package org.z.compiler.c;

public class ResolvedType
{
	
	private String type;
	
	private String code;
	
	public ResolvedType(String type, String code)
	{
		this.type = type;
		this.code = code;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	
}
