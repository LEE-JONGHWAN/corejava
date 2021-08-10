package hackerrank.control.lambda;

import java.util.ArrayList;

public class PredicateTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList();
		names.add("순희");
		names.add(null);
		names.add("미자");
		System.out.println("전: " + names.size()); // 3
		names.removeIf ( e->(e == null) ); // null 요소 (1 개) 제거
		System.out.println("후: " + names.size()); // 2
	}

}
