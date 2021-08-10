package v1ch5.inheritance;

import java.time.*;

public class Employee {
   private String name;
   private double salary;
   private LocalDate hireDay;

   public Employee() {
   }
   
   public Employee(String name, double salary, int year, int month, int day) {
      this.name = name;
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName() {
	   return name;
   }
   
   public Employee getBuddy() {
	   return null;
   }
   
   /**
    *  sarlary return
    * @return
    */
   public double getSalary() {
      ManagerTest2 m2 = new ManagerTest2();
      m2.f(3.4);
	   return salary;
   }

   public LocalDate getHireDay() {
      return hireDay;
   }

   public void setName(String name) {
	this.name = name;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public void setHireDay(LocalDate hireDay) {
	this.hireDay = hireDay;
}

public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}
