package interfaces.lambda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class CompComparing {
	public static void main(String[] args) {
		Person[] threePeople = new Person[3];
		threePeople[0] = new Person("김");
		threePeople[0].setbDay(LocalDate.of(2006, 8, 19));
		threePeople[1] = new Person("이");
		threePeople[1].setbDay(LocalDate.of(1972, 1, 3));
		threePeople[2] = new Person("박");
		threePeople[2].setbDay(LocalDate.of(1999, 3, 1));

//		Arrays.sort(threePeople, Comparator.comparing(Person::getBirthDay));
		Arrays.sort(threePeople, (o1, o2) -> o1.birthDay.compareTo(o2.birthDay));
//		Arrays.sort(threePeople, Comparator.comparing(Person::getName));
		System.out.println();
	}
}
