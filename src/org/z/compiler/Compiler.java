package org.z.compiler;

import java.util.ArrayList;
import org.z.lexer.grammar.File;

public interface Compiler
{
	
	public void init(String entryClass) throws CompilerException;
	
	public void addFile(File f) throws CompilerException;
	
	public ArrayList<CompiledFile> getCompiledFiles();
	
	public String getLibraryLocation();
	
}
