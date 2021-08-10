package arraylist;

import java.util.*;

/**
 * This program demonstrates the ArrayList class.
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
public class ArrayListTest
{
   public static void main(String[] args)
   {
      // fill the staff array list with three Employee objects
      thisIsJava();
	  var staff = new ArrayList<Employee>();

      staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
      staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
      staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

      // raise everyone's salary by 5%
      for (int i = 0; i < staff.size(); i++) // length
         staff.get(i).raiseSalary(5);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" 
            + e.getHireDay());
   }
   
   private static void thisIsJava() {
	   List<String> list = new ArrayList<>();
	   list.add(0, "자바");
	   list.add("스프링");
	   list.remove("자바");
	   System.out.println(list.size());
	   System.exit(0);
   }
}
