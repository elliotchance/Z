package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class EqualityExpression extends CompileEntity
{
	
	private org.z.lexer.grammar.EqualityExpression expression;
	
	private org.z.compiler.c.File f;
	
	public EqualityExpression(org.z.compiler.c.File f, org.z.lexer.grammar.EqualityExpression expression)
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
