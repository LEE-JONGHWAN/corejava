package v1ch5.inheritance;

/**
 * This program demonstrates inheritance.
 * @version 1.21 2004-02-21
 * @author Cay Horstmann
 */
public class ManagerTest2 {
	void f(double d) {
		return;
	}
	
	void f(long d) {
		return;
	}
	
	void f(float d) {
		return;
	}
   public static void main(String[] args) {
	   ManagerTest2 t = new ManagerTest2();
	   t.f(100L);
	   Manager[] managers = new Manager[10];
	   Employee[] staff = managers;
	   staff[0] = new Manager("이", 1, 2000, 11, 11);
	   managers[0].setBonus(5000);
	   System.out.println();
	   
   }
}
