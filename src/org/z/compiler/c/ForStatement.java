package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class ForStatement extends CompileEntity
{
	
	private org.z.lexer.grammar.ForStatement s;
	
	private org.z.compiler.c.File f;
	
	public ForStatement(org.z.compiler.c.File f, org.z.lexer.grammar.ForStatement s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		return "???"; //for(" + new Expression(f, s.getCondition()).render() + ") {\n" + new Block(f, s.getBlock()) + "}\n";
	}
	
}
