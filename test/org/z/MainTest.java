package org.z;

import org.junit.*;
import static org.junit.Assert.*;

public class MainTest
{
	
	public MainTest()
	{
	}

	@BeforeClass
	public static void setUpClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownClass() throws Exception
	{
	}
	
	@Before
	public void setUp()
	{
	}
	
	@After
	public void tearDown()
	{
	}

	@Test
	public void testMain()
	{
		Main.main(new String[] {});
	}
	
}
