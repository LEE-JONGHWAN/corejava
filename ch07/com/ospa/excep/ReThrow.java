package com.ospa.excep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrow {
	public static void main(String[] args) 
			throws FileNotFoundException {
		ReThrow rt = new ReThrow();
		
		try {
			rt.tryOpenFile("resources\\proverbs.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void tryOpenFile(String filename) throws FileNotFoundException {
		var in = new FileInputStream(filename);
	}

}
