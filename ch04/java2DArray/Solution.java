package java2DArray;

import java.io.*;
import java.math.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
	/*a b c
	  	d
	  e f g ==> 19 */
	
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(
//        		new InputStreamReader(System.in));
    	Scanner scanner = new Scanner(Path.of("source\\arr.txt"),
    			StandardCharsets.UTF_8);
        
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = 
            	scanner.nextLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            	for (String item : arrRowTempItems) {
                int arrItem = Integer.parseInt(item);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        scanner.close();
       System.out.println(getMaxHourGlass(arr)); 
    }

	private static int getMaxHourGlass(List<List<Integer>> arr) {
		int thisGlass;
		int maxGlass = Integer.MIN_VALUE;
		
		for ( int i = 0; i < 4; i++) {
			for ( int j = 0; j < 4; j++) {
				// calculate sum for this hour glass.
				thisGlass = 0;
				for (int m = i; m < i + 3; m++) {
					for (int n = j; n < j + 3; n++) {
						if(m != i+1 || (m == i+1 && n == j+1))
							thisGlass += arr.get(m).get(n);	// 7 times						
						}
					}
				if (thisGlass > maxGlass)
					maxGlass = thisGlass;
				}
			}
			return maxGlass; // 19
	}
}
