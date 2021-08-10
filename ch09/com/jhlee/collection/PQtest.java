package com.jhlee.collection;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PQtest {

    public static void main(String[] args) {
   	 var priQ = new PriorityQueue<LocalDate>();
   	 priQ.add(LocalDate.of(1979, 3, 19));
   	 priQ.add(LocalDate.of(1952, 2, 13));
   	 priQ.add(LocalDate.of(1971, 7, 5));
   	 priQ.add(LocalDate.of(1986, 1, 9));
   	 
   	 for (LocalDate bDay: priQ) {
   		 System.out.println(bDay);
   	 }
   	 System.out.println("Sorted");
   	 while (!priQ.isEmpty()) {
   		 System.out.println(priQ.remove());
   	 }
    }
}
