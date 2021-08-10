package ch03;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.regex.*;

public class Hackerank1 {
	    public static void main(String[] args) throws IOException {
	      Scanner sc = new Scanner(Path.of("resources\\test.txt"),
	    		  StandardCharsets.UTF_8);
	  	int n = sc.nextInt();
    	int count = 0;
    	int arr[] = new int[n];
    	for(int i=0; i<n; i++) arr[i] = sc.nextInt();
    	for(int i=0; i<n; i++) {
    		int sum = 0;
    		for (int j=i; j<n; j++) {
    			sum = arr[j]+sum;
    			if (sum<0) count++;
    		}
    	}
    	System.out.println(count);
	}
}