package org.z.compiler.c;

import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;

public class Expression extends CompileEntity
{
	
	private org.z.lexer.grammar.Expression s;
	
	private org.z.compiler.c.File f;
	
	public Expression(org.z.compiler.c.File f, org.z.lexer.grammar.Expression s)
	{
		this.f = f;
		this.s = s;
	}

	@Override
	public String render() throws CompilerException
	{
		if(s instanceof org.z.lexer.grammar.FunctionCall)
			return new FunctionCall(f, (org.z.lexer.grammar.FunctionCall) s).render();
		if(s instanceof org.z.lexer.grammar.Value)
			return new Value((org.z.lexer.grammar.Value) s).render();
		if(s instanceof org.z.lexer.grammar.ObjectAccess)
			return new ObjectAccess(f, (org.z.lexer.grammar.ObjectAccess) s).render();
		if(s instanceof org.z.lexer.grammar.ComparisonExpression)
			return new ComparisonExpression(f, (org.z.lexer.grammar.ComparisonExpression) s).render();
		if(s instanceof org.z.lexer.grammar.AssignmentExpression)
			return new AssignmentExpression(f, (org.z.lexer.grammar.AssignmentExpression) s).render();
		if(s instanceof org.z.lexer.grammar.LogicalOrExpression)
			return new LogicalOrExpression(f, (org.z.lexer.grammar.LogicalOrExpression) s).render();
		if(s instanceof org.z.lexer.grammar.LogicalAndExpression)
			return new LogicalAndExpression(f, (org.z.lexer.grammar.LogicalAndExpression) s).render();
		if(s instanceof org.z.lexer.grammar.EqualityExpression)
			return new EqualityExpression(f, (org.z.lexer.grammar.EqualityExpression) s).render();
		if(s instanceof org.z.lexer.grammar.AdditionExpression)
			return new AdditionExpression(f, (org.z.lexer.grammar.AdditionExpression) s).render();
		if(s instanceof org.z.lexer.grammar.GroupOperator)
			return new GroupOperator(f, (org.z.lexer.grammar.GroupOperator) s).render();
		if(s instanceof org.z.lexer.grammar.ThisExpression)
			return "this";
		return "???";
		//throw new EntityNotSupportedException(s);
	}
	
}
