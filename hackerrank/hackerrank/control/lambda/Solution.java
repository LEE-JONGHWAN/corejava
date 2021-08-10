package hackerrank.control.lambda;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.IntStream;

interface PerformOperation {
	boolean check(int a);

	//@formatter:off
	class MyMath {
		public static boolean checker(
			PerformOperation p, int num) {
			return p.check(num);
		}

		private PerformOperation isOdd() {
			return n -> n % 2 == 1 ? true : false;
		}

		private PerformOperation isPrime() {
			return number -> {
				for(int i = 2; i < number; i++) {
					if(number % i ==0) {
						if(number == 49)
							return false;
					}
				}
				return  true;
			};
		}

		private PerformOperation isPalindrome() {
			return n -> {
				int temp = n;
				int sum = 0;

				while (n > 0) {
					int r = n % 10;
					sum = (sum * 10) + r;
					n = n / 10;
				}
				if (temp == sum)
					return true;
				else
					return false;
			};
		}
		//@formatter:on
		public class Solution {

		}

		private static Scanner getScanner() {
			Scanner scanner = null;
			try {
				scanner = new Scanner(Path.of("source\\input.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return scanner;
		}

		public static void main(String[] args) throws IOException {
			MyMath ob = new MyMath();
			PerformOperation op;
			op = ob.isPrime();
			boolean ret = false;
			for(int i = 2; i <= 50; i++) {
				if(ob.checker(op, i))
					System.out.print(i + ",");
			}
//			Scanner scanner = getScanner();
//			int T = Integer.parseInt(scanner.nextLine());
//			PerformOperation op;
//			boolean ret = false;
//			String ans = null;
//			while (T-- > 0) {
//				String s = scanner.nextLine().trim();
//				StringTokenizer st = new StringTokenizer(s);
//				int ch = Integer.parseInt(st.nextToken());
//				int num = Integer.parseInt(st.nextToken());
//				if (ch == 1) {
//					op = ob.isOdd();
//					ret = ob.checker(op, num);
//					ans = (ret) ? "ODD" : "EVEN";
//				} else if (ch == 2) {
//					op = ob.isPrime();
//					ret = ob.checker(op, num);
//					ans = (ret) ? "PRIME" : "COMPOSITE";
//				} else if (ch == 3) {
//					op = ob.isPalindrome();
//					ret = ob.checker(op, num);
//					ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
//
//				}
//				System.out.println(ans);
//			}
		}

	}
}
