package org.z.lexer.grammar;

import java.util.ArrayList;

public class ExpressionList extends ArrayList<Expression> implements JavaRenderable
{

	@Override
	public String renderJava() throws Exception
	{
		StringBuilder r = new StringBuilder();
		boolean first = true;
		for(Expression a : this) {
			if(first)
				first = false;
			else
				r.append(", ");
			r.append(a.renderJava());
		}
		return r.toString();
	}
	
}
