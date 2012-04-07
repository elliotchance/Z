package org.z.lexer.grammar;

import java.util.ArrayList;
import org.z.compiler.CompilerException;

public class ExpressionList extends ArrayList<Expression> implements Renderable
{

	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		boolean first = true;
		for(Expression a : this) {
			if(first)
				first = false;
			else
				r.append(", ");
			r.append(a.toString());
		}
		return r.toString();
	}
	
	public Type[] getDataTypes() throws CompilerException
	{
		Type[] types = new Type[size()];
		int i = 0;
		for(Expression e : this)
			types[i++] = e.getDataType();
		return types;
	}
	
	public String getSignature() throws CompilerException
	{
		String signature = "";
		for(Type type : getDataTypes())
			signature += type.getSignature();
		return signature;
	}
	
}
