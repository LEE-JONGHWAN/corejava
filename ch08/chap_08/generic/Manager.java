package chap_08.generic;

public class Manager extends Employee implements Comparable<Manager>{
	private double bonus;
	private String name;

	public Manager(String string, double bonus) {
		super(string);
		this.bonus = bonus;
	}

	public Manager(String string) {
		super(string);
	}

	@Override
	public int compareTo(Manager o) {
		return Double.compare(this.bonus, o.bonus);
	}

	public double getBonus() {
		return this.bonus;
	}
	public void setBonus(double bonus) {
	this.bonus = bonus;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "관리자 [bonus=" + bonus + " name= " +  name + "]";
	}




	
}
