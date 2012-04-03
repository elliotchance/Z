package org.z.system;

public class ProcessOutput
{
	
	private String stdout;
	
	private String stderr;
	
	public ProcessOutput(String stdout, String stderr)
	{
		this.stderr = stderr;
		this.stdout = stdout;
	}

	public String getStderr()
	{
		return stderr;
	}

	public String getStdout()
	{
		return stdout;
	}
	
	public void print()
	{
		if(stdout != null && stdout.length() > 0)
			System.out.println(stdout);
		if(stderr != null && stderr.length() > 0)
			System.err.println(stderr);
	}
	
}
