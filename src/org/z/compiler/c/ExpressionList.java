package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class ExpressionList extends CompileEntity
{
	
	private org.z.lexer.grammar.ExpressionList o;
	
	private org.z.compiler.c.File f;
	
	public ExpressionList(org.z.compiler.c.File f, org.z.lexer.grammar.ExpressionList o)
	{
		this.f = f;
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
			r.append(new Expression(f, e).render());
		}
		return r.toString();
	}
	
}
