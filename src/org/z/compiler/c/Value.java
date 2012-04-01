package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class Value extends CompileEntity
{
	
	private org.z.lexer.grammar.Value o;
	
	public Value(org.z.lexer.grammar.Value o)
	{
		this.o = o;
	}

	@Override
	public String render() throws CompilerException
	{
		if(o.getValue() instanceof String)
			return "String_new(" + o.getValue().toString() + ")";
		return o.getValue().toString();
	}
	
}
