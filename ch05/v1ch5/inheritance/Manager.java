package v1ch5.inheritance;

public class Manager extends Employee {
   private double bonus;

   /**
    * @param name the employee's name
    * @param salary the salary
    * @param year the hire year
    * @param month the hire month
    * @param day the hire day
    */
   public Manager(String name, double salary, int year, int month, int day) {
	  super(name, salary, year, month, day);
      bonus = 0;
   }

   @Override
   public Manager getBuddy() {
	   return null;
   }
   
   /**
    *  관리자 급여 반환(보너스 포함)
    */
//   @Override
   public double getSalary() {
      return super.getSalary() + bonus;
   }
   
   public void setBonus(double b) {
      bonus = b;
   }
}
