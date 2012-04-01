package org.z.compiler.c;

import java.util.ArrayList;
import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.compiler.EntityNotSupportedException;
import org.z.lexer.grammar.File;

public class Compiler implements org.z.compiler.Compiler
{
	
	private ArrayList<CompiledFile> files = new ArrayList<CompiledFile>();
	
	@Override
	public void addFile(File f) throws CompilerException
	{
		throw new EntityNotSupportedException(f);
	}

	@Override
	public ArrayList<CompiledFile> getCompiledFiles()
	{
		return files;
	}
	
}
