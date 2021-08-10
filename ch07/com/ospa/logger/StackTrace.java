package com.ospa.logger;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTrace();
	}

	private static void printTrace() {
		var t = new Throwable();
		var out = new StringWriter();
		t.printStackTrace(new PrintWriter(out));
		String description = out.toString();
		System.out.println(description);
	}

}
