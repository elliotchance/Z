package org.z.lexer.grammar;

import java.util.ArrayList;

public interface Annotatable
{
	
	public void addAnnotation(Annotation anno);
	
	public ArrayList<Annotation> getAnnotations();
	
}
