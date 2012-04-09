package org.z.compiler.c;

import java.util.ArrayList;
import org.z.Main;
import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.lexer.grammar.File;
import org.z.library.Library;

public class Compiler implements org.z.compiler.Compiler
{
	
	private ArrayList<CompiledFile> files = new ArrayList<CompiledFile>();
	
	private Main main;
	
	public Compiler(Main main)
	{
		this.main = main;
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
		StringBuilder sb = new StringBuilder();
		sb.append(("#include \"" + entryClass.replace('.', '_') + ".h\"\n\n"));
		sb.append("int main(int argc, char** argv) {\n");
		sb.append("\t_init();\n");
		sb.append(("\t" + entryClass.replace('.', '_') + "_main(0);\n"));
		sb.append("\treturn 0;\n");
		sb.append("}\n");
		addCompiledFile(new CompiledFile("main.c", sb.toString()));
	}
	
	public Main getMain()
	{
		return main;
	}
	
	public Library getLibrary()
	{
		return main.getLibrary();
	}
	
}
