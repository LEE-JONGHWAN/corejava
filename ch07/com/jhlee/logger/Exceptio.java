package com.jhlee.logger;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exceptio {
	private static final Logger logger = Logger.getLogger("com.ospa.logging");

	public static void main(String[] args) {
		Exceptio ex = new Exceptio();
		try {
			ex.read();
		} catch (IOException e) {
			logger.log(Level.FINER, "영상 파일 읽기", e);
//			e.printStackTrace();
		}
	}

	private void read() throws IOException {
		int n = 5;
		if (n % 3 == 2) {
			var e = new IOException("파일이 없습니다");
			throw e;
		}
	}
}
