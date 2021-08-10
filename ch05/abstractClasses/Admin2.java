package abstractClasses;

import java.time.LocalDate;

public class Admin2 extends Employee {
	LocalDate hDay = hireDay;
	
	public Admin2(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
//		hDay = emp.hireDay;
	}
	

	void add(Employee e) {
		LocalDate date = e.hireDay;
	}
}
