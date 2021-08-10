package hackkerank_control_money;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.nio.file.Path;
import java.util.regex.*;

public class Money_test {
	    public static void main(String[] args) throws IOException {
	        Scanner scanner = new Scanner(Path.of("source\\put.txt"));
	        double payment = scanner.nextDouble();
	        scanner.close();

	       
	        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
	        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
	        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
	        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
	}