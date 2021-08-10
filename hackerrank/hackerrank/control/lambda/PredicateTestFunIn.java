package hackerrank.control.lambda;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Supplier;

class DefaultDate implements Supplier<LocalDate>{
	@Override
	public LocalDate get() {
		return LocalDate.of(2013, 1, 2);
	}
}
public class PredicateTestFunIn {

	public static void main(String[] args) {
		LocalDate ld = null;
		LocalDate empDate = 
				Objects.requireNonNullElseGet(
						ld, 
						new DefaultDate());
//						()->LocalDate.of(2013, 1, 2));  
		System.out.println(empDate);
	}
}
