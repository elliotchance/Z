package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class NullExpression implements Expression
{

	@Override
	public String toString()
	{
		return "null";
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		return new Type("java.lang.Object");
	}
	
}
