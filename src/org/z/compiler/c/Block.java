package org.z.compiler.c;

import org.z.compiler.CompilerException;

public class Block extends CompileEntity
{
	
	private org.z.lexer.grammar.Block s;
	
	private org.z.compiler.c.File f;
	
	public Block(org.z.compiler.c.File f, org.z.lexer.grammar.Block s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		StringBuilder sb = new StringBuilder();
		for(org.z.lexer.grammar.Statement st : s.getStatements()) {
			sb.append(new Statement(f, st).render());
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
