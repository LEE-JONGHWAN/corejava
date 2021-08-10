package chap_08.generic;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	

	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, double salary, int year, int month, int day) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, month);
	}
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(Manager o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
