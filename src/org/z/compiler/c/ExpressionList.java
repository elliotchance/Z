package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class ExpressionList extends CompileEntity
{
	
	private org.z.lexer.grammar.ExpressionList o;
	
	private org.z.compiler.c.Compiler c;
	
	public ExpressionList(org.z.compiler.c.Compiler c, org.z.lexer.grammar.ExpressionList o)
	{
		this.c = c;
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
			r.append(new Expression(c, e).render());
		}
		return r.toString();
	}
	
}
