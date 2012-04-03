package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.lexer.grammar.Identifier;

public class ObjectAccess extends CompileEntity
{
	
	private org.z.lexer.grammar.ObjectAccess o;
	
	private org.z.compiler.c.Compiler c;
	
	public ObjectAccess(org.z.compiler.c.Compiler c, org.z.lexer.grammar.ObjectAccess o)
	{
		this.c = c;
		this.o = o;
	}

	@Override
	public String render() throws CompilerException
	{
		//System.out.println(o.getLeft().getClass());
		ResolvedType leftType = c.resolveType(o.getLeft().toString());
		String r = "";
		if(leftType.getType().equals("class")) {
			r = leftType.getCode();
			for(Identifier v : o.getAccessors())
				r += "->" + v.toString();
			return r;
		}
		else
			throw new CompilerException("Unknown entity type " + leftType.getType());
	}
	
}
