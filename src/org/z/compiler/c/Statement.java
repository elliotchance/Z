package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class Statement extends CompileEntity
{
	
	private org.z.lexer.grammar.Statement s;
	
	private org.z.compiler.c.File f;
	
	public Statement(org.z.compiler.c.File f, org.z.lexer.grammar.Statement s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		if(s == null)
			return "";
		if(s instanceof org.z.lexer.grammar.SimpleStatement)
			return new SimpleStatement(f, (org.z.lexer.grammar.SimpleStatement) s).render();
		throw new EntityNotSupportedException(s);
	}
	
}
