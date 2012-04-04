package org.z.system;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Resources
{
	
	public static void ExtractResource(String path, String destination) throws IOException
	{
		ClassLoader classLoader = Resources.class.getClassLoader();
		InputStream in = classLoader.getResourceAsStream(path);
		java.io.File out = new java.io.File(destination);
		FileOutputStream outStream = new FileOutputStream(out);
		byte[] contents = new byte[in.available()];
		in.read(contents);
		outStream.write(contents);
	}
	
	public static String FetchResource(String path) throws IOException
	{
		ClassLoader classLoader = Resources.class.getClassLoader();
		InputStream in = classLoader.getResourceAsStream(path);
		byte[] contents = new byte[in.available()];
		in.read(contents);
		return new String(contents);
	}
	
}
