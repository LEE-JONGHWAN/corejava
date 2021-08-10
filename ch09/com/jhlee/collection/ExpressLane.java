package com.jhlee.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import com.jbpark.utility.JLogger;

import chap_08.generic.Employee;
import chap_08.generic.Manager;

public class ExpressLane {
	
	private static Manager[] getManagers() {
		Manager[] manager3= new Manager[3];
	
		manager3[0] = new Manager("김", 550);
		manager3[1] = new Manager("이", 400);
		manager3[2] = new Manager("최", 900);
		return manager3;
	}
	
	public static void main(String[] args) {
		
		if (iteratorRemove2(getManagers()))
			return;
		
		if (iteratorRemove())
			return;
		
		if (forEaRemaining())
			return;
		
		if (arraysAsListTest()) 
			return;
		
		if (testIterator())
			return;
		if (testLoggerMethodRefer())
			return;
		collectionTest_1();
	}
	
	private static boolean iteratorRemove2(Manager[] manager3) {
//		var managers = Arrays.asList(manager3);
//		managers.removeIf(m->m.getBonus() > 600);
		
		var manList =new LinkedList<Manager>();
		manList.add(manager3[0]);
		manList.add(manager3[1]);
		manList.add(manager3[2]);

		manList.removeIf(m->m.getBonus() > 600);
		
var manLinked =new LinkedList<Manager>();
manLinked.add(manager3[0]);
manLinked.add(manager3[1]);
manLinked.add(manager3[2]);

manLinked.removeIf(m->m.getBonus() > 600);

		return true;
	}

	private static boolean iteratorRemove() {
		Deque<String> words = new ArrayDeque<String>();
		words.add("happy");
		words.add("행복");
		var iter = words.iterator();
		while (iter.hasNext()) {
			iter.next();
			iter.remove();
		}
		logger.config("size: " + words.size());
		return true;
	}

	private static boolean forEaRemaining() {
		Manager[] manager3= new Manager[3];

		manager3[0] = new Manager("김", 550);
		manager3[1] = new Manager("이", 400);
		manager3[2] = new Manager("최", 900);

//		Object obj  = Arrays.asList(manager3).iterator();
//		Arrays.asList(manager3).iterator().
//			forEachRemaining((Executive m)
//					->logger.config((m).toString()));
Arrays.asList(manager3).iterator().
	forEachRemaining(m
		->logger.config((m).toString()));
		Arrays.asList(manager3).iterator().
			forEachRemaining((Employee m)
					->logger.config((m).toString()));

		return true;		
	}

	private static boolean arraysAsListTest() {
		String[] words = { "기쁨", "만화경", "구름 9" };
		List<String> wList = Arrays.asList(words);
//		words.iterator();
		for (String word : words)
			logger.config(word);

		return true;
	}

	private static boolean testIterator() {
		var words = new ArrayList<String>();
		words.add("기쁨");
		words.add("만화경");
		words.add("구름9");

//		Iterator<String> iStr = words.iterator();
		try {
			for (String element : words) {
				logger.config(element);
			}
		} catch (Exception e) {
			logger.severe(e.toString());
		}

		return true;
	}



	private static boolean testLoggerMethodRefer() {
//		Collection<Employee> expressLane = new ArrayDeque<Employee>(100);
		Collection<Employee> expressLane = new LinkedList<Employee>();
		
		expressLane.add(new Employee("동현", 5000, 2020,1,1));
		expressLane.add(new Employee("민자2",5000, 2020,1,1));
		if (logUsingMethodRef(expressLane))
			return true;
		else 
			return false;
	}

	private static boolean logUsingMethodRef(
			Collection<Employee> expressLane) {
		expressLane.stream().map(Employee::toString) 
			.forEach(logger::config); // 메소드 참조를 사용
		return true;
	}
	
	private static Logger logger = JLogger.getLogger();
	private static void collectionTest_1() {
		Collection<Employee> expressLane 
				= new ArrayDeque<Employee>(100);
//		var expressLaneVar
//		= new ArrayDeque<Employee>(100);
//		expressLane.add(new Employee("동현"));
//		expressLane.add(new Employee("민자"));
		if (!expressLane.isEmpty()) {
			Iterator<Employee> empIterator = expressLane.iterator();
			
			while (empIterator.hasNext()) {
				logger.info(empIterator.next().toString());
			}
		}
		
	}

}
