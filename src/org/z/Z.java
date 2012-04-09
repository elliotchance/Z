package org.z;

import java.util.ArrayList;
import java.util.Arrays;

public class Z
{
	
	private String classPath;
	
	private ArrayList<String> inputFiles = new ArrayList<String>();
	
	private String executable;
	
	private String mainClass;
	
	public Z()
	{
	}

	public Z(String classPath, String[] inputFiles)
	{
		this.classPath = classPath;
		this.inputFiles.addAll(Arrays.asList(inputFiles));
	}

	public String getClassPath()
	{
		return classPath;
	}

	public void setClassPath(String classPath)
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
	
}
