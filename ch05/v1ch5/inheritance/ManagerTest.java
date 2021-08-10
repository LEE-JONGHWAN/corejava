package v1ch5.inheritance;

/**
 * This program demonstrates inheritance.
 * @version 1.21 2004-02-21
 * @author Cay Horstmann
 */
public class ManagerTest
{
   public static void main(String[] args)
   {
      // construct a Manager object
      var boss = new Manager("박지성", 80000, 1987, 12, 15);
      boss.setBonus(10000); 
      boss.raiseSalary(7);
      
      var staff = new Employee[3];
//      Employee[] staff = new Employee[3];

      // fill the staff array with Manager and Employee objects

      staff[0] = boss;  // Manager 박지성
      staff[1] = new Employee("한반도", 50000, 1989, 10, 1);
      staff[2] = new Employee("고슴도", 40000, 1990, 3, 15);
//      ManagerTest test = (ManagerTest)boss;
      
      // print out information about all Employee objects
      for (Employee e : staff) { 
       System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
      }
      Employee f = null;
      if(!(f instanceof Manager)) {
    	  System.out.println("null" + "은 관리자이다.");
      }
   }
}

















