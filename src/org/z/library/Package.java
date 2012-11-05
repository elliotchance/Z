package org.z.library;

import java.util.ArrayList;
import org.z.compiler.NoSuchEntityException;

public class Package
{
	
	private String name;
	
	private ArrayList<Class> classes = new ArrayList<Class>();
	
	private ArrayList<Package> subpackages = new ArrayList<Package>();
	
	public Package(String name)
	{
		this.name = name;
	}

	public ArrayList<Class> getClasses()
	{
		return classes;
	}

	public String getName()
	{
		return name;
	}

	public ArrayList<Package> getSubpackages()
	{
		return subpackages;
	}
	
	public Package addSubpackage(Package p)
	{
		subpackages.add(p);
		return this;
	}

	@Override
	public String toString()
	{
		return toString(0);
	}

	public String toString(int indent)
	{
		String r = Library.getIndent(indent) + name;
		for(Class c : classes) {
			r += "\n" + c.toString(indent + 1);
        }
		for(Package p : subpackages) {
            r += "\n" + p.toString(indent + 1);
        }
		return r;
	}
	
	public Package addClass(Class c)
	{
		classes.add(c);
		return this;
	}
	
	public Package getSubpackage(String name) throws NoSuchEntityException
	{
		for(Package p : subpackages) {
			if(p.getName().equals(name)) {
				return p;
            }
		}
		throw new NoSuchEntityException(name + " (package)");
	}
	
}
