package org.z.lexer.grammar;

import java.util.ArrayList;

public class Enum extends GenericObject
{
	
	protected ArrayList<EnumValue> values = new ArrayList<EnumValue>();
	
	protected Method constructor;
	
	protected ArrayList<VariableDefinitions> instanceVariables = new ArrayList<VariableDefinitions>();
	
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

	public Method getConstructor()
	{
		return constructor;
	}

	public void setConstructor(Method constructor)
	{
		this.constructor = constructor;
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
	
}
