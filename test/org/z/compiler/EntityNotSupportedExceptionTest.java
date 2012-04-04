package org.z.compiler;

import org.junit.*;
import static org.junit.Assert.*;

public class EntityNotSupportedExceptionTest
{

	@Test
	public void test()
	{
		try {
			throw new EntityNotSupportedException(new org.z.compiler.c.Value(new org.z.lexer.grammar.Value(new Integer(123))));
		}
		catch(EntityNotSupportedException e) {
			assertEquals(e.getMessage(), "org.z.compiler.c.Value: 123");
		}
	}
	
}
