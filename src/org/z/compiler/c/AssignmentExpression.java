package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class AssignmentExpression extends CompileEntity
{
	
	private org.z.lexer.grammar.AssignmentExpression expression;
	
	private org.z.compiler.c.File f;
	
	public AssignmentExpression(org.z.compiler.c.File f, org.z.lexer.grammar.AssignmentExpression expression)
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
