package compareTo.study.able;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import compareTo.study.Hobi;


public class ClassATest {

	public static void main(String[] args) {
		List<ClassA> items = new ArrayList<>();
		items.add(new ClassA(3, "행복"));
		items.add(new ClassA(2, "행복"));
		items.add(new ClassA(1, "행복행복행복"));
		items.add(new ClassA(3, "행복"));
		Collections.sort(items);
		System.out.println();
	}
}
