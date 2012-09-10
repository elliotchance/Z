package org.z.compiler.java;

import java.io.IOException;
import java.util.ArrayList;
import org.z.compiler.ClassPath;
import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.compiler.TypeResolution;
import org.z.lexer.grammar.File;

public class Compiler implements org.z.compiler.Compiler
{
	
	private ArrayList<CompiledFile> files = new ArrayList<CompiledFile>();

	@Override
	public void addFile(File f) throws CompilerException
	{
		files.add(new CompiledFile(f.getFileName(), f.toString(0)));
	}

	@Override
	public ArrayList<CompiledFile> getCompiledFiles()
	{
		return files;
	}

	@Override
	public void init(String entryClass) throws CompilerException
	{
	}
	
	@Override
	public ClassPath getClassPath()
	{
		return null;
	}

	@Override
	public void parseClass(String className) throws IOException, CompilerException
	{
		throw new CompilerException("Not supported yet.");
	}

	@Override
	public void parseFile(String file, String className) throws IOException, CompilerException
	{
		throw new CompilerException("Not supported yet.");
	}

	@Override
	public TypeResolution findClass(String className) throws CompilerException
	{
		throw new CompilerException("Not supported yet.");
	}
	
}
