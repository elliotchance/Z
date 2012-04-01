package org.z.compiler;

public class EntityNotSupportedException extends CompilerException
{
	
	public EntityNotSupportedException(Object entity)
	{
		super(entity.getClass().getName() + ": " + entity.toString());
	}
	
}
