/**
 * 
 * @author jong4
 *
 */
public class CallByValueButChangesObjectStatus {
	 void increaseSalaryByGivenPercent(Employee2 x) { //work
	   x.raiseSalary(20);
	}

	
public static void swap(Employee2 x, Employee2 y) // doesn't work
{
   Employee2 temp = x;
   x = y;
   y = temp;
}


	public static void main(String[] args) {
		Employee2 myself = new Employee2("김진후", 1_0000_0000,2010, 1, 2);
		Employee2 yoself = new Employee2("허진희", 1_0000_0000,2010, 1, 2);
		swap(myself,yoself);
		CallByValueButChangesObjectStatus call = new 
				CallByValueButChangesObjectStatus();

		System.out.printf("%10.0f", myself.getSalary());
	}
}
	
