package vol1.testexam10;

public class Trainee {
	private String name;
	private int schoolnum;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSchoolnum() {return schoolnum;}
	public void setSchoolnum(int schoolnum) {this.schoolnum = schoolnum;}

	public Trainee(int schoolnum, String name) {
		super();
		this.name = name;
		this.schoolnum = schoolnum;
	}
	@Override
	public String toString() {
		return "학번: " + schoolnum + ", 이름: " + name ;
	}
	
	public static void main(String[] args) {
		Trainee trainee = new Trainee(22, "홍길동");
		System.out.println(trainee);
	}
}
