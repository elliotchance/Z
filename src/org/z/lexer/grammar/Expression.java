package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public interface Expression extends Renderable
{
	
	public Type getDataType() throws CompilerException;
	
}
