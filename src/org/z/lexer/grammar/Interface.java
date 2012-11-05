package org.z.lexer.grammar;

import java.util.ArrayList;

public class Interface extends GenericObject
{
	
	private ClassBody body;
	
	private Generic generic = null;
	
	private ArrayList<Type> extensions = new ArrayList<Type>();
    
    private boolean isStatic = false;

	public ClassBody getBody()
	{
		return body;
	}

	public void setBody(ClassBody body)
	{
		this.body = body;
	}

	public Generic getGeneric()
	{
		return generic;
	}

	public void setGeneric(Generic generic)
	{
		this.generic = generic;
	}

	public ArrayList<Type> getExtensions()
	{
		return extensions;
	}

	public void setExtensions(ArrayList<Type> extensions)
	{
		this.extensions = extensions;
	}
	
	public void addExtension(Type extension)
	{
		extensions.add(extension);
	}

    public boolean isStatic()
    {
        return isStatic;
    }

    public void setIsStatic(boolean isStatic)
    {
        this.isStatic = isStatic;
    }
	
}
