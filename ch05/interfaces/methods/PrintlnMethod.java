package interfaces.methods;

import java.util.ArrayList;
import java.util.Objects;

class ABC {
	static boolean test(Integer score) {
		if (score < 60) {
			return true;
		} else {
			return false;
		}
	}
}

public class PrintlnMethod {
	
	public  static void main(String[] args) {

		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(89);
		scores.add(58);
		scores.add(null);
		scores.add(23);
		System.out.println(scores.size()); // 4
		scores.removeIf(e->e==null); // e->e==null Objects::isNull
		boolean anyremoved = scores.removeIf(ABC::test); // e->e==null Objects::isNull
//		scores.removeIf(e-> e < 40); // e->e==null Objects::isNull
		System.out.println(scores.size()); // 3

		
		
		
//		String[] names = {"abba", "Test", "Korea", "happy"};
//		Arrays.sort(names);
//		System.out.println(Arrays.deepToString(names)); 
//			// [Korea, Test, abba, happy]
//		Arrays.sort(names, String::compareToIgnoreCase);
//		System.out.println(Arrays.deepToString(names));
//			// [abba, happy, Korea, Test]
		
		
//		Runnable printLine = System.out::println;
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i);
//			printLine.run();
//		}
		
//Timer tmr = new Timer(1000, e -> System.out.println(e.getWhen()));
//tmr.start();
//JOptionPane.showMessageDialog(null, "그만 할래?");
//System.exit(0);

//Timer tmr = new Timer(1000, System.out::println);



		
		
	}
}
