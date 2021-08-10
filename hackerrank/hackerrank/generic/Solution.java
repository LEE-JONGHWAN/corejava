package hackerrank.generic;

import java.lang.reflect.Method;
import java.util.stream.Stream;

public class Solution {
	
static class Printer{
//	public <T> void printArray(T[] StringArray) {
//		for(T element : StringArray) {
//			System.out.println(element);
//		}
//	}
	public <T> void printArray(T[] StringArray) {
//        Stream<T> stream = Arrays.stream(StringArray);
        var stream = Stream.of(StringArray);
        stream.forEach(System.out::println);
//      stream1.forEach(x -> System.out.println(x));
	}
}
	
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
