package hackerrank.control.loop;

import java.util.*;
import java.io.*;
import java.nio.file.Path;

public class LoopTest {
		
	    public static void main(String []argh) throws IOException{
	        Scanner in = new Scanner(Path.of("source\\input.txt"));
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();  // 0
	            int b = in.nextInt();  // 2
	            int n = in.nextInt();  // 10
	           
	            
	            /**
	             * (a + 2**0 x b),
	             * (a + 2**0 x b + 2**1 x b), 
	             * ...
	             * (a + 2**0 x b + 2**1 x b + ... 2**j x b ... 
	             *  2**(n-1) x b) // i : 0 ~ (n-1)
	             */
	           
	            int val = a;
	            for(int j = 0; j <= n-1; j++) {
	            	val += (int)(Math.pow(2, j)) * b;
	            	System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	        
	        in.close();
	    }

	}

