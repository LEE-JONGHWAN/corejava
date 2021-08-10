package ch03;

import java.util.Arrays;



public class ArrayTest {

	public static void main(String[] args) {
		
		ArrayTest arrayTest = new ArrayTest();
		arrayTest.fill_test();
//		arrayTest.decl_test();
//		arrayTest.cmd_args(args);
//		arrayTest.debugger_id_test();

	}
	
	private void fill_test() {
		int val[] = new int[5];
		Arrays.fill(val, 0);
		System.out.println(Arrays.toString(val));
	}
	
	private void decl_test() {
		int[] a;
		int[] b;

		
		
		a = new int[] {1, 2, 3, 4};		
	
		b = Arrays.copyOf(a, a.length - 2);
		b[0] = 100;
	
		for (int i = 0; i < a.length; i++) 
				System.out.println(a[i]);
		String elements = Arrays.toString(a);
		System.out.println(elements); 
			// 배열 원소 개수 = 배열 크기 = 배열 길이
		return;
	}
	
	
}














