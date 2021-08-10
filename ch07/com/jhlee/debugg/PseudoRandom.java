package com.jhlee.debugg;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Logger;


public class PseudoRandom {
	static Logger logger = Logger.getGlobal();
	
	public static void main(String[] args) 
			throws SecurityException, IOException {
		int LOG_ROTATION_COUNT = 2;
		var handler = new com.jbpark.utility.JB_FileHandler(
				"D:/LOG/CoreJava.%g.log", 0, LOG_ROTATION_COUNT);
		logger.addHandler(handler);
		Random random = createRandomGeneragor();
		double d = random.nextDouble();
		int i = random.nextInt();
		logger.config("끝.");		
	}

	private static Random createRandomGeneragor() {
		var generator = new Random() {
			private static final long serialVersionUID = 5317195290626885917L;
			@Override
			public double nextDouble() {
				double result = super.nextDouble();
				logger.info("다음 실수: " + result);
				return result;
			}
		};
		return generator;
	}
}
