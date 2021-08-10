package com.jhlee.collection;

import java.util.Arrays;

public class FillHour {
	   public static void main(String[] args) {
		      int[][] hourAdopt = { { 7, 3 }, { 8, 1 }, { 10, 2 } };
		      int[] hour24Adopt = new int[24];

		      for (int i = 0; i < hourAdopt.length; i++) {
		         hour24Adopt[hourAdopt[i][0]] = hourAdopt[i][1];
		      }
		      for (int i = 0; i <hour24Adopt.length; i++) {
		         System.out.print("(" + i + " " + hour24Adopt[i] + "), "  );
		      }
//		      int i = 1;
//		      Arrays.stream(hour24Adopt)
//		         .forEach(System.out::println);
//		      System.out.println(Arrays.toString(hour24Adopt));
		   }
}
