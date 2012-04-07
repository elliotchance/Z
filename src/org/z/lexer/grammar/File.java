package org.z.lexer.grammar;

import java.util.ArrayList;

public class File implements Renderable
{
	
	private String fileName = null;
	
	private ArrayList<Class> classes = new ArrayList<Class>();
	
	private String packageName = null;
	
	private ArrayList<String> imports = new ArrayList<String>();
	
	public void addClass(Class c)
	{
		classes.add(c);
	}
	
	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		
		if(packageName != null)
			r.append("package " + packageName + ";\n\n");
		
		for(String importName : imports)
			r.append("import " + importName + ";\n");
		if(imports.size() > 0)
			r.append("\n");
		
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

	public String getPackageName()
	{
		return packageName;
	}

	public void setPackageName(String packageName)
	{
		this.packageName = packageName;
	}
	
	public void addImport(String importName)
	{
		imports.add(importName);
	}
	
}
