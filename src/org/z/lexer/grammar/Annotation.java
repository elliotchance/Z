package org.z.lexer.grammar;

import java.util.ArrayList;

public class Annotation
{
	
	private String name;
	
	private ArrayList<AnnotationKeyValue> values = null;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public ArrayList<AnnotationKeyValue> getValues()
	{
		return values;
	}

	public void setValues(ArrayList<AnnotationKeyValue> values)
	{
		this.values = values;
	}
	
	public void addKeyValue(AnnotationKeyValue kv)
	{
		if(values == null)
			values = new ArrayList<AnnotationKeyValue>();
		values.add(kv);
	}
	
}
