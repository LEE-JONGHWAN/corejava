public class Overloading {
	int field =0;
	
	public static void main(String[] args) {
		
		int summation;
		summation = addUpto(10);
		System.out.println(summation);
	}

	private static int addUpto(int i) {
		int sum = 0; 
		for (int j = 0; j <= i; j++) {
			sum += j;
		}
		
		return sum;
	}

}
