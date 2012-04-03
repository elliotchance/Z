package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;

public class File extends CompileEntity
{
	
	public File(org.z.compiler.c.Compiler c, org.z.lexer.grammar.File f) throws CompilerException
	{
		String fileName = f.getFileName().substring(0, f.getFileName().length() - 4) + "c";
		CompiledFile self = new CompiledFile(fileName);
		self.appendContent("#include \"library.h\"\n\n");
		for(org.z.lexer.grammar.Class cl : f.getClasses())
			new Class(c, self, cl);
		c.addCompiledFile(self);
	}
	
}
