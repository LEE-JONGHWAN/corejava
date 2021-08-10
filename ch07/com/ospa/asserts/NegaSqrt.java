package com.ospa.asserts;

import java.util.Scanner;

public class NegaSqrt {

	   public static void main(String[] args) {
		      double result = 0;
		      double x = 0;
		      String xStr = null;
		      try (Scanner scn = new Scanner(System.in)) {
		         while (true) {
		            System.out.print("제곱근 구할 값 양수 값 입력( >= 0): ");
		            try {
		               xStr = scn.next();

		               x = Double.parseDouble(xStr);

		               assert x >= 0 : (xStr + " is negative");

		               result = Math.sqrt(x);
		               System.out.println("제곱근: " + result);
		               break;
		            } catch (NumberFormatException e) {
		               System.err.println("입력값: " + xStr);
		               e.printStackTrace();
		            } catch (AssertionError e) {
		               e.printStackTrace();
		            }
		         }
		      }
		   }
		}