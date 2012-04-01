package org.z.compiler;

public class CompiledFile
{
	
	private String fileName;
	
	private StringBuilder content;
	
	public CompiledFile(String fileName)
	{
		this(fileName, "");
	}

	public CompiledFile(String fileName, String content)
	{
		this.fileName = fileName;
		this.content = new StringBuilder(content);
	}

	public String getContent()
	{
		return content.toString();
	}

	public void setContent(String content)
	{
		this.content = new StringBuilder(content);
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
	
	public void appendContent(String str)
	{
		content.append(str);
	}
	
}
