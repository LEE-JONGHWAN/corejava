package Test6m24days;

public class 오토바이주인 extends 운송업자 implements 배달가능,대리가능 {

	public 오토바이주인(String name) {
		super(name);
	}
	@Override
	public void 배달한다(String string) {
		System.out.println(getName() + "/가 오토바이로 " + string +  " 배달");
	}
	@Override
	public void 대리운전(String string) {
		System.out.println(getName() + "/가 오토바이로 " + string  + "불가");
	}

}
