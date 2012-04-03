package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class SimpleStatement extends CompileEntity
{
	
	private org.z.lexer.grammar.SimpleStatement s;
	
	private org.z.compiler.c.Compiler c;
	
	public SimpleStatement(org.z.compiler.c.Compiler c, org.z.lexer.grammar.SimpleStatement s)
	{
		this.c = c;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		return new Expression(c, s.getExpression()).render();
	}
	
}
