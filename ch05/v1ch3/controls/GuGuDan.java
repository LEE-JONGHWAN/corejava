package v1ch3.controls;
/**
 * 
 * 삼각형 표현을 출력 해봐라
 * 구구단 3단을 출력 해봐라
 * 
 * @author 이종환(Lee JongHwan)
 * @version 1.0.0
 *
 */
public class GuGuDan {

	public static void main(String[] args) {
		GuGuDan driver = new GuGuDan();
		driver.printTraiangle(5);
//		printMultTab();

	}

	private void printTraiangle(int max) {
		//* (1, 1)
		//** (2, 1), (2,2)
		//*** (3, 1), (3,2), (3, 3)
		for(int row = 1; row <= max; row = row + 1) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void printMultTab() {
		// 구구단 3 단 출력
		for(int 피연2 = 1 ; 피연2 <= 9; 피연2++ ) {
			System.out.println("3 x " + 피연2 + " = " + 3 * 피연2);
		}
		
	}

}
