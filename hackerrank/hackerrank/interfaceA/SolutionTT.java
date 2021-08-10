package hackerrank.interfaceA;

import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

class Solution{
    public static void main(String []args){
    	System.out.println("m 입력: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(
    		getDivisorSum(n, n -> {
        		int sum = 0;
        	    for (int i = 1; i <= n; i++) {
        	        if (n % i == 0)
        	        	sum += i;
        	    }
        	    return sum;}));
      	sc.close();
    }
    private static int getDivisorSum(int m, AdvancedArithmetic divisorSum) {
		return divisorSum.divisor_sum(m);
	}
	/*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
