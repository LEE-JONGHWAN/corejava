package 연습.별만들기테스트;

import java.util.Scanner;


public class StarTest {

/*		별만들기 예제

현재 별을 입력하는 키워드를 작성해라.
그리고 작성할 때에는 입력치 만큼의 별로 작성하라.
완전히 삼각형을 이루게 만들자.

System.out.print(nArr[n1] % 2 == 0 ? "짝수입니다." : "홀수입니다.");
위의 조건은 왼쪽의 수식이 true 이면 : 왼쪽의 짝수입니다. 를 출력하고
false 일때는 홀수입니다. 를 출력합니다.
조건문으로 저렇게 쓰면 간단하게 줄일 수 있는 것들이 있습니다.

*/

	public static void main(String[] args) {
		
		/**
		 * 반대쪽 직삼각형
		 */
//		System.out.print("행입력>");
//		Scanner sc = new Scanner(System.in);
//		int pr = sc.nextInt();
//		System.out.print("열입력>");
//		Scanner sc1 = new Scanner(System.in);
//		int pr1 = sc1.nextInt();
//		
//		for(int i = 1; i < pr; i++) {
//			for(int j = pr; j > 0; j--) {
//				if(i < j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}
//		sc.close();
//		sc1.close();
		
		/**
		 * 입력치 정삼각형 만드는 메소드
		 */
//		System.out.println("숫자를 입력해주세요.");
//		System.out.print("입력>");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i = 0; i < num; i++) {
//			for(int j = 0; j < num - i; j++) {
//				System.out.print(" ");
//			}
//				for(int sum = 0; sum < 2 * i + 1; sum++) {
//					System.out.print("*");
//			}
//			System.out.println();
//		}
//		sc.close();

		/**
		 * 입력치 역삼각형 만드는 메소드
		 */
//		System.out.println("숫자를 입력해주세요.");
//		System.out.print("입력>");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i = num; i > 0; i--) {
//			for(int j = num - i; j > 0; j--) {
//				  System.out.print(" ");
//			}
//			for(int sum = i * 2 - 1; sum > 0; sum--) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		sc.close();
		
		/**
		 * 내가 개인적으로 만들어 본다.
		 * 성공!! if문을 안쓰고 그냥 정삼각형 역삼각형을
		 * 출력하는 함수를 입력해 출력했다.
		 */
//		System.out.println("숫자를 입력해 주세요.");
//		System.out.print("입력>");
//		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i = 0; i < num; i++) {
//			for(int j = 1; j < num - i; j++) {
//				System.out.print(" ");
//			}
//				for(int sum = 0; sum < 2 * i + 1; sum++) {
//					System.out.print("*");
//				}
//				System.out.println(" ");
//		}				
//		for(int k = num; k > 0; k--) {
//			for(int o = num - k; o > 0; o--) {
//				System.out.print(" ");
//			}
//				for(int ex = k * 2 - 1; ex > 0; ex--) {
//					System.out.print("*");
//				}
//			System.out.println(" ");
//		}
//	    sc.close();
		
		/**
		 * 입력으로 마름모를 작성하는 함수 이다.
		 * 
		 */
//		System.out.println("홀수를 입력해 주세요.");
//		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i = 0; i < num; i++) {
//			for(int j = 0; j < num; j++) {
//				
//				//위쪽 영억
//				if(i <= num/2) {
//					if(j + i <= num/2 - 1)
//						System.out.print(" ");
//						else if(j - i >= num/2 + 1)
//							System.out.print(" ");
//						else
//							System.out.print("*");
//				}
//				
//				//아래 영역
//				else if(i > num/2) {
//					if(i - j >= num/2 + 1)
//						System.out.print(" ");
//					else if(i + j >= num/2 * 3 + 1)
//						System.out.print(" ");
//					else
//						System.out.print("*");
//				}
//			}
//		System.out.println(" ");	
//		}
		
		
		/**
		 * 기본적인 별을 출력해보자.
		 * 직삼각형을 출력했다.
		 */
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		System.out.println(" ");

		/**
		 * 정삼각형을 출력해보자.
		 */
		//별을 찍는 행
//		for(int i = 0; i < 3; i++) {
//			//공백을 찍는 스페이스 개수
//			for(int j = 0; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			//별을 출력하는 열 2 * i + 1 은 마지막에 별을 8개 찍는다.
//			//이건 계산이 필요한 함수이다.
//			for(int sum = 0; sum < 2 * i + 1; sum++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		System.out.println(" ");
		
		/**
		 * 그냥 통으로 별을 4줄 4열로 찍어보자.
		 */
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		System.out.println(" ");
		
		//0부터 5보다 작을때까지 출력한다.
//		for(int i = 0; i < 5; i++) {
//			//감소문으로 i 치보다 j가 크면 * 을 출력한다.
//			//같아지게 되면 엔터키로 빠져나가고 위의 for문으로 이동한다.
//			//이걸 반복하는 함수이다.
//			for(int j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
	}
}
