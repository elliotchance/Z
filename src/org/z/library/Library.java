package org.z.library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.z.compiler.CompilerException;
import org.z.compiler.NoSuchEntityException;

public class Library
{
	
	private ArrayList<Package> packages = new ArrayList<Package>();
    
    private HashMap<String, Boolean> fileQueue = new HashMap<String, Boolean>();
    
    public void addToFileQueue(String name) throws IOException
    {
        String fullName = new java.io.File(name).getCanonicalPath();
        if(!fileQueue.containsKey(fullName)) {
            fileQueue.put(fullName, false);
        }
    }

    public HashMap<String, Boolean> getFileQueue()
    {
        return fileQueue;
    }
    
    public String getNextPendingFile()
    {
        for(String file : fileQueue.keySet()) {
            if(!fileQueue.get(file)) {
                return file;
            }
        }
        return null;
    }
    
    public LinkedList<String> getPendingFileQueue()
    {
        LinkedList<String> files = new LinkedList<String>();
        for(String file : fileQueue.keySet()) {
            if(!fileQueue.get(file)) {
                files.add(file);
            }
        }
        return files;
    }
    
    public void removePendingFile(String name)
    {
        fileQueue.put(name, true);
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
		for(int i = 0; i < indent; ++i) {
			r += "\t";
		}
		return r;
	}
	
	public Package getPackage(String name) throws NoSuchEntityException
	{
		for(Package p : packages) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		throw new NoSuchEntityException(name + " (package)");
	}
	
	public boolean classExists(String name)
	{
		try {
			String[] parts = name.split(".");
			Package p = getPackage(parts[0]);
			for(int i = 1; i < parts.length; ++i) {
				p = p.getSubpackage(parts[i]);
			}
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return false;
		}
		catch(NoSuchEntityException e) {
			return false;
		}
	}
	
	public synchronized void registerClass(org.z.library.Class c) throws CompilerException
	{
		if(classExists(c.getFullName())) {
			return;
		}
		if(c.getFullName().equals("")) {
			throw new CompilerException("Class has no name.");
		}
		
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
            Package p2;
            try {
                p2 = p.getSubpackage(parts[i]);
            }
            catch(NoSuchEntityException e) {
                p2 = new Package(parts[i]);
                p.addSubpackage(p2);
            }
            
			p = p2;
		}
	}
	
}
