package abstractClasses;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This program demonstrates abstract classes.
 * @version 1.01 2004-02-21
 * @author Cay Horstmann
 */
public class PersonTest
{
   public static void main(String[] args)
   {
//	  Admin2 adm2 = new Admin2(null, 0, 0, 0, 0) 
//	  LocalDate hDay =adm2.hireDay; 
			  
      Person[] people = new Person[3];

      // fill the people array with Student and Employee objects
      people[0] = new Manager("대단해", 35000, 2020, 1, 1);
      ((Manager)people[0]).setBonus(6000); 
      people[1] = new Employee("함제도", 50000, 1999, 10, 1);
      people[2] = new Employee("Harry Hacker", 60000, 1999, 10, 2);
      Arrays.sort(people);
      System.out.println();
      ArrayList<Integer> test = new ArrayList<>();
      test.isEmpty();
      
//      System.out.println("여러분 안녕?");
      System.out.println(people[0]);
      

//      if(people[0].equals(people[1]) && people[0].hashCode() ==  people[1].hashCode())
//    	  System.out.println("same");
//      else
//    	  System.out.println("diff");
//      int code = people[0].hashCode();
//      System.out.println(code);
//      code = people[1].hashCode();
//      System.out.println(code);
      
//      people[1] = new Manager("대단효", 100000, 2020, 1, 1);
//      people[2] = new Manager("대단해", 100000, 2020, 1, 1);
      
//      System.out.println(people[0].equals(null)); // false
//      System.out.println(people[0].equals(people[0])); // true
//      System.out.println(people[0].equals(people[1])); // false
//      System.out.println(people[0].equals(people[2])); // true

      
//      System.out.println(people[0].equals(null)); // false
//      System.out.println(people[0].equals(people[0])); // true
//      System.out.println(people[0].equals(people[2])); // false
//      System.out.println(people[0].equals(people[1])); // true

//      people[1] = new Student("Maria Morris", "computer science");
      // print out names and descriptions of all Person objects
      for (Person p : people) {
//       p.setName("김동만");
    	  System.out.println(p.getDescription());
      }
   }
}
