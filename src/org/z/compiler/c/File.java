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
		
		for(org.z.lexer.grammar.Class cl : f.getClasses()) {
			// generate header file
			//System.err.println(c.getOutputFolder() + "/" + cl.getFullName().replace('.', '_') + ".h");
			CompiledFile headerFile = new CompiledFile(cl.getFullName().replace('.', '_') + ".h");
			cl.setName(cl.getFullName());
			new HeaderClass(this, headerFile, cl);
			c.addCompiledFile(headerFile);
			
			// generate c file
			//System.err.println(c.getOutputFolder() + "/" + cl.getFullName().replace('.', '_') + ".c");
			CompiledFile self = new CompiledFile(cl.getFullName().replace('.', '_') + ".c");
			self.appendContent("#include \"" + cl.getFullName().replace('.', '_') + ".h\"\n\n");
			cl.setName(cl.getFullName());
			new Class(this, self, cl);
			c.addCompiledFile(self);
		}
	}
	
	public final void addImport(String path) throws CompilerException
	{
		// only include the file if it exists
		String libpath = c.getLibraryLocation() + "/" + path.replace('.', '/') + ".java";
		if(!new java.io.File(libpath).exists()) {
			System.out.println("Ignoring import: " + path + " -> " + libpath);
			return;
		}
		
		Library lib = c.getMain().getLibrary();
		if(lib.classExists(path))
			return;
		lib.addCurrentlyParsing(path);
		
		System.out.println("Add import: " + path + " -> " + libpath);
		try {
			c.getMain().parseFile(c, libpath);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
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
	
	public Library getLibrary()
	{
		return c.getLibrary();
	}

	public Compiler getCompiler()
	{
		return c;
	}
	
}
