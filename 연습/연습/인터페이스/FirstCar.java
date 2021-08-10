package 연습.인터페이스;

/**
 * 
 * 여기에는 문장을 만들고
 * 인터페이스를 연결시켜서 어떤것을 출력하게 만들것인지를 지정한다.
 * 
 * 
 * 
 * @author 이종환(Lee JongHwan)
 * @version 1.0.0
 *
 */

public class FirstCar implements Run{
	private String name;
	
	public String getName() {
		return name;
	}
	
	public FirstCar(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(getName() + "80킬로 주행중...");
		
	}



}
