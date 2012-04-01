package org.z.compiler.c;

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
		addCompiledFile(new CompiledFile("main.c", "int main(int argc, char** argv) {\n\t" + entryClass + "_main(argc);\n\treturn 0;\n}\n"));
	}
	
}
