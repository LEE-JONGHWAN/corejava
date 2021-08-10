package com.jhlee.logger;

import java.util.Arrays;
import java.util.logging.Logger;

public class GlobalLoggerTest {
	static Logger logger = Logger.getGlobal();
	
	void doSimpleLogging() {
		Logger.getGlobal().info("전역 로거 작동 시험...");
	}
	
	public static void main(String[] args) {
		var tester = new GlobalLoggerTest();
//		tester.doSimpleLogging();
		int data[] = {1, 2, 3};
		logger.info(Arrays.toString(data));
	}

}
