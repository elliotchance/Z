package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.lexer.grammar.Right;

public class ObjectAccess extends CompileEntity
{
	
	private org.z.lexer.grammar.ObjectAccess o;
	
	private org.z.compiler.c.File f;
	
	public ObjectAccess(org.z.compiler.c.File f, org.z.lexer.grammar.ObjectAccess o)
	{
		this.f = f;
		this.o = o;
	}

	@Override
	public String render() throws CompilerException
	{
		if(o.getRight().isEmpty())
			return new Expression(f, o.getLeft()).render();
		
		ResolvedType leftType = f.resolveType(o.getLeft().toString());
		String r;
		if(leftType.getType().equals("class")) {
			r = leftType.getCode();
			for(Right singleRight : o.getRight())
				r += "->" + new Expression(f, singleRight.getExpression()).render();
			return r;
		}
		else
			throw new CompilerException("Unknown entity type " + leftType.getType());
	}
	
}
