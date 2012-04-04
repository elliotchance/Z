package org.z.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.z.system.Resources;

public class HelloWorldTest extends TestInOut
{
	
	private String in = null;
	
	private String out = null;
	
	public HelloWorldTest()
	{
	}
	
	@Test
	public void testRun() throws Exception
	{
		String self = getClass().getSimpleName();
		run(self.substring(0, self.length() - 4));
	}
	
}
