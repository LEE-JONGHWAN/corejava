package tasting;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("먹고싶은 과일은 무엇입니까?");
		System.out.println("=".repeat(20));
		System.out.println("1.사과|2.딸기|3.키위|4.두리안");
		System.out.println("이름을 입력하시오(예:사과)");
		System.out.println("=".repeat(20));
		String src = sc.nextLine();
		if("사과".equals(src)) {
			System.out.println("사과를 발주 합니다.");
		} else if ("딸기".equals(src)) {
			System.out.println("딸기를 발주 합니다.");
		} else if ("키위".equals(src)) {
			System.out.println("키위를 발주 합니다.");
		} else if ("두리안".equals(src)) {
			System.out.println("두리안을 발주 합니다.");
		}
		sc.close();
	}

}
