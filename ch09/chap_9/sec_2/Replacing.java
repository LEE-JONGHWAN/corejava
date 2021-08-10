package chap_9.sec_2;

import java.util.LinkedList;
import java.util.List;

public class Replacing {

	public static void main(String[] args) {
		List<String> words = new LinkedList<String>();
		words.add("CPP+");
		words.removeIf(w -> w.length() <= 3);
		words.replaceAll(String::toLowerCase);
		System.out.println();
	}

}
