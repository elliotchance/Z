package org.z.lexer.grammar;

import java.util.ArrayList;

public class Type
{
	
	private String base;
	
	private int depth = 0;
	
	private Generic generic = null;
	
	public static ArrayList<String> javaLangClasses = null;
	
	public Type()
	{
		this.base = null;
	}
	
	public Type(String base)
	{
		this.base = base;
	}
	
	public Type(String base, int depth, Generic generic)
	{
		this.base = base;
		this.depth = depth;
		this.generic = generic;
	}
	
	private void loadJavaLangClasses(org.z.compiler.Compiler c)
	{
		String[] files = new java.io.File(c.getLibraryLocation() + "/java/lang").list();
		javaLangClasses = new ArrayList<String>();
		for(String file : files) {
			if(file.startsWith(".") || !file.endsWith(".java"))
				continue;
			javaLangClasses.add(file.substring(0, file.length() - 5));
		}
	}

	public Generic getGeneric()
	{
		return generic;
	}

	public void setGeneric(Generic generic)
	{
		this.generic = generic;
	}

	public String getBase()
	{
		return base;
	}

	public void setBase(String base)
	{
		this.base = base;
	}

	public int getDepth()
	{
		return depth;
	}

	public void setDepth(int depth)
	{
		this.depth = depth;
	}

	@Override
	public String toString()
	{
		String r = base;
		for(int i = 0; i < depth; ++i)
			r += "[]";
		return r;
	}
	
	public String getSignature()
	{
		if(toString().equals("float"))
			return "F";
		return "L"; // + toString() + ";";
	}
	
	public static boolean isNativeType(String name)
	{
		if(name.equals("boolean") ||
			name.equals("byte") ||
			name.equals("int") ||
			name.equals("void") ||
			name.equals("float") ||
			name.equals("double") ||
			name.equals("char"))
			return true;
		return false;
	}
	
	public Type getAbsoluteType(org.z.compiler.Compiler c)
	{
		if(javaLangClasses == null)
			loadJavaLangClasses(c);
		
		// check java.lang.*
		for(String cl : javaLangClasses) {
			if(base.equals(cl))
				return new Type("java.lang." + base, depth, generic);
		}
		return this;
	}
	
}
