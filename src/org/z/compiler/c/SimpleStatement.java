package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class SimpleStatement extends CompileEntity
{
	
	private org.z.lexer.grammar.SimpleStatement s;
	
	public SimpleStatement(org.z.lexer.grammar.SimpleStatement s)
	{
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		return new Expression(s.getExpression()).render();
	}
	
}
