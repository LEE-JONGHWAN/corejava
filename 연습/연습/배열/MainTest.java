package 연습.배열;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * 지금 작성 중인 프로그램은 
 * 학생과 선생님이 있고 
 * 선생님은 학생의 성적과 주소를 입력하고 확인 할수 있고
 * 학생은 수업시간표와 성적을 확인할수 있게 한다.
 * 
 * 
 * 
*/

public class MainTest {

	public static void main(String[] args) {
		
		
		int student = 1; 
		int teacher = 2; 
		Scanner se = new Scanner(System.in);
		System.out.println("-------------");
		System.out.println("1.학생|2.선생님");
		System.out.println("-------------");
		System.out.println("선택 > ");
		int fi = se.nextInt();
		
		if(fi == teacher) {
			int 학생이름 = 1;
			int 학생주소 = 2;
			int 학생성적 = 3;
			Scanner sc = new Scanner(System.in);
			System.out.println("--------------------------");
			System.out.println("1.학생이름|2.학생주소|3.학생성적");
			System.out.println("--------------------------");
			System.out.println("선택 > ");
			int fi1 = sc.nextInt();
		
			switch(fi1) {
			
			case 1 : 
				
			
			}
		
			
		}
		else if(fi == student) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--------------------------");
			System.out.println("1.학생이름|2.학생주소|3.학생성적");
			System.out.println("--------------------------");
			System.out.println("선택 > ");
			sc.nextInt();
		}
	}
}
