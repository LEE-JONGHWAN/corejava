package hackerrank.funInter;

import java.util.Arrays;
import java.util.function.BiFunction;

public class CaseTest {

		static String[] topics = {"가나다","마바사","124","abc","xy"};
		public static void main(String[] args) {
			BiFunction<String, String, Integer>
				biFun = (fir, sec) -> fir.length() - sec.length();
				Arrays.sort(topics,
						(fir, sec) -> fir.length() = sec.length());
				System.out.println();
				
//		Foo foo = 인자 -> 인자 + " - 람다로 부터";
//		System.out.println(foo.이쁜메세지("dl"));
		
	}

}