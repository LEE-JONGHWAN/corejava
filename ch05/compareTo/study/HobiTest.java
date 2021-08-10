package compareTo.study;

import java.util.Arrays;
import java.util.Collections;

public class HobiTest {

	public static void main(String[] args) {
		Hobi[] hob = new Hobi[5];
		
		hob[0] = new Hobi("장기", (byte) 7);
		hob[1] = new Hobi("바둑", (byte) 3);
		hob[2] = new Hobi("장기", (byte) 2);
		hob[3] = new Hobi("바둑", (byte) 1);
		hob[4] = new Hobi("장기", (byte) 5);

		Arrays.sort(hob, Collections.reverseOrder());
		for(Hobi Hobi : hob) {
			System.out.println(hob);
		}
	}

}
