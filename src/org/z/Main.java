package org.z;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.z.compiler.CompiledFile;
import org.z.lexer.JavaLexer;
import org.z.lexer.JavaParser;
import org.z.lexer.grammar.File;

public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		Main m = new Main();
		m.parseFile("test/HelloWorldApp.java");
	}
	
	private void parseFile(String file)
	{
		try {
			//String java = readFileAsString(file);
			//System.out.println(java);
			
			JavaLexer lex = new JavaLexer(new ANTLRFileStream(file, "UTF8"));
			CommonTokenStream tokens = new CommonTokenStream(lex);

			JavaParser g = new JavaParser(tokens);
			try {
				// parse
				File f = g.run().result;
				f.setFileName("HelloWorldApp.java");
				
				// compile Java
				{
					org.z.compiler.Compiler c = new org.z.compiler.java.Compiler();
					c.init("HelloWorldApp");
					c.addFile(f);
					ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
					for(CompiledFile cf : compiledFiles) {
						System.out.println("=== " + cf.getFileName() + " ===");
						System.out.println(cf.getContent());
					}
				}
				
				// compile C
				{
					org.z.compiler.Compiler c = new org.z.compiler.c.Compiler();
					c.init("HelloWorldApp");
					c.addFile(f);
					ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
					for(CompiledFile cf : compiledFiles) {
						System.out.println("=== " + cf.getFileName() + " ===");
						System.out.println(cf.getContent());
					}
				}
			}
			catch (RecognitionException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String readFileAsString(String filePath) throws java.io.IOException
	{
		StringBuilder fileData = new StringBuilder(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return fileData.toString();
	}
	
}
