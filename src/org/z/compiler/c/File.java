package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.compiler.NoSuchEntityException;
import org.z.library.Library;

public class File extends CompileEntity
{
	
	private org.z.compiler.c.Compiler c;
	
	public File(org.z.compiler.c.Compiler c, org.z.lexer.grammar.File f) throws CompilerException
	{
		this.c = c;
		String fileName = f.getFileName().substring(0, f.getFileName().length() - 4) + "c";
		CompiledFile self = new CompiledFile(fileName);
		self.appendContent("#include \"library.h\"\n\n");
		for(org.z.lexer.grammar.Class cl : f.getClasses())
			new Class(this, self, cl);
		c.addCompiledFile(self);
	}
	
	public void addImport(String path)
	{
		Library lib = c.getMain().getLibrary();
		if(lib.classExists(path))
			return;
		
		String libpath = "library/" + path.replace('.', '/') + ".java";
		System.out.println("Add import: " + path + " -> " + libpath);
		c.getMain().parseFile(libpath);
	}
	
	public ResolvedType resolveType(String entity) throws NoSuchEntityException
	{
		// first look for a class in java.lang
		//addImport("java.lang.System");
		return new ResolvedType("class", "static_" + entity);
		/*for(org.z.library.Class c : library.getPackage("java").getSubpackage("lang").getClasses()) {
			if(c.getName().equals(entity))
				return new ResolvedType("class", "static_" + c.getName());
		}*/
		//throw new NoSuchEntityException(entity);
	}
	
}
