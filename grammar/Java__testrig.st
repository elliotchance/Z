import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import org.z.lexer.*;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.z.compiler.CompiledFile;
import org.z.lexer.JavaLexer;
import org.z.lexer.JavaParser;
import org.z.lexer.grammar.File;
import org.z.library.Library;
import org.z.system.ProcessExecuter;
import org.z.system.ProcessOutput;
import org.z.system.Resources;

public class __Test__ {

    public static void main(String args[]) throws Exception {
        JavaLexer lex = new JavaLexer(new ANTLRFileStream("/Users/elliot/NetBeansProjects/Z/grammar/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        JavaParser g = new JavaParser(tokens, 49100, null);
        try {
		//System.out.println(g.method().result);
		// parse
		File f = g.run().result;
		f.setFileName("HelloWorld.java");
				
		// compile Java
		{
			org.z.compiler.Compiler c = new org.z.compiler.java.Compiler();
			c.init("HelloWorld.java");
			c.addFile(f);
			ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
			for(CompiledFile cf : compiledFiles) {
				System.out.println("=== " + cf.getFileName() + " ===");
				System.out.println(cf.getContent());
			}
		}
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}