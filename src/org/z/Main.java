package org.z;

import org.z.compiler.ClassPathItem;
import org.z.compiler.CompilerException;

/*
 * function run(total) {
 *   function multiply(a, b) {
 *     return (a % 10) * (b % 10);
 *   }
 * 
 *   for(var i = 0; i < total; ++i) {
 *     var m = multiply(i, i + 1);
 *   }
 * 
 *   return total;
 * }
 */

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
		z.getClassPath().add(new ClassPathItem("../library/java/lang", "java/lang"));
		z.setMainClass("org.z.test.HelloWorld");
		z.run();
	}
	
}
