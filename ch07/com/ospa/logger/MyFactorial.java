package com.ospa.logger;

public class MyFactorial {

	public static void main(String[] args) {
		long depth = 10000000000l;
		System.out.println(factorial(depth));
	}

	/**
	 * calculate n! 
	 * @param n input value with n >= 1.
	 * @return n factorial value
	 */
	private static long factorial(long n) {
		long result = 1;
		
		if (n > 1) {
			result = n * factorial(n-1);
		}
		return result;
	}
}
