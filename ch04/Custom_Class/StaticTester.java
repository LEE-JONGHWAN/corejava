package Custom_Class;

import java.text.NumberFormat;
import java.util.Locale;

public class StaticTester {
	public static void main(String[] args) {
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("France","Fr"));
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(currencyFormatter.format(1000));
		System.out.println(percentFormatter.format(0.15));
		System.out.println(us.format(1000));
	}

}
