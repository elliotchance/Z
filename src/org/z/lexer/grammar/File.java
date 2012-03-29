package org.z.lexer.grammar;

import java.util.ArrayList;

public class File implements JavaRenderable
{
	
	private ArrayList<Class> classes = new ArrayList<Class>();
	
	public void addClass(Class c)
	{
		classes.add(c);
	}
	
	@Override
	public String renderJava() throws Exception
	{
		StringBuilder r = new StringBuilder();
		for(Class c : classes)
			r.append(c.renderJava());
		return r.toString();
	}
	
}
