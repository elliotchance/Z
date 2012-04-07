package org.z.lexer.grammar;

import java.util.ArrayList;

public class ArgumentList extends ArrayList<Argument> implements Renderable
{

	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		boolean first = true;
		for(Argument a : this) {
			if(first)
				first = false;
			else
				r.append(", ");
			r.append(a.toString());
		}
		return r.toString();
	}
	
}
