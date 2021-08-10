package abstractClasses;

import java.util.Arrays;
import java.util.Comparator;

class EmpCompare implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e1.getSalary(), e2.getSalary());
	}
}
class ManCompare implements Comparator<Manager> {
	@Override
	public int compare(Manager e1, Manager e2) {
		return Double.compare(e2.getSalary(), e1.getSalary());
	}
}

public class Manager extends Employee 
{
	double bonus;
	
	@Override
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject)) return false;
		Manager other = (Manager) otherObject;	
		return this.bonus == other.bonus;		
	}
	
	public static void main(String[] args) {
		Manager me = new Manager("김갑돌", 12000, 2001, 3, 4);
		me.setBonus(5000);
		Manager you = new Manager("갑순이", 11000, 2001, 3, 4);
		you.setBonus(5000);
		Manager she = new Manager("삼순이", 13000, 2001, 3, 4);
		she.setBonus(5000);
		Manager[] managers = new Manager[3];
		managers[0] = me;
		managers[1] = you;
		managers[2] = she;
		
//		Arrays.sort(managers, (e1, e2) ->  
//			Double.compare(e1.getSalary(), e2.getSalary()));
//			Arrays.sort(managers, new ManCompare());
			Arrays.sort(managers, new EmpCompare());
			
		System.out.println(Arrays.toString(managers));
	}
	@Override
	public String toString() {
		return super.toString() + ", 보너스=" + bonus;
	}
	public Manager(String name, double salary, 
		   	int year, int month, int day) {
	  super(name, salary, year, month, day);
      bonus = 0;
   }

	void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
   public String getDescription() {
   	return super.getDescription() + ", 보너스" + bonus;
	}

   public double getSalary() {
      return super.getSalary() + bonus;
   }


//	public int compareTo(Employee o) {
//		double totalSalary = getSalary() + bonus;
//		Manager other = (Manager) o;
//		double totalSalaryOther
//		= other.getSalary() + other.bonus;
//		
//		return Double.compare(totalSalary, totalSalaryOther);
//}

}
