package compareTo.study;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.length() - o1.length();
	}
	public static void main(String[] args) {
		String[] people = {"김길수", "이공", "박혁거세" };
		Arrays.sort(people, new LengthComparator());
		System.out.println();
	}
}
