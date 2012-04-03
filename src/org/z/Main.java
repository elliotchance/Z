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
import org.z.lexer.JavaLexer;
import org.z.lexer.JavaParser;
import org.z.lexer.grammar.File;
import org.z.library.Library;
import org.z.system.ProcessExecuter;
import org.z.system.ProcessOutput;
import org.z.system.Resources;

public class Main
{
	
	private Library library = null;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		Main m = new Main();
		m.initLibrary();
		m.parseFile("test/HelloWorldApp.java");
	}
	
	private void initLibrary()
	{
		library = new Library();
		library.addPackage(
			new org.z.library.Package("java").addSubpackage(
				new org.z.library.Package("lang").addClass(
					new org.z.library.Class("PrintStream").addMethod(
						new org.z.library.Method("void", "println", "String string")
					)
				).addClass(
					new org.z.library.Class("String")
				).addClass(
					new org.z.library.Class("System").addVariable(
						new org.z.library.Variable("PrintStream", "out")
					)
				)
			)
		);
		System.out.println(library + "\n");
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
					org.z.compiler.Compiler c = new org.z.compiler.c.Compiler(library);
					c.init("HelloWorldApp");
					c.addFile(f);
					ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
					for(CompiledFile cf : compiledFiles) {
						System.out.println("=== " + cf.getFileName() + " ===");
						System.out.println(cf.getContent());
					}
					
					// write files
					new java.io.File("build/c").mkdir();
					for(CompiledFile cf : compiledFiles) {
						java.io.File out = new java.io.File("build/c/" + cf.getFileName());
						FileOutputStream outStream = new FileOutputStream(out);
						outStream.write(cf.getContent().getBytes());
					}
					
					// internals
					Resources.ExtractResource("org/z/compiler/c/resources/library.c", "build/c/library.c");
					Resources.ExtractResource("org/z/compiler/c/resources/library.h", "build/c/library.h");
				}
				
				// compile
				ProcessExecuter p = new ProcessExecuter("gcc build/c/library.c build/c/HelloWorldApp.c build/c/main.c -o build/c/a.out");
				ProcessOutput pout = p.execute();
				pout.print();
				
				// run
				System.out.println("=== Ouput ===");
				ProcessExecuter p2 = new ProcessExecuter("build/c/a.out");
				ProcessOutput pout2 = p2.execute();
				pout2.print();
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
