package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class SimpleStatement extends CompileEntity
{
	
	private org.z.lexer.grammar.SimpleStatement s;
	
	private org.z.compiler.c.File f;
	
	public SimpleStatement(org.z.compiler.c.File f, org.z.lexer.grammar.SimpleStatement s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		return new Expression(f, s.getExpression()).render();
	}
	
}
