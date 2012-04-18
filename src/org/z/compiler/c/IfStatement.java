package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class IfStatement extends CompileEntity
{
	
	private org.z.lexer.grammar.IfStatement s;
	
	private org.z.compiler.c.File f;
	
	public IfStatement(org.z.compiler.c.File f, org.z.lexer.grammar.IfStatement s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		return "if(" + new Expression(f, s.getCondition()).render() + ") {\n" + new Block(f, s.getBlock()) + "}\n";
	}
	
}
