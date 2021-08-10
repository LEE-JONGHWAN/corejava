package Teste76;

import java.util.ArrayList;

import com.ospa.asserts.innerpkg.WrongAssertion;


/*
 * No.4 시험문제
 */
enum Schedule {
	Day,Evening,Night,Off
}
public class Nom4 {
	public static void main(String[] args) {
		   var scheduleLists = new ArrayList<Schedule[]>();
		   makeTestCases(scheduleLists);
		   for (Schedule[] schedule : scheduleLists) {
		      try {
		         verify(schedule);
		      } catch(Exception ae) {
		         System.out.println();
		      }
		   }
		   System.out.println("성공: " + success); 
		   System.out.println("실패: " + aeCount); 
		}
	

		private static void makeTestCases(
		      ArrayList<Schedule[]> scheduleLists) {
		   for (Schedule day1 : Schedule.values()) {
		      for (Schedule day2 : Schedule.values()) {
		         scheduleLists.add(new Schedule[] {
		               day1, day2 });
		      }
		   }
		}
		private static int aeCount = 0;
		private static int success = 0;
	
	private static void verify(Schedule[] schedule) {
		try {
			assert ((schedule[1] != Schedule.Day) 
					|| schedule[0] != Schedule.Evening);
			assert ((schedule[0] != Schedule.Night) 
					|| schedule[1] == Schedule.Off);
			success++;
		} catch(AssertionError e) {
			aeCount++;
		}
	}	
}
