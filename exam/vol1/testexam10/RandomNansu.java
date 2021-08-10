package vol1.testexam10;

import java.util.Random;

public class RandomNansu {

	public static void main(String[] args) {
		
	Random ran = new Random();
	boolean[] b = new boolean[100];
	int count = 0;
	int rancount = 0;
	while( count < 6) {
		int a ;
		do {
			a = ran.nextInt(6) + 1;
			rancount++;
		} 
		while (b[a - 1]);
		b[a - 1] = true;
		count++;
		
		System.out.print(a + " ");
	}
	System.out.println();
	System.out.println("난수 생성횟수: " + rancount);
	}
 }
