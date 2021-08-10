package hackkerank_control_subst;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;


public class SubStr1 {

	public static String getSmallestAndLargest(String s, int k) throws IOException {
		String smallest = "";
        String largest = "";
 
       
        /* list substringer og length k */
        /* initialize two end values with first substring */
//        smallest = largest = s.substring(0,k);
        String [] myArray = new String[s.length() -2];
        int count = 0;
        int size =myArray.length;
        
        for (int i=0; i<=s.length() -k; i++) {
        	myArray[i] = s.substring(i, i + k);
        }
        
        for(int i = 0; i<size-1; i++) {
        	for(int j = i+1; j<myArray.length; j++) {
        		if(myArray[i].compareTo(myArray[j])>0) {
        			String temp = myArray[i];
        			myArray[i] = myArray[j];
        			myArray[j] = temp;
        		}
        	}
        }
//       for(int start = 0; start <= s.length() -k ; start++) {
//    	  String candi = s.substring(start,start + k); 
//    	  if (smallest.compareTo(candi) > 0) {
//    		  smallest = candi;
//    	  }
//    	  if (largest.compareTo(candi) < 0) {
//    		  largest = candi;
//    	  }
//       }
        return myArray[size] + "\n" + myArray[size -1];
	}
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(Path.of("source\\putty.txt"));
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
