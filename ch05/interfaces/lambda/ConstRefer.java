package interfaces.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface TriFunction<R, S, T, U> {
	U apply(R r, S s, T t);
}

public class ConstRefer {
	
	static private void constRefer() {
		ArrayList<String> names = new ArrayList<>();
		names.add("김");
		names.add("이");
		names.add("박");
		Stream<Person> stream = names.stream().map(Person::new);
		List<Person> people = stream.collect(Collectors.toList());
		System.out.println(people.toString());
	}

	public static void main(String[] args) {
		Function<Integer, Double> fi = a -> a / 2.0;
		double d = fi.apply(3);

		String chois = "최부자";
		TriFunction<String, LocalDate, Person> sp2 = Person::new;
		Person mrChoi2 = sp2.apply(chois, LocalDate.now() ,"바둑");

		
//				constRefer();
//		Function<String, Person> sp = Person::new;
//		Person mrChoi = sp.apply(chois);
//		
//		BiFunction<String, LocalDate, Person> sp2 = Person::new;
//		Person mrChoi2 = sp2.apply(chois, LocalDate.now());
//		System.out.println();
	}

}
