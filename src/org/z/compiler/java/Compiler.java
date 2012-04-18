package org.z.compiler.java;

import java.util.ArrayList;
import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
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
	public String getLibraryLocation()
	{
		return null;
	}
	
}
