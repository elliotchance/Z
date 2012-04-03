package org.z.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessExecuter
{
	
	private String command;
	
	public ProcessExecuter(String command)
	{
		this.command = command;
	}
	
	public ProcessOutput execute() throws IOException
	{
		StringBuilder stdout = new StringBuilder();
		StringBuilder stderr = new StringBuilder();
		String s = null;
		Process p = Runtime.getRuntime().exec(command);
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

		// read any errors from the attempted command
		while((s = stdError.readLine()) != null)
			stderr.append(s);

		// read the output from the command
		while ((s = stdInput.readLine()) != null)
			stdout.append(s);
		
		return new ProcessOutput(stdout.toString(), stderr.toString());
	}
	
}
