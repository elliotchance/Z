package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.lexer.grammar.Type;

public class FunctionCall extends CompileEntity
{
	
	private org.z.lexer.grammar.FunctionCall s;
	
	private org.z.compiler.c.Compiler c;
	
	public FunctionCall(org.z.compiler.c.Compiler c, org.z.lexer.grammar.FunctionCall s)
	{
		this.c = c;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		String r = new Expression(c, s.getExpression()).render();
		
		// if arguments is null this isn't really a function call
		if(s.getArguments() != null) {
			String sig = s.getArguments().getSignature();
			if(!sig.equals(""))
				sig = "_" + sig;
			r += sig + "(" + new ExpressionList(c, s.getArguments()).render() + ")";
		}
		
		return r;
	}
	
}
