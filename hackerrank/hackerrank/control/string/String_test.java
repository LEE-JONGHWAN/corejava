package hackerrank.control.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.nio.file.Path;
import java.util.regex.*;

public class String_test {

    public static void main(String_test[] args) throws IOException {
        Scanner in = new Scanner(Path.of("source\\input-string.txt"));
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        
        System.out.println(S.substring(start, end));
        
        
    }
}