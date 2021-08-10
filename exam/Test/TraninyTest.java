package Test;
import java.util.Random;

enum MySubject {
	 자바,
	마리아DB
}
class Trainee {
	static int currID = 101;
	static Random random = new Random();
	int id;
	String name;
	MySubject subject;
	
	Trainee (String name) {
		id = currID++;
		this.name = name;
		MySubject[] sArr = MySubject.values();
		this.subject = sArr[random.nextInt(sArr.length)];
	}
}


public class TraninyTest {

	public static void main(String[] args) {
		System.out.println("훈련생 ID    훈련생 이름    집중 과목  ");
		for (int i = 0; i < 5; i++) {
			Trainee trainee = new Trainee("훈련생" + i);
			System.out.println( "  " + trainee.id + "        " + trainee.name + "        " + trainee.subject);
		}
	}
}
