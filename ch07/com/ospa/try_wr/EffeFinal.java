package com.ospa.try_wr;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class EffeFinal {

	private static void printAll(String[] lines, PrintWriter out) {
		try (out) {
			for (String line: lines) {
				out.println(line);
			}
		}
	}

	public static void main(String[] args) {
		String [] lines = {"I have a dream", "나에게는 꿈이 있다.", 
				"It's contributing to the world as a Java programmer",
				"자바 전문가로써 세상에 기여하는 것이다."};
		
		PrintWriter out; 
		try {
			out = new PrintWriter("resources\\capis.txt", StandardCharsets.UTF_8);
			printAll(lines, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

