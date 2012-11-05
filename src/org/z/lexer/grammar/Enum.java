package org.z.lexer.grammar;

import java.util.ArrayList;

public class Enum extends GenericObject
{
	
	protected ArrayList<EnumValue> values = new ArrayList<EnumValue>();
	
	protected ArrayList<VariableDefinitions> instanceVariables = new ArrayList<VariableDefinitions>();
	
	private ArrayList<Method> methods = new ArrayList<Method>();
    
    private boolean isStatic = false;
	
	private Block staticBlock = null;
	
	public void addValue(EnumValue ev)
	{
		values.add(ev);
	}

	public ArrayList<EnumValue> getValues()
	{
		return values;
	}

	public void setValues(ArrayList<EnumValue> values)
	{
		this.values = values;
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

    public ArrayList<Method> getMethods()
    {
        return methods;
    }

    public void setMethods(ArrayList<Method> methods)
    {
        this.methods = methods;
    }
    
    public void addMethod(Method method)
    {
        methods.add(method);
    }

    public boolean isStatic()
    {
        return isStatic;
    }

    public void setIsStatic(boolean isStatic)
    {
        this.isStatic = isStatic;
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
