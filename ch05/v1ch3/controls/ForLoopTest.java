package v1ch3.controls;

public class ForLoopTest {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 10; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum); //18
	}

}
