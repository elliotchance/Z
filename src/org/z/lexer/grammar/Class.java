package org.z.lexer.grammar;

import java.util.ArrayList;

public class Class implements Renderable
{
	
	private String name = null;
	
	private boolean isPublic = false;
	
	private boolean isFinal = false;
	
	private ArrayList<Method> methods = new ArrayList<Method>();
	
	private ArrayList<InstanceVariable> instanceVariables = new ArrayList<InstanceVariable>();
	
	private Block staticBlock = null;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isIsPublic()
	{
		return isPublic;
	}

	public void setIsPublic(boolean isPublic)
	{
		this.isPublic = isPublic;
	}
	
	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		r.append((isPublic ? "public " : ""));
		r.append((isFinal ? "final " : ""));
		r.append("class ");
		r.append(name);
		r.append(" {");
		
		if(staticBlock != null) {
			r.append("\tstatic {\n");
			r.append(staticBlock.toString());
			r.append("\t}\n");
		}
		
		for(InstanceVariable iv : instanceVariables) {
			r.append("\t");
			r.append(iv.toString());
			r.append("\n");
		}
		if(instanceVariables.size() > 0)
			r.append("\n");
		
		for(Method m : methods) {
			r.append("\n");
			r.append(m.toString());
			r.append("\n");
		}
		
		r.append("}\n");
		return r.toString();
	}
	
	public void addMethod(Method m)
	{
		methods.add(m);
	}

	public ArrayList<Method> getMethods()
	{
		return methods;
	}

	public boolean isFinal()
	{
		return isFinal;
	}

	public void setIsFinal(boolean isFinal)
	{
		this.isFinal = isFinal;
	}
	
	public void addInstanceVariable(InstanceVariable iv)
	{
		instanceVariables.add(iv);
	}

	public Block getStaticBlock()
	{
		return staticBlock;
	}

	public void setStaticBlock(Block staticBlock)
	{
		this.staticBlock = staticBlock;
	}
	
}
