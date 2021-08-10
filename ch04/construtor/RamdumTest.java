package construtor;

import java.util.Random;

public class RamdumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		for (int i = 0; i < 10000_0000; i++) {
		int	result = rand.nextInt(6) + 1;
		if (result < 1 || result > 6) {
			System.out.println("bad");
			return;
		} 
	}
		System.out.println("good");
		return;
	}

}
