package org.z.lexer.grammar;

import java.util.ArrayList;

public class ExpressionList extends ArrayList<Expression>
{

	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		boolean first = true;
		for(Expression a : this) {
			if(first)
				first = false;
			else
				r.append(", ");
			r.append(a.toString());
		}
		return r.toString();
	}
	
}
