package Test6m24days;

import java.util.ArrayList;
import java.util.Random;

public class 운송업자test {
		public static void main(String[] args) {
			var 배달가능사람 = new ArrayList<배달가능>();
			var 대리가능사람 = new ArrayList<대리가능>();
			배달가능사람.add(new 오토바이주인("김할리"));
			배달가능사람.add(new 승용차주인("이보람"));
			대리가능사람.add(new 오토바이주인("김할리"));
			대리가능사람.add(new 승용차주인("이보람"));
			for (int i = 0; i < 2; i++) {
				Random r = new Random();
				int idx = (int) (r.nextDouble() * 2);
				배달가능사람.get(idx).배달한다("피자");
			}
			for (int j = 0; j < 3; j++) {
				Random t = new Random();
				int idx1 = (int) (t.nextDouble() * 2);
				대리가능사람.get(idx1).대리운전("대리 운전");
			}
		}
	}