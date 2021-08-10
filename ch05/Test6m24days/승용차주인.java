package Test6m24days;

public class 승용차주인 extends 운송업자 implements 배달가능,대리가능 {
	
	public 승용차주인(String name) {
		super(name);
	}
	@Override
	public void 배달한다(String string) {
		System.out.println(getName() + "/가 승용차로 " + string + " 배달");
	}
	@Override
	public void 대리운전(String string) {
		System.out.println(getName() + "/가 승용차로 " + string + " 가능");
	}

}
