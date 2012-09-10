package org.z.lexer.grammar;

import java.util.ArrayList;

public class File extends Renderable
{
	
	private String fileName = null;
	
	private ArrayList<GenericObject> objects = new ArrayList<GenericObject>();
	
	private String packageName = null;
	
	private ArrayList<String> imports = new ArrayList<String>();
	
	private static org.z.compiler.c.File file = null;

	public static org.z.compiler.c.File GetFile()
	{
		return file;
	}

	public static void SetFile(org.z.compiler.c.File file)
	{
		File.file = file;
	}
	
	public void addObject(GenericObject c)
	{
		objects.add(c);
	}

	public ArrayList<String> getImports()
	{
		return imports;
	}

	public void setImports(ArrayList<String> imports)
	{
		this.imports = imports;
	}

	public ArrayList<GenericObject> getObjects()
	{
		return objects;
	}
	
	@Override
	public String toString(int indent)
	{
		StringBuilder r = new StringBuilder();
		
		if(packageName != null) {
			r.append(indent(indent));
			r.append("package ");
			r.append(packageName);
			r.append(";\n\n");
		}
		
		for(String importName : imports) {
			r.append(indent(indent));
			r.append("import ");
			r.append(importName);
			r.append(";\n");
		}
		if(imports.size() > 0)
			r.append("\n");
		
		for(GenericObject c : objects)
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
