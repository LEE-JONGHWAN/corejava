package com.jhlee.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Entering {
	private static final Logger myLogger 
			= Logger.getLogger("com.ospa.parking");
	
	public static void main(String[] args) {
		myLogger.setLevel(Level.FINER);
		Entering e = new Entering();
		int result = e.read("data.dat", "abc");
		System.out.println(result);
	}

	int read(String file, String pattern) {
		myLogger.entering("com.ospa.logging.Entering", 
				"read", new Object[] {file, pattern});
		int count = 0;
		myLogger.exiting("com.ospa.logging.Entering", 
				"read", count);
		return count;
	}
}

