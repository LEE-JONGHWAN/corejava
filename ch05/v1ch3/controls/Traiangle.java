package v1ch3.controls;
/**
 * 
 * 역삼각형을 표현해보자.
 * 
 * @author 이종환(Lee JongHwan)
 * @version 1.0.0
 *
 */
public class Traiangle {

	public static void main(String[] args) {
		Traiangle driver = new Traiangle();
		driver.printTraiAngle(1);
	}

	private void printTraiAngle(int max) {
		for(int row = 5; row >= max ; row = row -1) {
			for(int col = 1 ; col <= row ; col = col + 1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
