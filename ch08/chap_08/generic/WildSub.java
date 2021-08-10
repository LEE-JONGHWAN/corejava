package chap_08.generic;

import java.util.logging.Logger;

import com.jhlee.logger.JLogger;

import chap_08.pair2.Pair;


public class WildSub {
	Pair<? extends Manager> p = new Pair<>();
	Pair<Manager> manSubPair = new Pair<>();
	private static Logger logger = JLogger.getLogger();
	
	public static void printBuddies(Pair<? extends Employee> p) {
		Employee first = p.getFirst();
		Employee second = p.getSecond();
		logger.config(first.getName() + "과 "
				+ second.getName() + "는 친구다.");
	}
	public static <T extends Comparable<T>> T min(T[] a) {
		if (a.length == 0)
			return null;
		T min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0)
				min = a[i];
		}
		return min;
	}

	public static void minmaxBonus(Manager[] a, 
			Pair<? super Manager> result) throws Exception {
		if (a.length == 0) return;
		
		Integer[] data = {1, 3, 4, -5};
		Manager min = a[0];
		Manager max = a[0];
		for (int i = 1; i<a.length; i++) {
			if (min.getBonus() > a[i].getBonus()) 
				min = a[i];
			if (max.getBonus() < a[i].getBonus()) 
				max = a[i];
		}
		result.setFirst(min); // 기록 허용, 참조
		result.setSecond(max);
	}

	public static void main(String[] args) {
		Pair<? super Manager> p1 = 
				new Pair<Employee>(
						new Employee(null), 
						new Employee(null));
		
		Pair<Employee> p2 = new Pair<Employee>(
				new Employee(null),
				new Employee(null));
		Pair<Manager> p3 = new Pair<Manager>(
				new Manager(null), 
				new Manager(null));
		Pair<Object> p4 = new Pair<>(
				new Object(), new Object());
		p1 = p2; 
		p1 = p3; 
		p1 = p4; 
//		p2 = p1; // error - Manager 의 수퍼이니 Object 가 
					// 올 수 있고. 이것은 막아야 되니...
		p2.setFirst(p3.getFirst());
		p1.setFirst(new Manager(null));

			Pair<? super Manager> manPair = new Pair<Manager>();
			manPair.setFirst(new Manager("이"));
			manPair.setFirst(new Executive("이"));
			manPair.setFirst(new Employee("이")); //컴파일 오류

			Pair<Employee> ep = new Pair<Employee>();
		ep.setFirst(null);
		Pair<Manager> mp = new Pair<Manager>();
		mp.setFirst(null);

		printBuddies(ep);
		printBuddies(mp);

		var mFriends = new Pair<Manager>(
				new Manager("경영자"), 
				new Manager("공장장"));
		Pair<? extends Employee> wildFriends = null;
		wildFriends.setFirst(new Employee()); // 컴파일 오류(치환 거부), 참고
		Employee emp =  wildFriends.getFirst();

	}

}

