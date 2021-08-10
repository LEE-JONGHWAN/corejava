package JavaStaticInitializerBlock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.nio.file.Path;
import java.util.regex.*;

public class Initiallizer {
	static boolean flag = false;
	static int B;
	static int H;
	static {
	Scanner scanner = null;
	try {
		scanner = new Scanner(Path.of("source\\pu.txt"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 B = scanner.nextInt();
		 H = scanner.nextInt();
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
	}
	
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
	}
	}
}
