package org.z.compiler.c;

import java.io.IOException;
import org.z.compiler.*;
import org.z.library.Library;

public class File extends CompileEntity
{
	
	private org.z.compiler.c.Compiler c;
	
	protected org.z.lexer.grammar.File f;
	
	public File(org.z.compiler.c.Compiler c, org.z.lexer.grammar.File f) throws CompilerException
	{
		this.c = c;
		this.f = f;
		org.z.lexer.grammar.File.SetFile(this);
		
		for(org.z.lexer.grammar.GenericObject cl : f.getObjects()) {
			if(cl instanceof org.z.lexer.grammar.Class) {
				// generate header file
				//System.err.println(c.getOutputFolder() + "/" + cl.getFullName().replace('.', '_') + ".h");
				CompiledFile headerFile = new CompiledFile(cl.getFullName().replace('.', '_') + ".h");
				cl.setName(cl.getFullName());
				new HeaderClass(this, headerFile, (org.z.lexer.grammar.Class) cl);
				c.addCompiledFile(headerFile);

				// generate c file
				//System.err.println(c.getOutputFolder() + "/" + cl.getFullName().replace('.', '_') + ".c");
				CompiledFile self = new CompiledFile(cl.getFullName().replace('.', '_') + ".c");
				self.appendContent("#include \"" + cl.getFullName().replace('.', '_') + ".h\"\n\n");
				cl.setName(cl.getFullName());
				new Class(this, self, (org.z.lexer.grammar.Class) cl);
				c.addCompiledFile(self);
			}
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
	
	public void parseClass(String className) throws IOException, CompilerException
	{
		// ignore natives
		if(org.z.lexer.grammar.Type.isNativeType(className)) {
			return;
		}
		
		// first try imports
		if(!className.contains(".")) {
			for(String importName : f.getImports()) {
				if(importName.endsWith(".*")) {
					// find which class path this applies to
					for(ClassPathItem cp : c.getClassPath()) {
						String newCp = cp.getLocation() + "/" +
							importName.substring(0, importName.lastIndexOf(".")).replace('.', '/');
						if(new java.io.File(newCp).exists()) {
							String[] cps = new java.io.File(newCp).list();
							for(String subcp : cps) {
								//System.out.println("!!!" + subcp);
							}
						}
					}
				}
				else {
					if(importName.endsWith("." + className)) {
						//System.out.println(className + " -> " + importName);
						className = importName;
					}
				}
			}
		}
		
		c.parseClass(className);
		//throw new CompilerException(className);
	}
	
	public TypeResolution findClass(String className) throws CompilerException
	{
		return c.findClass(className);
	}
	
}
