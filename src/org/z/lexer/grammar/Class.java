package org.z.lexer.grammar;

import java.util.ArrayList;

public class Class extends GenericObject
{
	
	private boolean isFinal = false;
	
	private boolean isStatic = false;
	
	private boolean isAbstract = false;
	
	private Type extension = null;
	
	private ArrayList<Type> implementsList = new ArrayList<Type>();
	
	private Generic generic = null;
	
	private ClassBody body;

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
