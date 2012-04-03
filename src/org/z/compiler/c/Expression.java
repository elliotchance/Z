package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class Expression extends CompileEntity
{
	
	private org.z.lexer.grammar.Expression s;
	
	private org.z.compiler.c.Compiler c;
	
	public Expression(org.z.compiler.c.Compiler c, org.z.lexer.grammar.Expression s)
	{
		this.c = c;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		if(s == null)
			throw new CompilerException("null expression.");
		if(s instanceof org.z.lexer.grammar.FunctionCall)
			return new FunctionCall(c, (org.z.lexer.grammar.FunctionCall) s).render();
		if(s instanceof org.z.lexer.grammar.Value)
			return new Value((org.z.lexer.grammar.Value) s).render();
		if(s instanceof org.z.lexer.grammar.ObjectAccess)
			return new ObjectAccess(c, (org.z.lexer.grammar.ObjectAccess) s).render();
		throw new EntityNotSupportedException(s);
	}
	
}
