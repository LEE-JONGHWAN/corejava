package com.ospa.asserts;

public class Sorting {
		void m1 () {
			int i = 4;
			if (i%3 == 0) {
				/* ... */}
			else if (i%3 == 1) {
				/* ... */}
			else { // 여기선 (i%3 == 2)
				/* ... */
			}
		}

	int m2(int i) {
		assert i > 0: "(i 값 오류 : 음수임)";
		
		int result = 0;

		if (i % 3 == 0) {
			/* ... */
		} else if (i % 3 == 2) {
			/* ... */
		} else {
			result = 2;
			/* ... */
		}
		return result;
	}
	public static void main(String[] args) {
		Sorting s = new Sorting();
		System.out.println(s.m2(-3));
	}
}

