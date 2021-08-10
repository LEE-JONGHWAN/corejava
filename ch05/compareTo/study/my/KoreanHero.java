package compareTo.study.my;

public class KoreanHero implements CanFly {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public KoreanHero(String name) {
		super();
		this.name = name;
	}

	@Override
	public void fly()  {
		System.out.println(getName() 
				+ "시속 1000킬로 비행 중");
	}
}
