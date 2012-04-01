package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class ExpressionList extends CompileEntity
{
	
	private org.z.lexer.grammar.ExpressionList o;
	
	public ExpressionList(org.z.lexer.grammar.ExpressionList o)
	{
		this.o = o;
	}

	@Override
	public String render() throws CompilerException
	{
		StringBuilder r = new StringBuilder();
		boolean first = true;
		for(org.z.lexer.grammar.Expression e : o) {
			if(first)
				first = false;
			else
				r.append(", ");
			r.append(new Expression(e).render());
		}
		return r.toString();
	}
	
}
