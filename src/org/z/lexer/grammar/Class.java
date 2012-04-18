package org.z.lexer.grammar;

import java.util.ArrayList;

public class Class extends ComplexStatement
{
	
	private String name = null;
	
	private String permission = null;
	
	private boolean isFinal = false;
	
	private boolean isStatic = false;
	
	private boolean isAbstract = false;
	
	private String packageName = null;
	
	private Type extension = null;
	
	private ArrayList<Type> implementsList = new ArrayList<Type>();
	
	private Generic generic = null;
	
	private ClassBody body;

	public String getPermission()
	{
		return permission;
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	public boolean isIsStatic()
	{
		return isStatic;
	}

	public void setIsStatic(boolean isStatic)
	{
		this.isStatic = isStatic;
	}

	public Generic getGeneric()
	{
		return generic;
	}

	public void setGeneric(Generic generic)
	{
		this.generic = generic;
	}
	
	public void addImplementation(Type imp)
	{
		implementsList.add(imp);
	}

	public ArrayList<Type> getImplementsList()
	{
		return implementsList;
	}

	public String getName()
	{
		return name;
	}

	public String getFullName()
	{
		String r = name;
		if(packageName != null && !packageName.equals(""))
			r = packageName + "." + name;
		return r;
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
	
	@Override
	public String toString(int indent)
	{
		StringBuilder r = new StringBuilder();
		r.append(indent(indent));
		r.append((permission != null ? permission + " " : ""));
		r.append((isFinal ? "final " : ""));
		r.append((isStatic ? "static " : ""));
		r.append((isAbstract ? "abstract " : ""));
		r.append("class ");
		r.append(name);
		r.append(" ");
		r.append(body.toString(indent));
		r.append("\n");
		return r.toString();
	}

	public boolean isFinal()
	{
		return isFinal;
	}

	public void setIsFinal(boolean isFinal)
	{
		this.isFinal = isFinal;
	}

	public String getPackageName()
	{
		return packageName;
	}

	public void setPackageName(String packageName)
	{
		this.packageName = packageName;
	}

	public ClassBody getBody()
	{
		return body;
	}

	public void setBody(ClassBody body)
	{
		this.body = body;
	}

	public Type getExtension()
	{
		return extension;
	}

	public void setExtension(Type extension)
	{
		this.extension = extension;
	}

	public boolean isAbstract()
	{
		return isAbstract;
	}

	public void setIsAbstract(boolean isAbstract)
	{
		this.isAbstract = isAbstract;
	}
	
}
