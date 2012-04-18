package org.z.library;

import java.util.ArrayList;
import org.z.compiler.CompilerException;
import org.z.compiler.NoSuchEntityException;

public class Library
{
	
	private ArrayList<Package> packages = new ArrayList<Package>();
	
	private ArrayList<String> currentlyParsing = new ArrayList<String>();

	public ArrayList<String> getCurrentlyParsing()
	{
		return currentlyParsing;
	}

	public void setCurrentlyParsing(ArrayList<String> currentlyParsing)
	{
		this.currentlyParsing = currentlyParsing;
	}

	public ArrayList<Package> getPackages()
	{
		return packages;
	}
	
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
	
	public void addCurrentlyParsing(String name)
	{
		if(!isCurrentlyParsing(name))
			currentlyParsing.add(name);
	}
	
	public boolean isCurrentlyParsing(String name)
	{
		for(String cl : currentlyParsing) {
			if(cl.equals(name))
				return true;
		}
		return false;
	}
	
	public boolean classExists(String name)
	{
		try {
			// check currently parsing first
			if(isCurrentlyParsing(name))
				return true;
			
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
	
	public void registerClass(org.z.library.Class c) throws CompilerException
	{
		if(c.getFullName().equals(""))
			throw new CompilerException("Class has no name.");
		if(!isCurrentlyParsing(c.getFullName()) && classExists(c.getFullName()))
			throw new CompilerException("Class " + c.getFullName() + " is already registered.");
		
		String[] parts = c.getFullName().split("\\.");
		Package p;
		try {
			p = getPackage(parts[0]);
		}
		catch(NoSuchEntityException e) {
			p = new Package(parts[0]);
			addPackage(p);
		}
		
		for(int i = 1; i < parts.length; ++i) {
			Package p2 = new Package(parts[i]);
			p.addSubpackage(p2);
			p = p2;
		}
	}
	
}
