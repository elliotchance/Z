package org.z.lexer.grammar;

public class GenericObject extends ComplexStatement
{
	
	protected String name = null;
	
	protected String permission = null;
	
	protected String packageName = null;

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		String[] parts = name.split("\\.");
		this.packageName = "";
		boolean first = true;
		for(int i = 0; i < parts.length - 1; ++i) {
			if(first)
				first = false;
			else
				this.packageName += ".";
			this.packageName += parts[i];
		}
		this.name = parts[parts.length - 1];
	}

	public String getPermission()
	{
		return permission;
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	public String getPackageName()
	{
		return packageName;
	}

	public void setPackageName(String packageName)
	{
		this.packageName = packageName;
	}

	public String getFullName()
	{
		String r = name;
		if(packageName != null && !packageName.equals(""))
			r = packageName + "." + name;
		return r;
	}
	
}
