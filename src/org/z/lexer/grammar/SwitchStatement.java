package org.z.lexer.grammar;

import java.util.ArrayList;

public class SwitchStatement extends ComplexStatement
{
	
	private Expression condition;
	
	private ArrayList<CaseStatement> cases = new ArrayList<CaseStatement>();
	
	private Block defaultCase = null;

	public Block getDefaultCase()
	{
		return defaultCase;
	}

	public void setDefaultCase(Block defaultCase)
	{
		this.defaultCase = defaultCase;
	}
	
	public void addCase(CaseStatement cs)
	{
		cases.add(cs);
	}

	public ArrayList<CaseStatement> getCases()
	{
		return cases;
	}

	public void setCases(ArrayList<CaseStatement> cases)
	{
		this.cases = cases;
	}

	public Expression getCondition()
	{
		return condition;
	}

	public void setCondition(Expression condition)
	{
		this.condition = condition;
	}
	
}
