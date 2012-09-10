package org.z.lexer.grammar;

import java.util.ArrayList;

public class VariableDefinitions extends SimpleStatement implements Annotatable
{
	
	private Type type;
	
	private boolean isFinal = false;
	
	private String permission;
	
	private boolean isStatic;
	
	private boolean isVolatile;
	
	private boolean isTransient;
	
	private ArrayList<VariableDefinitionBase> variables = new ArrayList<VariableDefinitionBase>();
	
	private ArrayList<Annotation> annotations = new ArrayList<Annotation>();
	
	public void addVariable(VariableDefinitionBase v)
	{
		variables.add(v);
	}

	public Type getType()
	{
		return type;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

	public boolean isFinal()
	{
		return isFinal;
	}

	public void setIsFinal(boolean isFinal)
	{
		this.isFinal = isFinal;
	}

	public ArrayList<VariableDefinitionBase> getVariables()
	{
		return variables;
	}

	public void setVariables(ArrayList<VariableDefinitionBase> variables)
	{
		this.variables = variables;
	}

	public boolean isIsTransient()
	{
		return isTransient;
	}

	public void setIsTransient(boolean isTransient)
	{
		this.isTransient = isTransient;
	}

	public boolean isIsStatic()
	{
		return isStatic;
	}

	public void setIsStatic(boolean isStatic)
	{
		this.isStatic = isStatic;
	}

	public String getPermission()
	{
		return permission;
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	public boolean isVolatile()
	{
		return isVolatile;
	}

	public void setIsVolatile(boolean isVolatile)
	{
		this.isVolatile = isVolatile;
	}

	@Override
	public void addAnnotation(Annotation anno)
	{
		annotations.add(anno);
	}

	@Override
	public ArrayList<Annotation> getAnnotations()
	{
		return annotations;
	}
	
}
