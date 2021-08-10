package com.ospa.logger;

public class StackTrace2 {
	public static void main(String[] args) {
		printTrace();
	}

	private static void printTrace() {
		StackWalker walker = StackWalker.getInstance();
		walker.forEach(frame -> System.out.println(
				frame.getFileName() + ", "
						+ frame.getMethodName() + ": "
						+ frame.getLineNumber()));
	}
}
