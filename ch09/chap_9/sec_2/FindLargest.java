package chap_9.sec_2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<EmployeeInner> {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(EmployeeInner o) {
		return name.compareTo(o.getName());
	}

}

public class FindLargest {
	public static void main(String[] args) {
		EmployeeInner[] staffArr = { 
				new EmployeeInner("싱가포르", 11),
				new EmployeeInner("대만", 1),
				new EmployeeInner("한국", 13),
				new EmployeeInner("중국", 4)};
		List<EmployeeInner> staff = Arrays.asList(staffArr); 
		Collections.sort(staff);
//		Arrays.sort(staffArr);		
//		staff.sort(Comparator
//				.comparingDouble(Employee::getSalary));
		staff.forEach(s -> System.out.println(s.getName()));
	}
}
