import java.util.ArrayList;

import abstractClasses.Employee;

public class EmpArrayListTest {

	public static void main(String[] args) {
		var empList = new ArrayList<Employee>(100);
//		System.out.println("첫 직원: " + empList.get(0));
		empList.add(new Employee("", 0, 2000, 1, 1));
		empList.add(new Employee("", 0, 2001, 1, 1));
		empList.add(new Employee("", 0, 2002, 1, 1));
		empList.add(1, new Employee("", 0, 2002, 1, 1));
		empList.remove(0);
		
		var a = new Employee[empList.size()];
		empList.toArray(a);
		
		System.out.println(empList.get(2));
	}

}
