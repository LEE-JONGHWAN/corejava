package hackerrank.control.string;

import java.io.*;
import java.util.*;

public class StringIntro {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A="hello";
        String B="java";
        /* Enter your code here. Print output to STDOUT. */
       int totalLength = A.length() + B.length();
       System.out.println(totalLength);
       
       if (A.compareTo(B) < 0) {
    	   System.out.println("No");
       } else {
    	   System.out.println("Yes");
       }
       String outputA = A.substring(0, 1).toUpperCase() + A.substring(1);
       String outputB = B.substring(0, 1).toUpperCase() + B.substring(1);
       System.out.println(outputA + " " + outputB);
	}
}
