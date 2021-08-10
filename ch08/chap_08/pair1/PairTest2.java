package chap_08.pair1;

import java.time.LocalDate;

import chap_08.pair2.Manager;

interface TaggingInterface{
	
}

public class PairTest2 {
	static void tagInfTest(TaggingInterface ti) {
	}
	
	   public static void main(String[] args){
		   tagInfTest(new TaggingInterface() {});
		   
	      String[] words = { "대한", "민국", "민주", "공화", "화려강산" };
	      Double[] values = { 1.0, -45.0, 500.0 };
//	      Manager[] mans = {new Manager("이")};
	      LocalDate[] bDates = {LocalDate.of(2010, 1, 1),
	    		  LocalDate.of(2021, 1, 1),
	    		  LocalDate.of(2015, 1, 1)};

	      Pair<LocalDate> mm = minmax(bDates);
//	      Pair<String> mm = minmax(words);
//	      Pair<Double> mm1 = minmax(values);
	      
	      System.out.println("min = " + mm.getFirst());
	      System.out.println("max = " + mm.getSecond());
//	      System.out.println("min = " + mm1.getFirst());
//	      System.out.println("max = " + mm1.getSecond());
	   }
	   
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0)
			return null;
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0)
				min = a[i];
			if (max.compareTo(a[i]) < 0)
				max = a[i];
		}
		return new Pair<>(min, max);
	}
}
