package org.z.compiler;

import java.io.IOException;
import java.util.ArrayList;
import org.z.lexer.grammar.File;

public interface Compiler
{
	
	public void init(String entryClass) throws CompilerException;
	
	public void addFile(File f) throws CompilerException;
	
	public ArrayList<CompiledFile> getCompiledFiles();
	
	public ClassPath getClassPath();
	
	public TypeResolution findClass(String className) throws CompilerException;
	
	public void parseClass(String className) throws IOException, CompilerException;
	
	public void parseFile(String file, String className) throws IOException, CompilerException;
	
}
