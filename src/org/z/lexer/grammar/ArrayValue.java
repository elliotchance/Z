package org.z.lexer.grammar;

import java.util.ArrayList;

public class ArrayValue extends Value
{
	
	private ArrayList<Expression> values = new ArrayList<Expression>();
	
	public void addValue(Expression e)
	{
		values.add(e);
	}

	public ArrayList<Expression> getValues()
	{
		return values;
	}

	public void setValues(ArrayList<Expression> values)
	{
		this.values = values;
	}
	
}
