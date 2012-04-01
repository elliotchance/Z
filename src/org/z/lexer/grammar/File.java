package org.z.lexer.grammar;

import java.util.ArrayList;

public class File
{
	
	private String fileName = null;
	
	private ArrayList<Class> classes = new ArrayList<Class>();
	
	public void addClass(Class c)
	{
		classes.add(c);
	}
	
	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		for(Class c : classes)
			r.append(c.toString());
		return r.toString();
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public ArrayList<Class> getClasses()
	{
		return classes;
	}
	
}
