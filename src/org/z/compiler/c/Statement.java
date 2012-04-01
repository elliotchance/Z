package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class Statement extends CompileEntity
{
	
	private org.z.lexer.grammar.Statement s;
	
	public Statement(org.z.lexer.grammar.Statement s)
	{
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		if(s instanceof org.z.lexer.grammar.SimpleStatement)
			return new SimpleStatement((org.z.lexer.grammar.SimpleStatement) s).render();
		throw new EntityNotSupportedException(s);
	}
	
}
