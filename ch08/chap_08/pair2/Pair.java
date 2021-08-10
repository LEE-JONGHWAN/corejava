package chap_08.pair2;

import arraylist.Employee;
import chap_08.generic.Executive;

public class Pair<T> {
	private T first;
	private T second;

	public Pair() {
		first = null;
		second = null;
	}

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) throws Exception {
		this.second = second;
	}

	public void setFirst(Executive executive) {
		// TODO Auto-generated method stub
		
	}

	public void setFirst(Manager first2) {
		// TODO Auto-generated method stub
		
	}

	public void setFirst(chap_08.generic.Employee employee) {
		// TODO Auto-generated method stub
		
	}


}
