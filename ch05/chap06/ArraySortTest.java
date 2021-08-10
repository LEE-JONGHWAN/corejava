package chap06;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		emps[1] = new Employee("Tarry Hacker", 60000, 1988, 10, 1);
		emps[2] = new Employee("Aarry Hacker", 55000, 1990, 10, 1);
		
		Arrays.sort(emps);
		System.out.println();
	}

}
