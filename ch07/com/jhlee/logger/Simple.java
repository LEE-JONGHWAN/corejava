package com.jhlee.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Simple {

	private static final Logger myLogger 
		= Logger.getLogger("com.ospa.parking");
	void doSimpleLogging() {
		myLogger.severe("severe doSimpleLogging");
		myLogger.warning("warning doSimpleLogging");
		myLogger.info("info doSimpleLogging");
		myLogger.config("config doSimpleLogging");
		myLogger.fine("fine doSimpleLogging");
		myLogger.finer("finer doSimpleLogging");
		myLogger.finest("finest doSimpleLogging");
	}

public static void main(String[] args) {
	myLogger.setLevel(Level.ALL);
		
	Simple s = new Simple();
	s.doSimpleLogging();
	}


}

