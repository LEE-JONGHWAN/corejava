package Custom_Class;

import java.time.*;
import java.util.Locale;

/**
 * This program tests the Employee class.
 * @version 1.13 2018-04-10
 * @author Cay Horstmann
 */
public class EmployeeTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[3];
      Locale locale1 = Locale.FRANCE;
      Locale locale2 = Locale.FRANCE;
//      String name = "김길동";
      staff[0] = new Employee(null, 75000, 1987, 12, 15);
      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
      staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
      
      if (staff[1].equals(staff[2])) {
    	  System.out.println();
      }
      staff[3] = new Employee("김봉길", 800000, 2021, 1, 1);
      staff[3].setHireDay(LocalDate.of(2021, 6, 29));

      //       raise everyone's salary by 5%
      for (Employee e : staff) {
    	  e.raiseSalary(5);
      }
      // print out information about all Employee objects
      System.out.println("우리 회사 직원 수는" 
      + Employee.getEmployeeCount());
      for (Employee e : staff)
         System.out.println("ID:" + e.getId() + "name=" + e.getName() + 
        		",salary=" + e.getSalary() + ",hireDay=" 
        		+ e.getHireDay());
   }
}

