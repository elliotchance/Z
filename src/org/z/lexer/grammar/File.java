package org.z.lexer.grammar;

import java.util.ArrayList;

public class File extends Renderable
{
	
	private String fileName = null;
	
	private ArrayList<Class> classes = new ArrayList<Class>();
	
	private ArrayList<Interface> interfaces = new ArrayList<Interface>();
	
	private String packageName = null;
	
	private ArrayList<String> imports = new ArrayList<String>();
	
	public void addInterface(Interface i)
	{
		interfaces.add(i);
	}
	
	public void addClass(Class c)
	{
		classes.add(c);
	}

	public ArrayList<String> getImports()
	{
		return imports;
	}

	public void setImports(ArrayList<String> imports)
	{
		this.imports = imports;
	}

	public ArrayList<Interface> getInterfaces()
	{
		return interfaces;
	}

	public void setInterfaces(ArrayList<Interface> interfaces)
	{
		this.interfaces = interfaces;
	}
	
	@Override
	public String toString(int indent)
	{
		StringBuilder r = new StringBuilder();
		
		if(packageName != null) {
			r.append(indent(indent));
			r.append("package " + packageName + ";\n\n");
		}
		
		for(String importName : imports) {
			r.append(indent(indent));
			r.append("import " + importName + ";\n");
		}
		if(imports.size() > 0)
			r.append("\n");
		
		for(Class c : classes)
			r.append(c.toString(indent));
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
