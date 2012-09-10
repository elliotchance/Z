package org.z.lexer.grammar;

import java.util.ArrayList;

public class ClassBody extends Renderable
{
	
	private ArrayList<Method> methods = new ArrayList<Method>();
	
	private ArrayList<VariableDefinitions> instanceVariables = new ArrayList<VariableDefinitions>();
	
	private Block staticBlock = null;
	
	private ArrayList<GenericObject> objects = new ArrayList<GenericObject>();
	
	public void addObject(GenericObject c)
	{
		objects.add(c);
	}

	public ArrayList<GenericObject> getObjects()
	{
		return objects;
	}

	public void setObjects(ArrayList<GenericObject> objects)
	{
		this.objects = objects;
	}

	public ArrayList<Method> getMethods()
	{
		return methods;
	}

	public void setMethods(ArrayList<Method> methods)
	{
		this.methods = methods;
	}

	public Block getStaticBlock()
	{
		return staticBlock;
	}

	public void setStaticBlock(Block staticBlock)
	{
		this.staticBlock = staticBlock;
	}
	
	public void addMethod(Method m)
	{
		methods.add(m);
	}
	
	public void addInstanceVariable(VariableDefinitions iv)
	{
		instanceVariables.add(iv);
	}

	public ArrayList<VariableDefinitions> getInstanceVariables()
	{
		return instanceVariables;
	}

	public void setInstanceVariables(ArrayList<VariableDefinitions> instanceVariables)
	{
		this.instanceVariables = instanceVariables;
	}
	
	@Override
	public String toString(int indent)
	{
		StringBuilder r = new StringBuilder();
		r.append("{");
		
		if(staticBlock != null) {
			r.append(indent(indent + 1));
			r.append("static {\n");
			r.append(staticBlock.toString(indent + 1));
			r.append(indent(indent + 1));
			r.append("}\n");
		}
		
		for(VariableDefinitions iv : instanceVariables) {
			r.append(iv.toString(indent + 1));
			r.append("\n");
		}
		if(instanceVariables.size() > 0)
			r.append("\n");
		
		for(Method m : methods) {
			r.append("\n");
			r.append(m.toString(indent + 1));
			r.append("\n");
		}
		
		r.append("}\n");
		return r.toString();
	}
	
}
