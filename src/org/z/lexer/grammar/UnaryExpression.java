package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class UnaryExpression implements Expression
{
	
	private String operator = null;
	
	private Expression expression = null;
	
	private boolean isBefore = true;

	public UnaryExpression(Expression expression, String operator, boolean isBefore)
	{
		this.expression = expression;
		this.operator = operator;
		this.isBefore = isBefore;
	}

	public Expression getExpression()
	{
		return expression;
	}

	public void setExpression(Expression expression)
	{
		this.expression = expression;
	}

	public boolean isIsBefore()
	{
		return isBefore;
	}

	public void setIsBefore(boolean isBefore)
	{
		this.isBefore = isBefore;
	}

	public String getOperator()
	{
		return operator;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		return new Type("???");
		//throw new CompilerException("Not supported yet.");
	}

	@Override
	public String toString() {
		if(isBefore)
			return operator + expression;
		return expression + operator;
	}
	
}
