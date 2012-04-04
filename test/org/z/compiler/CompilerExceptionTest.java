package org.z.compiler;

import org.junit.*;
import static org.junit.Assert.*;

public class CompilerExceptionTest
{

	@Test
	public void test()
	{
		try {
			throw new CompilerException("message");
		}
		catch(CompilerException e) {
			// all good
		}
	}
	
}
