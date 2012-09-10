package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class Type
{
	
	private String base;
	
	private int depth = 0;
	
	private Generic generic = null;
	
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
		for(int i = 0; i < depth; ++i) {
			r += "[]";
		}
		return r;
	}
	
	public String getSignature()
	{
		if(toString().equals("boolean")) {
			return "Z";
		}
		if(toString().equals("byte")) {
			return "B";
		}
		if(toString().equals("char")) {
			return "C";
		}
		if(toString().equals("short")) {
			return "S";
		}
		if(toString().equals("int")) {
			return "I";
		}
		if(toString().equals("long")) {
			return "J";
		}
		if(toString().equals("float")) {
			return "F";
		}
		if(toString().equals("double")) {
			return "D";
		}
		
		return "L" + toString().replace('.', '_');
	}
	
	public static boolean isNativeType(String name)
	{
		if(name.equals("boolean") ||
			name.equals("byte") ||
			name.equals("int") ||
			name.equals("void") ||
			name.equals("float") ||
			name.equals("double") ||
			name.equals("char") ||
			name.equals("void") ||
			name.equals("long") ||
			name.equals("short")) {
			return true;
		}
		return false;
	}
	
	public Type resolveType(org.z.compiler.c.File f)
	{
		try {
			setBase(f.findClass(getBase()).getClassName());
		}
		catch(CompilerException ce) {
			ce.printStackTrace(System.err);
		}
		return this;
	}
	
}
