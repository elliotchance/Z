package org.z.compiler.c;

import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.lexer.grammar.Type;

public class Method extends CompileEntity
{
	
	public Method(org.z.compiler.c.File f, CompiledFile cf, org.z.lexer.grammar.Class c,
		org.z.lexer.grammar.Method m) throws CompilerException
	{
		if(m.isStatic())
			cf.appendContent("/* static */ ");
		if(m.getReturnType() != null)
			cf.appendContent(m.getReturnType().toString() + " ");
		cf.appendContent(c.getFullName().replace('.', '_') + "_" + m.getName() + "(");
		
		cf.appendContent(getCArguments(m));
		
		cf.appendContent(")\n{\n");
		if(m.hasBody()) {
			for(org.z.lexer.grammar.Statement s : m.getBlock().getStatements())
				cf.appendContent("\t" + new Statement(f, s).render() + ";\n");
		}
		else {
			cf.appendContent("// native method\n");
		}
		cf.appendContent("}\n\n");
	}
	
	public static String getCArguments(org.z.lexer.grammar.Method m)
	{
		String r = "";
		boolean first = true;
		for(org.z.lexer.grammar.Argument a : m.getArguments()) {
			if(first)
				first = false;
			else
				r += ", ";
			r += getCType(a.getType()) + " "  + a.getName();
		}
		return r;
	}
	
	public static String getCTypes(org.z.lexer.grammar.Method m)
	{
		String r = "";
		boolean first = true;
		for(org.z.lexer.grammar.Argument a : m.getArguments()) {
			if(first)
				first = false;
			else
				r += ", ";
			r += getCType(a.getType());
		}
		return r;
	}
	
	public static String getCType(Type type)
	{
		return getCType(type, "");
	}
	
	public static String getCType(Type type, String prefix)
	{
		if(type != null) {
			if(type.toString().equals("int"))
				return type.toString();
		}
		return prefix + "java_lang_Object*";
	}
	
}
