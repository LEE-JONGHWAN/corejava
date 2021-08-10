package compareTo.study.comparator;

import java.util.Arrays;

public class ClassBTester {

	public static void main(String[] args) {
		
		ClassB[] clb = new ClassB[3];
		
		clb[0] = new ClassB("이런세상에", 1);
		clb[1] = new ClassB("이런세상에", 5);
		clb[2] = new ClassB("이런세상에", 2);
		
		Arrays.sort(clb, new ClassBSorter());
		System.out.println();
	}
}
