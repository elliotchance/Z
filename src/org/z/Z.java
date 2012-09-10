package org.z;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import org.z.compiler.ClassPath;
import org.z.compiler.CompiledFile;
import org.z.compiler.CompilerException;
import org.z.library.Library;
import org.z.system.ProcessExecuter;
import org.z.system.ProcessOutput;
import org.z.system.Resources;

public class Z
{
	
	private ClassPath classPath = new ClassPath();
	
	private ArrayList<String> inputFiles = new ArrayList<String>();
	
	private String executable;
	
	private String mainClass;
	
	private Library library = new Library();
	
	public Z()
	{
	}

	public Z(String[] inputFiles)
	{
		this.inputFiles.addAll(Arrays.asList(inputFiles));
	}

	public ClassPath getClassPath()
	{
		return classPath;
	}

	public void setClassPath(ClassPath classPath)
	{
		this.classPath = classPath;
	}

	public String getExecutable()
	{
		return executable;
	}

	public void setExecutable(String executable)
	{
		this.executable = executable;
	}

	public ArrayList<String> getInputFiles()
	{
		return inputFiles;
	}

	public void setInputFiles(ArrayList<String> inputFiles)
	{
		this.inputFiles = inputFiles;
	}

	public String getMainClass()
	{
		return mainClass;
	}

	public void setMainClass(String mainClass)
	{
		this.mainClass = mainClass;
	}

	public Library getLibrary()
	{
		return library;
	}

	public void setLibrary(Library library)
	{
		this.library = library;
	}
	
	public final void run() throws CompilerException
	{
		try {
			org.z.compiler.Compiler c = new org.z.compiler.c.Compiler(this);
			c.init(getMainClass());
			for(String file : getInputFiles()) {
				c.parseFile(file, getMainClass());
			}
		
			ArrayList<CompiledFile> compiledFiles = c.getCompiledFiles();
			/*for(CompiledFile cf : compiledFiles) {
				System.out.println("=== " + cf.getFileName() + " ===");
				System.out.println(cf.getContent());
			}*/

			// write files
			for(CompiledFile cf : compiledFiles) {
				java.io.File out = new java.io.File(cf.getFileName());
				FileOutputStream outStream = new FileOutputStream(out);
				outStream.write(cf.getContent().getBytes());
			}

			// internals
			Resources.ExtractResource("org/z/compiler/c/resources/library.c", "library.c");
			Resources.ExtractResource("org/z/compiler/c/resources/library.h", "library.h");

			// compile
			String cmd = "gcc library.c";
			for(CompiledFile cf : compiledFiles) {
				// ignore the header files
				if(cf.getFileName().endsWith(".h"))
					continue;
				
				cmd += " " + cf.getFileName();
			}
			cmd += " -o " + "a.out";
			//System.out.println(cmd);
			ProcessExecuter p = new ProcessExecuter(cmd);
			ProcessOutput pout = p.execute();
			pout.print();

			// run
			/*System.out.println("=== Ouput ===");
			ProcessExecuter p2 = new ProcessExecuter(base + "/a.out");
			ProcessOutput pout2 = p2.execute();
			pout2.print();*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		// list library
		System.out.println("Library:");
		System.out.println(getLibrary());
	}
	
	/*private static String readFileAsString(String filePath) throws java.io.IOException
	{
		StringBuilder fileData = new StringBuilder(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead;
		while((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return fileData.toString();
	}*/
	
}
