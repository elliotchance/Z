package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class FunctionCall extends CompileEntity
{
	
	private org.z.lexer.grammar.FunctionCall s;
	
	public FunctionCall(org.z.lexer.grammar.FunctionCall s)
	{
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		String r = new Expression(s.getExpression()).render();
		
		// if arguments is null this isn't really a function call
		if(s.getArguments() != null)
			r += "(" + new ExpressionList(s.getArguments()).render() + ")";
		
		return r;
	}
	
}
