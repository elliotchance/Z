package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class SimpleStatement extends CompileEntity
{
	
	private org.z.lexer.grammar.SimpleStatement s;
	
	private org.z.compiler.c.File f;
	
	public SimpleStatement(org.z.compiler.c.File f, org.z.lexer.grammar.SimpleStatement s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		if(s instanceof org.z.lexer.grammar.ReturnStatement)
			return "return " + new Expression(f, s.getExpression()).render() + ";\n";
		
		// these take care of themselves
		if(s.getExpression() instanceof org.z.lexer.grammar.Expression)
			return new Expression(f, s.getExpression()).render();
		
		if(s.getExpression() == null)
			// throw new CompilerException("NULL expression for SimpleStatement");
			return "???";
		throw new EntityNotSupportedException(s.getExpression());
	}
	
}
