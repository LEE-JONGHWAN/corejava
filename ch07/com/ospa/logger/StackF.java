package com.ospa.logger;

import java.util.Scanner;

public class StackF {
	public static void main(String[] args) {
	try (var in = new Scanner(System.in)) {
		System.out.print("입력 값 N= ");
		int n = in.nextInt();
		factorial(n);
		}
	}

private static int factorial(int n) {
	System.out.println("factorial(" + n + ")");
	var walker = StackWalker.getInstance();
	walker.forEach(f -> System.out.println(f));
	int result;
	if (n == 1)
		result = n;
	else
		result = n * factorial(n - 1);
	System.out.println("return: " + result);
	return result;
	}
}