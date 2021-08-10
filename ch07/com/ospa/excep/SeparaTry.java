package com.ospa.excep;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.EmptyStackException;
import java.util.Stack;

public class SeparaTry {
	static Stack<Integer> s = new Stack<Integer>();
	static {
		s.push(157);
	}

	public static void main(String[] args) {
		seperateTryBlocks();
		System.out.println();
	}

	private static void seperateTryBlocks() {
		int n = 0;
		try (var out = new PrintStream("numbers.txt")){
			for (int i = 0; i < 100; i++) {
				n = s.pop();
				out.printf("%d\n", n); // "n"
			}
		} catch (EmptyStackException e1) { // RTE
			e1.printStackTrace();
		} catch (FileNotFoundException e2) { // IOE
			e2.printStackTrace();
		} catch (IllegalArgumentException e3) { // RTE
			e3.printStackTrace();
		}
	}

}
