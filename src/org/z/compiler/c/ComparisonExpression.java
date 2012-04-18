package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class ComparisonExpression extends CompileEntity
{
	
	private org.z.lexer.grammar.ComparisonExpression expression;
	
	private org.z.compiler.c.File f;
	
	public ComparisonExpression(org.z.compiler.c.File f, org.z.lexer.grammar.ComparisonExpression expression)
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
