package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class Expression extends CompileEntity
{
	
	private org.z.lexer.grammar.Expression s;
	
	public Expression(org.z.lexer.grammar.Expression s)
	{
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		if(s == null)
			throw new CompilerException("null expression.");
		if(s instanceof org.z.lexer.grammar.FunctionCall)
			return new FunctionCall((org.z.lexer.grammar.FunctionCall) s).render();
		if(s instanceof org.z.lexer.grammar.Value)
			return new Value((org.z.lexer.grammar.Value) s).render();
		if(s instanceof org.z.lexer.grammar.ObjectAccess)
			return new ObjectAccess((org.z.lexer.grammar.ObjectAccess) s).render();
		throw new EntityNotSupportedException(s);
	}
	
}
