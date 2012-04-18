package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class AdditionExpression extends CompileEntity
{
	
	private org.z.lexer.grammar.AdditionExpression expression;
	
	private org.z.compiler.c.File f;
	
	public AdditionExpression(org.z.compiler.c.File f, org.z.lexer.grammar.AdditionExpression expression)
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
