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
	
	public String getSignature()
	{
		String r = "";
		for(Argument a : this) {
			if(a.getType().toString().equals("int"))
				r += "I";
			else
				r += "L" + a.getAbsoluteType().getType().toString().replace('.', '_');
		}
		return r;
	}
	
}
