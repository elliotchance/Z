package org.z.compiler;

import java.util.HashMap;

public class CompiledFile
{
	
	protected String fileName;
	
	protected HashMap<String, StringBuilder> content = new HashMap<String, StringBuilder>();
	
	protected String[] sectionOrder = new String[] { "body" };

	public String[] getSectionOrder()
	{
		return sectionOrder;
	}

	public void setSectionOrder(String[] sectionOrder)
	{
		this.sectionOrder = sectionOrder;
	}
	
	public CompiledFile(String fileName)
	{
		this(fileName, "");
		init("");
	}

	public CompiledFile(String fileName, String content)
	{
		this.fileName = fileName;
		init(content);
	}
	
	private void init(String initContent)
	{
		content = new HashMap<String, StringBuilder>();
		content.put("body", new StringBuilder(initContent));
	}

	public String getContent()
	{
		StringBuilder sb = new StringBuilder();
		for(String section : sectionOrder) {
			sb.append(content.get(section).toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public void setContent(String section, String content)
	{
		this.content.put(section, new StringBuilder(content));
	}

	public void setContent(String content)
	{
		setContent("body", content);
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
	
	public void appendUniqueLine(String section, String str)
	{
		if(!content.containsKey(section)) {
			content.put(section, new StringBuilder(str));
		}
		
		for(String line : content.get(section).toString().split("\n")) {
			if(line.equals(str)) {
				return;
			}
		}
		content.get(section).append(str + "\n");
	}
	
	public void appendContent(String section, String str)
	{
		if(!content.containsKey(section)) {
			content.put(section, new StringBuilder(str));
		}
		else {
			content.get(section).append(str);
		}
	}
	
	public void appendContent(String str)
	{
		appendContent("body", str);
	}
	
	public void addInclude(org.z.lexer.grammar.Type type)
	{
		//if(!(type.getBase().replace('.', '_') + ".h").equals(getFileName())) {
			appendUniqueLine("includes", "#include \"" + type.toString().replace('.', '_') + ".h\"");
		//}
	}
	
}
