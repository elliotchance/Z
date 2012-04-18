package org.z.lexer.grammar;

public class Varargs extends Argument
{

	public Varargs(Argument a)
	{
		this.type = a.type;
		this.name = a.name;
		this.isFinal = a.isFinal();
	}
	
}
