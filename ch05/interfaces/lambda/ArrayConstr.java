package interfaces.lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayConstr {

	public static void main(String[] args) {
		String names = "김 이 박";
		Stream<String> stream = Arrays.stream(names.split("\\s+"));

		Stream<Person> personStream = stream.map(Person::new);
		Person[] people = personStream.toArray(Person[]::new);
		
		System.out.println();

	}

}
