package org.z.lexer.grammar;

public class Method
{
	
	private String name;
	
	private boolean isStatic = false;
	
	private String permission = null;
	
	private Type returnType = null;
	
	private StatementList statements = null;
	
	private ArgumentList arguments = null;

	public ArgumentList getArguments()
	{
		return arguments;
	}

	public void setArguments(ArgumentList arguments)
	{
		this.arguments = arguments;
	}

	public StatementList getStatements()
	{
		return statements;
	}

	public void setStatements(StatementList statements)
	{
		this.statements = statements;
	}

	public Type getReturnType()
	{
		return returnType;
	}

	public void setReturnType(Type returnType)
	{
		this.returnType = returnType;
	}

	public boolean isStatic()
	{
		return isStatic;
	}

	public void setIsStatic(boolean isStatic)
	{
		this.isStatic = isStatic;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPermission()
	{
		return permission;
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder("\t");
		if(permission != null) {
			r.append(permission);
			r.append(" ");
		}
		if(isStatic)
			r.append("static ");
		r.append(returnType.toString());
		r.append(" ");
		r.append(name);
		r.append("(");
		r.append(arguments.toString());
		r.append(") {\n");
		r.append(statements.toString());
		r.append("\t}");
		return r.toString();
	}
	
}
