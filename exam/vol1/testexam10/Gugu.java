package vol1.testexam10;

import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i < 10; i++) {
			System.out.print(n + "x" + i + "=" + n * i);
			if (i % 2 == 0) {
				System.out.println();
			}
			if (i % 2 == 1 && i != 9) {
				System.out.print(", ");
			}
			if (i == 9) {
				System.out.println();
			}

		}
	}

}
