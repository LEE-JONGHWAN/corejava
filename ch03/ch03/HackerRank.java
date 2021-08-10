package ch03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.*;

public class HackerRank {

	public static void main(String[] args) throws IOException {
		Scanner scan =new Scanner(Path.of("resources\\myfile.txt"),
						StandardCharsets.UTF_8);
		
		int n = scan.nextInt();
		int [] a = new int[n]; 
		 
		 for (int i = 0; i < n; i++) {
			int val = scan.nextInt();
			a[i] = val;
		 }
		 scan.close();
	        // Prints each sequential element in array a
	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }
	    }
}
