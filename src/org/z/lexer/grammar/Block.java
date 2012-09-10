package org.z.lexer.grammar;

import java.util.ArrayList;

public class Block extends ComplexStatement
{
	
	private ArrayList<Statement> statements = new ArrayList<Statement>();

	@Override
	public String toString(int indent)
	{
		StringBuilder r = new StringBuilder();
		for(Statement a : statements) {
			if(a != null) {
				r.append(a.toString(indent));
				r.append("\n");
			}
		}
		return r.toString();
	}

	public void setStatements(ArrayList<Statement> statements)
	{
		this.statements = statements;
	}
	
	public ArrayList<Statement> getStatements()
	{
		return statements;
	}
	
	public void add(Statement statement)
	{
		statements.add(statement);
	}
	
}
