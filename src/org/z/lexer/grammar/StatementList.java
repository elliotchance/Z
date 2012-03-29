package org.z.lexer.grammar;

import java.util.ArrayList;

public class StatementList extends ArrayList<Statement> implements JavaRenderable
{

	@Override
	public String renderJava() throws Exception
	{
		StringBuilder r = new StringBuilder();
		for(Statement a : this) {
			r.append("\t\t");
			r.append(a.renderJava());
			r.append(";\n");
		}
		return r.toString();
	}
	
}
