package chap_9.sec_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class GenericAlgo_1 {
		public static <T extends Comparable<T>> T max(Collection<T> c) {
			if (c.isEmpty())
				throw new NoSuchElementException();

			Iterator<T> iter = c.iterator();

			T largest = iter.next();
			while (iter.hasNext()) {
				T next = iter.next();
				if (largest.compareTo(next) < 0)
					largest = next;
			}
			return largest;
		}

		public static void main(String[] args) {
			String[] countries = { "대만", "싱가포르", "한국", "중국" };

			List<String> a = Arrays.asList(countries); // array
			System.out.println(max(a));

			List<String> v = new ArrayList<String>(a); // array list
			System.out.println(max(v));

			List<String> l = new LinkedList<String>(v); // linked list
			System.out.println(max(l));
		}
	}

