package org.z;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.lexer.JavaLexer;
import org.z.lexer.JavaParser;
import org.z.lexer.grammar.File;
import org.z.library.Library;
import org.z.system.ProcessExecuter;
import org.z.system.ProcessOutput;
import org.z.system.Resources;

public class Main
{
	
	private Library library = new Library();

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		try {
			Main m = new Main();
			Z z = new Z("", args);
			z.setMainClass("org.z.test.HelloWorld");
			m.run(z);
		}
		catch(CompilerException e) {
			e.printStackTrace();
		}
	}
	
	public void run(Z z) throws CompilerException
	{
		try {
			org.z.compiler.Compiler c = new org.z.compiler.c.Compiler(this);
			c.init(z.getMainClass());
			for(String file : z.getInputFiles()) {
				parseFile(c, file);
			}
		
			ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
			/*for(CompiledFile cf : compiledFiles) {
				System.out.println("=== " + cf.getFileName() + " ===");
				System.out.println(cf.getContent());
			}*/

			// write files
			for(CompiledFile cf : compiledFiles) {
				java.io.File out = new java.io.File(cf.getFileName());
				FileOutputStream outStream = new FileOutputStream(out);
				outStream.write(cf.getContent().getBytes());
			}

			// internals
			Resources.ExtractResource("org/z/compiler/c/resources/library.c", "library.c");
			Resources.ExtractResource("org/z/compiler/c/resources/library.h", "library.h");

			// compile
			String cmd = "gcc library.c";
			for(CompiledFile cf : compiledFiles) {
				// ignore the header files
				if(cf.getFileName().endsWith(".h"))
					continue;
				
				cmd += " " + cf.getFileName();
			}
			cmd += " -o " + "a.out";
			//System.out.println(cmd);
			ProcessExecuter p = new ProcessExecuter(cmd);
			ProcessOutput pout = p.execute();
			pout.print();

			// run
			/*System.out.println("=== Ouput ===");
			ProcessExecuter p2 = new ProcessExecuter(base + "/a.out");
			ProcessOutput pout2 = p2.execute();
			pout2.print();*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		// list library
		System.out.println("Library:");
		System.out.println(library);
	}
	
	public void parseFile(org.z.compiler.Compiler compiler, String file) throws IOException, CompilerException
	{
		String inputFile = file.substring(file.lastIndexOf("/") + 1);
		String rawInputFile = inputFile.substring(0, inputFile.lastIndexOf("."));
		String base = file.substring(0, file.lastIndexOf("/"));

		JavaLexer lex = new JavaLexer(new ANTLRFileStream(file, "UTF8"));
		CommonTokenStream tokens = new CommonTokenStream(lex);

		JavaParser g = new JavaParser(tokens);
		try {
			// parse
			File f = g.run().result;
			f.setFileName(file);

			if(g.failed())
				throw new CompilerException("Error parsing file.");

			// compile Java
			/*{
				org.z.compiler.Compiler c = new org.z.compiler.java.Compiler();
				c.addFile(f);
				ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
				for(CompiledFile cf : compiledFiles) {
					System.out.println("=== " + cf.getFileName() + " ===");
					System.out.println(cf.getContent());
				}
			}*/

			// compile C
			compiler.addFile(f);
		}
		catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
	
	private static String readFileAsString(String filePath) throws java.io.IOException
	{
		StringBuilder fileData = new StringBuilder(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead;
		while((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return fileData.toString();
	}
	
	public Library getLibrary()
	{
		return library;
	}
	
}
