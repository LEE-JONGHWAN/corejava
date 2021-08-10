package chap_08.pair2;

import chap_08.generic.Employee;

public class Manager extends Employee implements Comparable{
	double bonus;

	public Manager(String string, double bonus) {
		super(string);
		this.bonus = bonus;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setBonus(int bonus) {
	this.bonus = bonus;
	}
}
