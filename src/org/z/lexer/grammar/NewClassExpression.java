package org.z.lexer.grammar;

import org.z.compiler.CompilerException;

public class NewClassExpression extends NewExpression
{
	
	private ClassBody body;

	@Override
	public String toString()
	{
		String r = "new " + type.toString();
		if(body != null)
			r += body.toString();
		return r;
	}

	@Override
	public Type getDataType() throws CompilerException
	{
		return new Type("???");
		//throw new CompilerException("Not supported yet.");
	}

	public ClassBody getBody()
	{
		return body;
	}

	public void setBody(ClassBody body)
	{
		this.body = body;
	}
	
}
