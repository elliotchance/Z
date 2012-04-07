package org.z.lexer.grammar;

import java.util.ArrayList;

public class Block extends ArrayList<Statement> implements Renderable
{

	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		for(Statement a : this) {
			r.append("\t\t");
			r.append(a);
			r.append(";\n");
		}
		return r.toString();
	}
	
}
