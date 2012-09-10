package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.library.Library;

public class Type
{
	
	public static void register(org.z.lexer.grammar.Type type, CompiledFile cf, org.z.compiler.c.File f) throws CompilerException
	{
		type.setBase(type.getBase());
		
		// ignore base types
		if(org.z.lexer.grammar.Type.isNativeType(type.getBase()))
			return;
		
		// only include the file if it exists
		/*String libpath = c.getLibraryLocation() + "/" + type.getBase().replace('.', '/') + ".java";
		if(!new java.io.File(libpath).exists()) {
			//System.out.println("Ignoring import: " + type.getBase() + " -> " + libpath);
			return;
		}*/
		
		Library lib = f.getCompiler().getLibrary();
		if(lib.classExists(type.getBase()))
			return;
		
		cf.addInclude(type);
		//System.out.println("Add import: " + type.getBase());
		try {
			f.parseClass(type.getBase());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
