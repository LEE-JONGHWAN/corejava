package Test;
public class PrimeNumberTest {
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
		System.out.println(firstPrimes(100));
	}
}
