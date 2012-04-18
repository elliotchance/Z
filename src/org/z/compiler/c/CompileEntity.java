package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.lexer.grammar.BinaryExpression;
import org.z.lexer.grammar.Right;

public class CompileEntity
{
	
	public String render() throws CompilerException
	{
		throw new CompilerException("Not implemented.");
	}
	
	public String renderBinary(File f, BinaryExpression ex) throws CompilerException
	{
		StringBuilder sb = new StringBuilder(new Expression(f, ex.getLeft()).render());
		
		if(ex.getRight().isEmpty())
			return sb.toString();
		
		for(Right right : ex.getRight()) {
			sb.append(" ");
			sb.append(right.getOperator());
			sb.append(" ");
			sb.append(right.getExpression());
		}
		return sb.toString();
	}
	
}
