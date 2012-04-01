package org.z.compiler;

public class CompiledFile
{
	
	private String fileName;
	
	private String content;

	public CompiledFile(String fileName, String content)
	{
		this.fileName = fileName;
		this.content = content;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
	
}
