package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class ComparisonExpression extends CompileEntity
{
	
	private org.z.lexer.grammar.ComparisonExpression comparisonExpression;
	
	private org.z.compiler.c.File f;
	
	public ComparisonExpression(org.z.compiler.c.File f, org.z.lexer.grammar.ComparisonExpression comparisonExpression)
	{
		this.f = f;
		this.comparisonExpression = comparisonExpression;
	}
	
	@Override
	public String render() throws CompilerException
	{
		if(comparisonExpression.getRight().isEmpty())
			return new Expression(f, comparisonExpression.getLeft()).render();
		throw new CompilerException("Todo");
		//return comparisonExpression.toString();
	}
	
}
