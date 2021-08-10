package abstractClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Employee extends Person 
	implements Comparable<Employee>{
	
	private double salary;
	protected LocalDate hireDay;

	public static void main(String[] args) {
		var e1 = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		var e2 = new Employee("Harry Hacker", 60000, 1989, 10, 1);
		var employees = new ArrayList<Employee>(100); //Generic ArrayList.
		employees.add(e1);
//		employees.set(0, e2);
		System.out.println(employees.size());
		for(Employee emp : employees) {
			System.out.println(employees.get(1));
		}
	}

	@Override
	public boolean equals(Object otherObject) {
		// 같은 참조인지 시험
		if (this == otherObject)
			return true;

		// 인자가 null 이면 같을 확율 0
		if (otherObject == null)
			return false;

		// 두 객체 형이 다르면 같을 확율 0
		if (getClass() != otherObject.getClass())
			return false;

		// 인자가 null 아니고, Employee 객체일때 처리
		Employee other = (Employee) otherObject;

		// 각 필드 값이 같은지 검사
		return getName().equals(other.getName()) 
				&& salary == other.salary 
				&& Objects.equals(hireDay, other.hireDay);
	}

//	@Override
//	public int hashCode() {
//	      return 7 * getName().hashCode()
//	         + 11 * Double.valueOf(salary).hashCode()
//	         + 13 * hireDay.hashCode();
//	   }
	
		@Override
		public int hashCode() {
		return Objects.hash(hireDay, getName(), salary);
	}

	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	@Override
	public String toString() {
		String empInfo = "직원[이름=" + getName() + 
				", 급여=" + salary + ", 고용일=" + hireDay + "]";
		return empInfo;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

   @Override
   public String getDescription() {
	   return null;
   }

//	public String getDescription() {
//		return getClass().getName() + ",an employee with a salary of $%.2f";
//	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	final public int compareTo(Employee o) {
		if(this instanceof Manager && o instanceof Employee)
			return 1;
		else if (this instanceof Employee && o instanceof Manager)
			return -1;
		else
			return Double.compare(getSalary(), o.getSalary());
	}

}
