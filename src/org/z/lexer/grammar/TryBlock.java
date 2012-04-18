package org.z.lexer.grammar;

import java.util.ArrayList;

public class TryBlock extends Block
{
	
	private Block block;
	
	private ArrayList<VariableDefinitions> variables = null;
	
	public void addVariable(VariableDefinitions variable)
	{
		if(variables == null)
			variables = new ArrayList<VariableDefinitions>();
		variables.add(variable);
	}

	public ArrayList<VariableDefinitions> getVariables()
	{
		return variables;
	}

	public void setVariables(ArrayList<VariableDefinitions> variables)
	{
		this.variables = variables;
	}

	public Block getBlock()
	{
		return block;
	}

	public void setBlock(Block block)
	{
		this.block = block;
	}
	
}
