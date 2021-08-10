package review.enumprac;

import java.util.Scanner;

enum Season { //class 외부에서 선언
    봄, 여름, 가을, 겨울
}

class enum_ex {
	public enum Season { //class 내부에서 선언
        봄, 여름, 가을, 겨울
    }
}


public class SingTest {
	
	static Season getSeason(Scanner scanner) { 
	System.out.print("계절?: ");
	String seasonStr = scanner.nextLine();
	return Season.valueOf(seasonStr);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
		Season compareWith = Season.여름;
		Season season = getSeason(scanner);
		int result = compareWith.compareTo(season);
		System.out.println(compareWith + " vs " + season + "=" + result + " ");
		}
		scanner.close();
	}

}
