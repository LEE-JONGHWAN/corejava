package hackerrank.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Triplets {
    public static List<Integer> 
    compareTriplets(List<Integer> a, 
    		List<Integer> b) {
    	var list = new ArrayList<Integer>();
    	for (int i = 0; i < 2; i++) {
    		list.add(0);
    	}
    	for (int i = 0; i < a.size(); i++) {
    		if (a.get(i) > b.get(i)){
    			list.set(0, list.get(0) + 1);
    		} else if (b.get(i) > a.get(i)) {
    			list.set(1, list.get(1) + 1);
    		}
    	}

    	return list;
    
    }
	public static void main(String[] args) {
		var alice = new ArrayList<Integer>();
		var bob = new ArrayList<Integer>();
		alice.add(35);
		alice.add(85);
		alice.add(95);
		bob.add(67);
		bob.add(67);
		bob.add(67);
		compareTriplets(alice, bob);
	}

}
