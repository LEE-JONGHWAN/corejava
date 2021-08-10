package Teste76;

import java.io.IOException;
import java.util.Scanner;

/*
 *  No.3 시험문제
 */

public class Getter{
	public static void main(String[] args){
		try {
			int value = getIntegerInput();
			System.out.println("입력값: " + value);
			
		} catch (NumberRangeException e) {
			System.out.println("입력 값 없음");
		}
		
		System.out.println("실행 종료");
	}

	private static int getIntegerInput() throws NumberRangeException {
		int value = 0;
		Scanner sc = new Scanner(System.in);
		boolean skipWhite = false;
		
		while(true) {
			String line = "";
			try {
				if(skipWhite)
					skipWhite = false;
				else
				System.out.println("정수 0~100 입력(범위외 값 => 프로그램 종료):");

				if(sc.hasNext()) {
					line = sc.nextLine();
					line = line.trim();
					value = Integer.parseInt(line);
					if(value < 0 || value > 100) {
					throw new NumberRangeException(line);
				}
					sc.close();
					return value;
				}
				
		} catch(NumberFormatException e) {
			if(line.trim().length() > 0)
			System.out.println("부적절한 입력: '" + line + "'");
			else
				skipWhite = true;           
	  }		
	}
		
  }
	
	
}
