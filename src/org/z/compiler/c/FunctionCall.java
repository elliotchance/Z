package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class FunctionCall extends CompileEntity
{
	
	private org.z.lexer.grammar.FunctionCall s;
	
	private org.z.compiler.c.File f;
	
	public FunctionCall(org.z.compiler.c.File f, org.z.lexer.grammar.FunctionCall s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		// if arguments is null this isn't really a function call
		if(s.getArguments() == null)
			return new Expression(f, s.getExpression()).render();
		
		String r = new Expression(f, s.getExpression()).render();
		
		String sig = s.getArguments().getSignature();
		if(!sig.equals(""))
			sig = "_" + sig;
		r += sig + "(" + new ExpressionList(f, s.getArguments()).render() + ")";
		
		return r;
	}
	
}
