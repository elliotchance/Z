package org.z.compiler;

public class ClassPathItem
{
	
	private String location;
	
	private String base;

	public ClassPathItem(String location, String base)
	{
		this.location = location;
		this.base = base;
	}
	
	public String getRealLocation()
	{
		return location.substring(location.length() - base.length());
	}

	public String getBase()
	{
		return base;
	}

	public void setBase(String base)
	{
		this.base = base;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}
	
}
