package org.z.library;

import java.util.ArrayList;
import org.z.compiler.NoSuchEntityException;

public class Library
{
	
	private ArrayList<Package> packages = new ArrayList<Package>();
	
	public Library addPackage(Package p)
	{
		packages.add(p);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder r = new StringBuilder();
		for(Package p : packages) {
			r.append(p.toString(0));
			r.append("\n");
		}
		return r.toString();
	}
	
	public static String getIndent(int indent)
	{
		String r = "";
		for(int i = 0; i < indent; ++i)
			r += "\t";
		return r;
	}
	
	public Package getPackage(String name) throws NoSuchEntityException
	{
		for(Package p : packages) {
			if(p.getName().equals(name))
				return p;
		}
		throw new NoSuchEntityException(name + " (package)");
	}
	
	public boolean classExists(String name)
	{
		try {
			String[] parts = name.split(".");
			Package p = getPackage(parts[0]);
			for(int i = 1; i < parts.length; ++i)
				p = p.getSubpackage(parts[i]);
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return false;
		}
		catch(NoSuchEntityException e) {
			return false;
		}
	}
	
}
