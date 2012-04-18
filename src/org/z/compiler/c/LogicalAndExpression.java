package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class LogicalAndExpression extends CompileEntity
{
	
	private org.z.lexer.grammar.LogicalAndExpression expression;
	
	private org.z.compiler.c.File f;
	
	public LogicalAndExpression(org.z.compiler.c.File f, org.z.lexer.grammar.LogicalAndExpression expression)
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
