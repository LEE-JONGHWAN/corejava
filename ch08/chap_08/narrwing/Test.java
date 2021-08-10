package chap_08.narrwing;

import com.ospa.logging.Employee;

import chap_08.generic.Manager;


public class Test {

	public static void main(String[] args) {
		double d = 4.5;
		int i = 100;
		d = i;

		Manager m = null;
		Manager e = m;
		Manager[] ea = {e};
		Manager[] ma = ea;
		ma[0].getBonus();
		
//		Double e = (Integer) 3.4; 
//		Object da = (Integer[])null;
	}

}
