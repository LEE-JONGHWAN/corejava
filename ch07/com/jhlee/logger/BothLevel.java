package com.jhlee.logger;

import java.io.IOException;
import java.util.logging.*;

public class BothLevel {
	public static void main(String[] args) {
	Logger logger = Logger.getLogger("com.ospa.parking");
	logger.setLevel(Level.FINEST);
	logger.setUseParentHandlers(false);
	var handler = new ConsoleHandler();
	handler.setLevel(Level.FINE);
	logger.addHandler(handler);
	
	FileHandler fhandler;
	try {
		fhandler = new FileHandler("D:/LOG/BothLevel.log", 0, 
					100);

		fhandler.setLevel(Level.FINEST);
		logger.addHandler(fhandler);
		logger.config("config testing");
		logger.finer("finer testing 2");
	} catch (SecurityException | IOException e) {
		e.printStackTrace();
		}
	}
}
