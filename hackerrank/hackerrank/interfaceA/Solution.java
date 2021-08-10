package hackerrank.interfaceA;


//class MyCalculator implements AdvancedArithmetic {
//	@Override
//	public int divisor_sum(int n) {
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0)
//				sum += i;
//		}
//		return sum;
//	}
//}

import java.util.*;
interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class solution {
	public static void main(String[] args) {
//		MyCalculator my_calculator = new MyCalculator();
		System.out.print("m 입력: ");
//		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		//formatter:off
		int m = sc.nextInt();
		int result = getDivisorSum(m, n -> {
					int sum = 0;
					for (int i = 1; i <= n; i++) {
						if (n % i == 0)
							sum += i;
					}
					return sum;});
		//formatter:on
			System.out.println(result);
		sc.close();
	}


	private static int getDivisorSum(int m, AdvancedArithmetic divisorSum) {
			return divisorSum.divisor_sum(m);
		}

	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}
}

}
