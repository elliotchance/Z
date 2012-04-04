package org.z.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.z.system.ProcessExecuter;
import org.z.system.ProcessOutput;
import org.z.system.Resources;
import org.junit.*;
import static org.junit.Assert.*;
import org.z.Main;
import org.z.compiler.CompiledFile;
import org.z.lexer.JavaLexer;
import org.z.lexer.JavaParser;
import org.z.library.Library;

public class TestInOut
{
	
	private static Library library = null;
	
	static {
		library = new Main().getLibrary();
	}
	
	public void run(String name) throws Exception
	{
		// prepare
		new File("build/tmp").mkdir();
		String inputFile = "build/tmp/" + name + ".java";
		String distJar = "dist/Z.jar";
		
		// extract the test from the JAR
		Resources.ExtractResource("org/z/test/" + name + ".in.txt", inputFile);
		
		// parse it through the parser, this is for code coverage
		JavaLexer lex = new JavaLexer(new ANTLRFileStream(inputFile, "UTF8"));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		JavaParser g = new JavaParser(tokens);
		
		// parse
		org.z.lexer.grammar.File f = g.run().result;
		f.setFileName(inputFile);

		// compile Java
		{
			org.z.compiler.Compiler c = new org.z.compiler.java.Compiler();
			c.init(name);
			c.addFile(f);
			ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
		}

		// compile C
		{
			org.z.compiler.Compiler c = new org.z.compiler.c.Compiler(library);
			c.init(name);
			c.addFile(f);
			ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
		}
		
		// compile it
		ProcessExecuter p = new ProcessExecuter("java -jar " + distJar + " " + inputFile);
		ProcessOutput po = p.execute();
		if(!po.getStderr().trim().equals("")) {
			System.err.println(po.getStderr().trim());
			throw new Exception(po.getStderr().trim());
		}
		
		// run it
		ProcessExecuter p2 = new ProcessExecuter("build/tmp/a.out");
		ProcessOutput pout2 = p2.execute();
		String output = pout2.getStdout() + pout2.getStderr().trim();
		System.out.println(output);
		
		// compare result
		String expected = Resources.FetchResource("org/z/test/" + name + ".out.txt");
		assertEquals(output, expected);
	}
	
}
