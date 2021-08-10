package Studying;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true; // 무한 루프 돌리기 위한 boolean
		int num = 0;
		int score[] = {}; //학생수를 받으면 만들 배열 변수의 선언과 동시에 초기화 해줘야한다. null; 사용가능
		
			while(run) {
				System.out.println("----------------------------------");
				System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
				System.out.println("----------------------------------");
				System.out.print("선택>");
				int menu = s.nextInt();
				switch (menu) {
				case 1 :
					System.out.print("학생수>");
					num = s.nextInt();
					score = new int[num];
					break;
				case 2 :
					for (int i = 0; i < score.length; i++) {
						System.out.println("학생" + (i + 1) + ">");
						score[i] = s.nextInt();
					}break;
				case 3 :
					for(int i = 0; i < score.length; i++) {
						System.out.println("학생" + (i + 1) + ":" + score[i]);
					}break;
				case 4 :
					int max = 0;
					int sum = 0;
					double avg = 0;
					for(int i =0; i < score.length; i++) {
						max = (max < score[i]) ? score[i] : max;
						sum += score[i];
					}
					
						avg = (double)sum/num;
						System.out.println("최고 점수 : " + max);
						System.out.println("평균 점수 : " + avg);
						break;
				default :
					run = false;
				}
				
			} System.out.println("프로그램 종료");

	}

}
