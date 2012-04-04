package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public interface Expression
{
	
	public Type getDataType() throws CompilerException;
	
}
