package org.z.compiler;

public class TypeResolution
{
	
	protected String className;
	
	protected String fileLocation;

	public TypeResolution(String className, String fileLocation)
	{
		this.className = className;
		this.fileLocation = fileLocation;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public String getFileLocation()
	{
		return fileLocation;
	}

	public void setFileLocation(String fileLocation)
	{
		this.fileLocation = fileLocation;
	}
	
}
