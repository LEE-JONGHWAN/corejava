package abstractClasses.car;

import java.time.LocalDate;

import v1ch5.inheritance.Employee;

public class Admin extends Employee {
	private LocalDate hireDay;
	LocalDate hDay = hireDay;
	Employee emp = new Employee("ss", 3333, 2020, 1, 1)
	public Admin(String name, double salary, int year, int month, int day) {
		super(name,salary,year,month,day);
		hDay = emp.getHireDay();

	}
	void add(Employee e) {
		LocalDate date = e.getHireDay();
		date = e.getHireDay();
	}

}
