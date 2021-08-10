package interfaces.lambda;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.swing.Timer;


class Greeter {
	public void damnit(ActionEvent event) {
		LocalDateTime tm =
			    LocalDateTime.ofInstant( Instant.ofEpochMilli(
				event.getWhen()), ZoneId.systemDefault());
		System.out.println("시간: " + tm.toString());
	}
}
class SubGreeter extends Greeter {
	public void greet() {
		var timer = new Timer(1000, this::damnit); // 상속받고 있어서 this나super 양쪽다 실행된다.
		timer.start();
	}
}
public class DelNullElt {
	public static void main(String[] args) {
		var obj = new SubGreeter();
		obj.greet();
		System.out.println("Enter any key");
		try {
			System.in.read();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


