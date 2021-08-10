package excep.catchit;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
//		java.util.InputMismatchException
//		java.lang.ArithmeticException: / by zero
		while(true) {
			Scanner sc = new Scanner(System.in);			
			try {
				String xStr = sc.nextLine();
				String yStr = sc.nextLine();
			int x = Integer.parseInt(xStr);
			int y = Integer.parseInt(yStr);
			if (y == 0) {
				System.out.println("java.lang.ArithmeticException: / by zero");
			} else {
				System.out.println(x/y);
			}
			}catch (NumberFormatException e) {
				System.out.println("java.util.InputMismatchException");
			}
			sc.close();
		}
	}

}
