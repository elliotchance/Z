package org.z;

import org.z.compiler.ClassPathItem;
import org.z.compiler.CompilerException;

public class Main
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		try {
			Main m = new Main(args);
		}
		catch(CompilerException e) {
			e.printStackTrace();
		}
	}
	
	public Main(String[] args) throws CompilerException
	{
		Z z = new Z(args);
		z.getClassPath().add(new ClassPathItem("../library", ""));
		z.setMainClass("org.z.test.HelloWorld");
		z.run();
	}
	
}
