package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class GroupOperator implements Expression
{
	
	private Expression expression = null;

	public Expression getExpression()
	{
		return expression;
	}

	public void setExpression(Expression expression)
	{
		this.expression = expression;
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		return new Type("???");
		//throw new CompilerException("Not supported yet.");
	}

	@Override
	public String toString()
	{
		return "(" + expression.toString() + ")";
	}
	
}
