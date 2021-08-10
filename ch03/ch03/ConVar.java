package ch03;

public class ConVar {
	public static void main(String[] args) {
		double salary = 65000.0;
		int vacationDays = 12;
		long earthPopulation;
		boolean done;
		System.out.println(vacationDays); // ERROR--variable not initialized
		
		System.out.println(vacationDays);
		System.out.println(salary);
	}
}
