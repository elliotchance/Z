package org.z.library;

import org.junit.*;
import static org.junit.Assert.*;

public class MethodTest
{
	
	private static Method method = null;
	
	public MethodTest()
	{
	}

	@BeforeClass
	public static void setUpClass() throws Exception
	{
		method = new Method("void", "main", "String[] args");
	}

	@Test
	public void testToString()
	{
		method = new Method("void", "main", "String[] args");
		assertEquals(method.toString(), "main(String[] args) : void");
	}

	@Test
	public void testArgs()
	{
		method.setArgs("bla");
		assertEquals(method.getArgs(), "bla");
	}

	@Test
	public void testName()
	{
		method.setName("bla");
		assertEquals(method.getName(), "bla");
	}

	@Test
	public void testReturnType()
	{
		method.setReturnType("bla");
		assertEquals(method.getReturnType(), "bla");
	}
	
}
