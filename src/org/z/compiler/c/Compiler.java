package org.z.compiler.c;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.z.Z;
import org.z.compiler.*;
import org.z.lexer.JavaLexer;
import org.z.lexer.JavaParser;
import org.z.lexer.grammar.File;
import org.z.library.Library;

public class Compiler implements org.z.compiler.Compiler
{
	
	private ArrayList<CompiledFile> files = new ArrayList<CompiledFile>();
	
	private Z z;
	
	public Compiler(Z z)
	{
		this.z = z;
	}
	
	@Override
	public void addFile(File f) throws CompilerException
	{
		CompileEntity file = new org.z.compiler.c.File(this, f);
	}

	@Override
	public ArrayList<CompiledFile> getCompiledFiles()
	{
		return files;
	}
	
	public void addCompiledFile(CompiledFile cf)
	{
		files.add(cf);
	}
	
	@Override
	public void init(String entryClass) throws CompilerException
	{
		// main()
		StringBuilder sb = new StringBuilder();
		sb.append(("#include \"" + entryClass.replace('.', '_') + ".h\"\n\n"));
		sb.append("int main(int argc, char** argv) {\n");
		sb.append("\t_init();\n");
		sb.append(("\t" + entryClass.replace('.', '_') + "_main(0);\n"));
		sb.append("\treturn 0;\n");
		sb.append("}\n");
		addCompiledFile(new CompiledFile("main.c", sb.toString()));
		
		// we must have these classes loaded
		try {
			parseClass("java.lang.Object");
		}
		catch(IOException e) {
			throw new CompilerException(e.getMessage());
		}
	}
	
	public Library getLibrary()
	{
		return z.getLibrary();
	}
	
	@Override
	public ClassPath getClassPath()
	{
		return z.getClassPath();
	}
	
	@Override
	public void parseFile(String file, String className) throws IOException, CompilerException
	{
		if(this.z.getLibrary().isCurrentlyParsing(className)) {
			return;
		}
		
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

			if(g.failed()) {
				throw new CompilerException("Error parsing file.");
			}

			// compile Java
			{
				org.z.compiler.Compiler c = new org.z.compiler.java.Compiler();
				c.addFile(f);
				ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
				for(CompiledFile cf : compiledFiles) {
					// create precompiled directory
					String precompiledJava = cf.getFileName().replaceFirst("\\/library\\/", "/library_precompiled/");
					String dir = precompiledJava.substring(0, precompiledJava.lastIndexOf('/'));
					new java.io.File(dir).mkdirs();
					
					// write parsed java file
					java.io.File out = new java.io.File(precompiledJava);
					FileOutputStream outStream = new FileOutputStream(out);
					outStream.write(cf.getContent().getBytes());
				}
			}

			// compile C
			addFile(f);
		}
		catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public TypeResolution findClass(String className) throws CompilerException
	{
		// natives
		if(org.z.lexer.grammar.Type.isNativeType(className))
			return new TypeResolution(className, null);
		
		// cycle through the class path to find the file
		for(ClassPathItem cp : getClassPath()) {
			if(new java.io.File(cp.getLocation() + "/" + className.replace('.', '/') + ".java").exists()) {
				return new TypeResolution(cp.getRealLocation().replace('/', '.') + "." + className, cp.getLocation() +
					"/" + className + ".java");
			}
		}
		
		// have to assume this is already correct
		return new TypeResolution(className, null);
	}
	
	@Override
	public void parseClass(String className) throws IOException, CompilerException
	{
		// ignore natives
		if(org.z.lexer.grammar.Type.isNativeType(className)) {
			return;
		}
		
		// cycle through the class path to find the file
		for(ClassPathItem cp : getClassPath()) {
			if(new java.io.File(cp.getLocation() + "/" + className.replace('.', '/') + ".java").exists()) {
				String fullClassName = (cp.getBase() + '.' + className).replace('/', '.');
				if(fullClassName.startsWith(".")) {
					fullClassName = fullClassName.substring(1);
				}
				if(!z.getLibrary().classExists(className)) {
					parseFile(cp.getLocation() + "/" + className.replace('.', '/') + ".java", fullClassName);
				}
				
				return;
			}
		}
		
		// if the import cannot be found we return Object
		parseClass("java.lang.Object");
		//throw new CompilerException("No such class " + className);
	}
	
}
