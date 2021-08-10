package compcomp.palindrome;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

    	for(int i = 0; i < d; i++) {
    	arr.add(arr.remove(0));
    	
        }
    	return arr;
    	

  }
    public static void main(String[] args) {
    	List<Integer> arr = new ArrayList<Integer>();
    	for (int i = 1; i < 6; i++)
    	arr.add(i);
    	rotateLeft(5,arr);
    	for(int i : arr) {
    		System.out.println(i + " ");
    	}
    	System.out.println();
    }
}
