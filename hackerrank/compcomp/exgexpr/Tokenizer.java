package compcomp.exgexpr;

import java.util.Arrays;
import java.util.Scanner;

public class Tokenizer {
	//[A-Za-z !,?._'@]
	//[ !,?._'@]
	static String input = "He is a very very good boy, isn't he?'";
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() > 400000) return;
        if (s.length() == 0){
            System.out.println("0");
        }
		String[] tokens = input.split("[ !,?._'@]+");
	
		System.out.println(Arrays.toString(tokens));
	}

}
