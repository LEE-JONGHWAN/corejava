package chap_08.generic.wildcard;

import java.util.ArrayList;

import chap_08.generic.Employee;
import chap_08.generic.Manager;

public class WildTheory {
	public static void main(String[] args) {
		Employee emp = null;
		Manager man = null;
		emp = man; // 이건 된다.
//		man = emp; // error

		ArrayList<Employee> empList = null;
		ArrayList<Manager> manList = null;

//   	 empList = manList; // 이건 안된다.
//		 empList = (ArrayList<Employee>)manList; // 이건 안된다.
//		 manList = (ArrayList<Manager>)empList; // 이건 안된다.
//		 manList = (ArrayList<Subtype>)empList; // error

		ArrayList<?> rootList; 		 // 그래서 만든 것. 그러나 너무 제약이 없어.
		ArrayList<?> objList = null; // 그래서 만든 것. 그러나 너무 제약이 없어.
		rootList = empList;
		rootList = manList;
		rootList = objList;

		ArrayList<? extends Employee> empOrChild; // 상한 만능패
		empOrChild = empList;
		empOrChild = manList;

		ArrayList<? super Manager> manOrParent; // 하한 만능패
		manOrParent = empList;
		manOrParent = manList;

	}
}
