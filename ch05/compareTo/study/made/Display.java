package compareTo.study.made;

public class Display implements No1 {
	private String name;
	private String level;
	
	public String getName() {
		name = "LG전자";
		return name;
	}
	public String getLevel() {
		level = "OLED";
		return level;
	}
	
	@Override
	public void WorldClass() {
		System.out.println(getName()
				+ "의 기술은 세계 1등 이고\n" 
				+ getLevel() + " 의 기능을 TV에 탑재하고 있다.");
	}
}
