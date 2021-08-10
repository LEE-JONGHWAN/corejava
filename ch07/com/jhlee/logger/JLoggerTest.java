package com.jhlee.logger;

import java.util.logging.Logger;

import com.jbpark.utility;

public class JLoggerTest {

	private static Logger logger = JLogger.getLogger();
	public static void main(String[] args) {
		logger.config("로거 시험 가동 성공");
	}

}
