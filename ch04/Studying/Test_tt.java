package Studying;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Test_tt {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(Path.of("source\\failed.txt"));
		String t = s.nextLine();
		System.out.println(t);
		

	}

}
