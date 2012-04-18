package org.z.lexer.grammar;

import java.util.ArrayList;
import org.z.compiler.CompilerException;

public class BinaryExpression extends Renderable implements Expression
{
	
	protected Expression left = null;
	
	protected ArrayList<Right> right = new ArrayList<Right>();
	
	public BinaryExpression()
	{
	}
	
	public BinaryExpression(Expression left, String op, Expression right)
	{
		this.left = left;
		this.right.add(new Right(op, right));
	}

	public Expression getLeft()
	{
		return left;
	}

	public void setLeft(Expression left)
	{
		this.left = left;
	}
	
	public void addRight(Right expr)
	{
		right.add(expr);
	}

	public ArrayList<Right> getRight()
	{
		return right;
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		if(right.isEmpty())
			return left.getDataType();
		return left.getDataType();
		//! throw new UnsupportedOperationException("Not supported yet.");
	}
	
	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		r.append(left);
		for(Right next : right) {
			r.append(" ");
			r.append(next.getOperator());
			r.append(" ");
			r.append(next.getExpression());
		}
		return r.toString();
	}
	
}
