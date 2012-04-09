package org.z.test;

import java.io.File;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.z.system.ProcessExecuter;
import org.z.system.ProcessOutput;
import org.z.system.Resources;
import static org.junit.Assert.*;
import org.z.Main;
import org.z.Z;
import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.lexer.JavaLexer;
import org.z.lexer.JavaParser;

public class TestInOut
{
	
	public void run(String name) throws Exception
	{
		// extract the test from the JAR
		String inputFile = "org/z/test/" + name + ".java";
		new File("org/z/test").mkdirs();
		Resources.ExtractResource("org/z/test/" + name + ".in.txt", inputFile);
		
		// check syntax
		ProcessExecuter p = new ProcessExecuter("javac org/z/test/" + name + ".java");
		ProcessOutput pout = p.execute();
		if(!pout.getStderr().trim().equals("")) {
			System.err.println(pout.getStderr().trim());
			throw new Exception(pout.getStderr().trim());
		}
		
		// run
		try {
			Main m = new Main();
			Z z = new Z("", new String[] {inputFile});
			z.setMainClass("org.z.test.HelloWorld");
			m.run(z);
		}
		catch(CompilerException e) {
			e.printStackTrace();
		}
		
		// run it
		ProcessExecuter p2 = new ProcessExecuter("./a.out");
		ProcessOutput pout2 = p2.execute();
		String output = pout2.getStdout() + pout2.getStderr().trim();
		//System.out.println(output);
		
		// compare result
		String expected = Resources.FetchResource("org/z/test/" + name + ".out.txt");
		assertEquals(output, expected);
	}
	
}
