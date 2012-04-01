package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class ObjectAccess extends CompileEntity
{
	
	private org.z.lexer.grammar.ObjectAccess o;
	
	public ObjectAccess(org.z.lexer.grammar.ObjectAccess o)
	{
		this.o = o;
	}

	@Override
	public String render() throws CompilerException
	{
		String r = new Expression(o.getLeft()).render();
		if(o.getRight() != null)
			r += "->" + new Expression(o.getRight()).render();
		return r;
	}
	
}
