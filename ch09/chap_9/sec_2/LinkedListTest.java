package chap_9.sec_2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.logging.Logger;

class EmployeeInner implements Comparable<EmployeeInner> {
	String name;
	double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeInner(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(EmployeeInner o) {
		return name.compareTo(o.getName());
	}
}

public class LinkedListTest {

	public static void main(String[] args) {
		var members = new LinkedList<String>();
		members.add("철수");
		members.add("영희");
		members.add("기석");
		members.add("만호");

		int foundIndex = Collections.binarySearch(members, "영희");
		Logger.getGlobal().info("인덱스: " + foundIndex);

		var staff = new LinkedList<EmployeeInner>();
		EmployeeInner man = null;
		EmployeeInner woman = new EmployeeInner("김", 300);
		staff.add(woman);
		staff.add(new EmployeeInner("박", 530));
		int max = 2000000;
		for (int i = 190; i < 1000000; i++) {
			double salary = max - i;
			if (i == 555555) {
				man = new EmployeeInner("이" + i, salary);
				staff.add(man);
			} else {
				staff.add(new EmployeeInner("이" + i, salary));
			}
		}
		Collections.sort(staff, Comparator.comparing(EmployeeInner::getSalary));
		foundIndex = Collections.binarySearch(staff, man, Comparator.comparing(EmployeeInner::getSalary));
		Logger.getGlobal().info("foundIndex: " + foundIndex);
	}
}

