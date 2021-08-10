package com.ospa.logging;

import java.util.ArrayList;

public class BeforeGeneric {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add("abc");
		myList.add(3.4);
		myList.add(new Employee("김"));
		Object obj = (Employee)myList.get(1);
		if(obj instanceof Employee) {
			var emp = (Employee) obj;
			System.out.println(emp.name);
		}
	}
}
