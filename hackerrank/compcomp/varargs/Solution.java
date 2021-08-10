package compcomp.varargs;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.nio.file.Path;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
       try{
    	   Scanner scanner = new Scanner(Path.of("source\\input.txt"));
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(scanner.nextLine());
			int n2=Integer.parseInt(scanner.nextLine());
			int n3=Integer.parseInt(scanner.nextLine());
			int n4=Integer.parseInt(scanner.nextLine());
			int n5=Integer.parseInt(scanner.nextLine());
			int n6=Integer.parseInt(scanner.nextLine());
			Add ob=new Add();
			
			
			ob.add();
			ob.add(n1);
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}


