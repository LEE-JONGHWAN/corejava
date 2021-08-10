package chap_08.generic;

public class Executive extends Manager {
	String area;
	
	public Executive(String string, double bonus, String area) {
		this(string, bonus);
		this.area = area;
	}

	public Executive(String string, double bonus) {
		super(string, bonus);
	}

	public Executive(String string) {
		super(string);
	}
	
	

	@Override
	public String toString() {
		return "경영진 [분야=" + area + "]" + super.toString();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
