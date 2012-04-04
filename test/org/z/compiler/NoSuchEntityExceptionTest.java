package org.z.compiler;

import org.junit.*;
import static org.junit.Assert.*;

public class NoSuchEntityExceptionTest
{

	@Test
	public void test()
	{
		try {
			throw new NoSuchEntityException("entity");
		}
		catch(CompilerException e) {
			// all good
		}
	}
	
}
