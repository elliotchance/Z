package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class GroupOperator extends CompileEntity
{
	
	private org.z.lexer.grammar.GroupOperator expression;
	
	private org.z.compiler.c.File f;
	
	public GroupOperator(org.z.compiler.c.File f, org.z.lexer.grammar.GroupOperator expression)
	{
		this.f = f;
		this.expression = expression;
	}
	
	@Override
	public String render() throws CompilerException
	{
		return "(" + new Expression(f, expression.getExpression()).render() + ")";
	}
	
}
