package org.z.lexer.grammar;

import java.util.ArrayList;

public class Method implements Renderable
{
	
	private String name;
	
	private boolean isStatic = false;
	
	private boolean isFinal = false;
	
	private boolean isNative = false;
	
	private boolean isSynchronized = false;
	
	private String permission = null;
	
	private Type returnType = null;
	
	private Block block = null;
	
	private ArgumentList arguments = null;
	
	private boolean hasBody = false;
	
	private ArrayList<String> throwList = new ArrayList<String>();
	
	public void addThrows(String throwClass)
	{
		throwList.add(throwClass);
	}

	public ArgumentList getArguments()
	{
		return arguments;
	}

	public void setArguments(ArgumentList arguments)
	{
		this.arguments = arguments;
	}

	public Block getBlock()
	{
		return block;
	}

	public void setBlock(Block block)
	{
		this.block = block;
	}

	public Type getReturnType()
	{
		return returnType;
	}

	public void setReturnType(Type returnType)
	{
		this.returnType = returnType;
	}

	public boolean isStatic()
	{
		return isStatic;
	}

	public void setIsStatic(boolean isStatic)
	{
		this.isStatic = isStatic;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPermission()
	{
		return permission;
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder("\t");
		if(permission != null) {
			r.append(permission);
			r.append(" ");
		}
		
		if(isStatic)
			r.append("static ");
		if(isFinal)
			r.append("final ");
		if(isNative)
			r.append("native ");
		
		r.append(returnType.toString());
		r.append(" ");
		r.append(name);
		r.append("(");
		r.append(arguments.toString());
		r.append(")");
		
		if(!throwList.isEmpty()) {
			r.append(" throws ");
			boolean first = true;
			for(String th : throwList) {
				if(first)
					first = false;
				else
					r.append(", ");
				r.append(th);
			}
		}
		
		if(hasBody) {
			r.append(" {\n");
			r.append(block.toString());
			r.append("\t}");
		}
		else
			r.append(";");
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

	public boolean isNative()
	{
		return isNative;
	}

	public void setIsNative(boolean isNative)
	{
		this.isNative = isNative;
	}

	public boolean hasBody()
	{
		return hasBody;
	}

	public void setHasBody(boolean hasBody)
	{
		this.hasBody = hasBody;
	}

	public boolean isSynchronized()
	{
		return isSynchronized;
	}

	public void setIsSynchronized(boolean isSynchronized)
	{
		this.isSynchronized = isSynchronized;
	}
	
}
