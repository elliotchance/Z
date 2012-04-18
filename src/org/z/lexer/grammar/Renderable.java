package org.z.lexer.grammar;

public class Renderable
{
	
	public String toString(int indent)
	{
		String[] lines = toString().split("\n");
		StringBuilder sb = new StringBuilder();
		for(String line : lines) {
			sb.append(indent(indent));
			sb.append(line);
			sb.append("\n");
		}
		String r = sb.toString();
		return r.substring(0, r.length() - 1);
	}
	
	public String indent(int indent)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < indent; ++i)
			sb.append("    ");
		return sb.toString();
	}
	
}
