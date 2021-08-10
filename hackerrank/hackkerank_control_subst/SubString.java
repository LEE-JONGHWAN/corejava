package hackkerank_control_subst;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.nio.file.Path;
import java.util.regex.*;

public class SubString {

	public static void main(String[] args) throws IOException {
		        Scanner in = new Scanner(Path.of("source\\putt.txt"));
		        String S = in.next();
		        int start = in.nextInt();
		        int end = in.nextInt();
		        
		        System.out.println(S.substring(start,end));


	}

}
