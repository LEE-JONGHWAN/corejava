package 연습.인터페이스;

/**
 * 
 * 여기에 있는 문장은 출력문으로서
 * Run과FirstCar의 클래스와 인터페이스를 참조하여 지정한 이름을 붙여 나머지
 * 문을 출력한다.
 * 
 * 
 * @author 이종환(Lee JongHwan)
 * @version 1.0.0
 *
 */

public class Going {

	public static void main(String[] args) {
		Run run = new FirstCar("에쿠스");
		run.run();
	}

}
