package org.z.lexer.grammar;

import java.util.ArrayList;

public class StatementList extends ArrayList<Statement>
{

	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		for(Statement a : this) {
			r.append("\t\t");
			r.append(a.toString());
			r.append(";\n");
		}
		return r.toString();
	}
	
}
