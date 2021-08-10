package chap_9.sec_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import chap_08.generic.Employee;

public class SortUsingComparator {
	public static void main(String[] args) {
//		List<Employee> staff = new LinkedList<Employee>();
//		staff.sort(Comparator.comparingDouble(Employee::getSalary));
		
		Employee[] staffArr = { 
				new Employee("싱가포르", 11),
				new Employee("대만", 1),
				new Employee("한국", 13),
				new Employee("중국", 4)};
		
		List<Employee> staffList = Arrays.asList(staffArr); 
		
		staffList.sort(Comparator.comparingDouble(Employee::getSalary));
		staffList.forEach(s -> System.out.println(s.getName()));



	}

}
