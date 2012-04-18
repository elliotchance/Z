package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class LogicalOrExpression extends CompileEntity
{
	
	private org.z.lexer.grammar.LogicalOrExpression expression;
	
	private org.z.compiler.c.File f;
	
	public LogicalOrExpression(org.z.compiler.c.File f, org.z.lexer.grammar.LogicalOrExpression expression)
	{
		this.f = f;
		this.expression = expression;
	}
	
	@Override
	public String render() throws CompilerException
	{
		return renderBinary(f, expression);
	}
	
}
