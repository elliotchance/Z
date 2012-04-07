package org.z.lexer.grammar;

import java.util.ArrayList;
import org.z.compiler.CompilerException;

public class ObjectAccess extends BinaryExpression implements Renderable
{

	@Override
	public String toString()
	{
		String r = (left == null ? "null" : left.toString());
		for(Right singleRight : right)
			r += singleRight.getOperator() + singleRight.getExpression().toString();
		return r;
	}
	
	@Override
	public Type getDataType() throws CompilerException
	{
		return left.getDataType();
		//throw new CompilerException("Not supported: " + toString());
	}
	
}
