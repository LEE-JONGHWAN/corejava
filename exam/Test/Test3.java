package Test;

public class Test3 {
	/**
	 * 정수 배열의 연속하는 부분의 합을 구한다
	 * @param data 정수 배열
	 * @param start 부분 배열 시작 인덱스
	 * @param end 부분 배열 배제 첫 원소 인덱스
	 * @return 계산된 부분 합
	 */
	private static int rangeSum(int[] data, int start, int end) {
		int sum =0;
		
		for(int i = start; i < end; i++) {
			sum += data[i];
		}
		return sum;
	}
	static String firstPrimes(int limit) {
		String primes = " ";
		for (int candidate = 2; candidate <= limit; candidate++) {
			int divider = 2;
			for (divider = 2; divider < candidate; divider++) {
				if (candidate % divider == 0) {
					break;
				}
			}
			if (candidate == divider) {
				primes += candidate + " ";
			}
		}
		return primes;
	}
	public static void main(String[] args) {
		int[] data = new int[100];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = i + 1;
		}
		System.out.println(rangeSum(data, 0, 100));
	}
	
}
