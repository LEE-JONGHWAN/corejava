package ch03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class HackerRank_Teach {

	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(Path.of("resources\\test.txt"),
	    		  StandardCharsets.UTF_8);
		 
		int n = sc.nextInt();
    	int count =0;
    	int a[] = new int[n];
		
		
		int negative = 0;
		for (int len = 1; len <= n; len++) {
			for (int six = 0; six <= (n-len); six++) {
				
				int sum = 0;
				for (int i = six; i < six + len; i++) {
					sum += a[i];
				}
				if (sum < 0) {
					negative++;
				}
			}
		}
		System.out.println(negative);
		return;
	}

}
