package CalendarTest;
/**
 * This program demonstrates static methods.
 * @version 1.02 2008-04-10
 * @author Cay Horstmann
 */
public class StaticTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      var staff = new Employee[3];

      staff[0] = new Employee("Tom", 40000);
      staff[1] = new Employee("Dick", 60000);
      staff[2] = new Employee("Harry", 65000);

      // print out information about all Employee objects
      for (Employee e : staff)
      {
         e.getId();
         System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
            + e.getSalary());
      }

      int n = Employee.getNextId(); // calls static method
      System.out.println("Next available id=" + n);
   }
   static class Employee {
		
	   private static int nextId = 1;

	   private String name;
	   private double salary;
	   private int id;

	   public Employee(String name, double salary)
	   {
	      this.name = name;
	      this.salary = salary;
	      this.id = 0;
	   }

	   public Employee(String name2, int salary2) {
		// TODO Auto-generated constructor stub
	}

	public String getName()
	   {
	      return name;
	   }

	   public double getSalary()
	   {
	      return salary;
	   }

	   public int getId()
	   {
	      return id;
	   }

	   public void setId()
	   {
	      id = nextId; // set id to next available id
	      nextId++;
	   }

	   static int getNextId()
	   {
	      return nextId; // returns static field
	   }

	   public static void main(String[] args) // unit test
	   {
	      var e = new Employee("Harry", 50000);
	      System.out.println(e.getName() + " " + e.getSalary());
	   }
	   
	   public void raiseSalary(double byPercent)
	   {
	      double raise = salary * byPercent / 100;
	      salary += raise;
	   }
	}
   
}


