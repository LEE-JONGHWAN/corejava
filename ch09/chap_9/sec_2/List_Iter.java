package chap_9.sec_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;

public class List_Iter {

	public static void main(String[] args) {
		List_Iter lst = new List_Iter();
		lst.testListIterator();
	}

//	30 [ 0 ] * 23
	private void testListIterator() {
		List<Integer> ages = new ArrayList<>();
		ages.add(59);
		ages.add(58);
		ages.add(30);
		ages.add(23);
		ListIterator<Integer> lii = ages.listIterator();
		while (lii.hasNext()) {
			if (lii.next() == 30) {
				lii.add(0);
				break;
			}
		}
		Logger.getGlobal().info(ages.toString());
	}

}
