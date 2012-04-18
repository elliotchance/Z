package org.z.lexer.grammar;

import java.util.ArrayList;

public class ArgumentList extends ArrayList<Argument>
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
			if(a.getType().toString().equals("boolean"))
				r += "Z";
			else if(a.getType().toString().equals("byte"))
				r += "B";
			else if(a.getType().toString().equals("char"))
				r += "C";
			else if(a.getType().toString().equals("short"))
				r += "S";
			else if(a.getType().toString().equals("int"))
				r += "I";
			else if(a.getType().toString().equals("long"))
				r += "J";
			else if(a.getType().toString().equals("float"))
				r += "F";
			else if(a.getType().toString().equals("double"))
				r += "D";
			else
				r += "L" + a.getAbsoluteType().getType().toString().replace('.', '_');
		}
		return r;
	}
	
}
