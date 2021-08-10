package hackerrank.control.lambda;

import java.util.function.Predicate;

public class DeleteNull implements Predicate<String> {
	@Override
	public boolean test(String t) {
		return t != null;
	}
}
