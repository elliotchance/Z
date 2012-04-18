package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class ComplexStatement extends CompileEntity
{
	
	private org.z.lexer.grammar.ComplexStatement s;
	
	private org.z.compiler.c.File f;
	
	public ComplexStatement(org.z.compiler.c.File f, org.z.lexer.grammar.ComplexStatement s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		if(s instanceof org.z.lexer.grammar.IfStatement)
			return new IfStatement(f, (org.z.lexer.grammar.IfStatement) s).render();
		if(s instanceof org.z.lexer.grammar.ForStatement)
			return new ForStatement(f, (org.z.lexer.grammar.ForStatement) s).render();
		if(s instanceof org.z.lexer.grammar.WhileStatement)
			return new WhileStatement(f, (org.z.lexer.grammar.WhileStatement) s).render();
		
		return "???";
		//throw new EntityNotSupportedException(s);
	}
	
}
