package Teste76;

import java.util.function.Function;

public class Greet {
	/*
	 * No.2 시험문제.
	 */
	
	public static String decorate(String toWhom, Function<String,String>f) {
		return f.apply(toWhom);
	}

	public static void main(String[] args) {
//		String str = decorate("이진주", pName -> "존경하는 " + pName + "님께");
//		System.out.println(str);
		System.out.println(decorate("Mary", pName -> "Dear Ms. " + pName));

	}
}
