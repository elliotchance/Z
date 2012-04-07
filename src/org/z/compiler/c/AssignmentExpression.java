package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class AssignmentExpression extends CompileEntity
{
	
	private org.z.lexer.grammar.AssignmentExpression assignmentExpression;
	
	private org.z.compiler.c.File f;
	
	public AssignmentExpression(org.z.compiler.c.File f, org.z.lexer.grammar.AssignmentExpression assignmentExpression)
	{
		this.f = f;
		this.assignmentExpression = assignmentExpression;
	}
	
	@Override
	public String render() throws CompilerException
	{
		if(assignmentExpression.getRight().isEmpty())
			return new Expression(f, assignmentExpression.getLeft()).render();
		throw new CompilerException("Todo");
		//return comparisonExpression.toString();
	}
	
}
