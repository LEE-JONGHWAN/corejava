package wrapper;

import java.util.Arrays;
import java.util.Scanner;

public class PrimWrapperTest {

	private static double addNumbers(Number...data) {
		double sum = 0;
		for(Number n : data) {
			sum += n.doubleValue();
		}
		return sum;
	}

	public static double max(double... values) {
		double largest = Double.NEGATIVE_INFINITY;
		for (double v : values)
			if (v > largest)
				largest = v;
		return largest;
	}

	public static void main(String...args) {
		Scanner scanner = new Scanner(System.in);
		Size[] values = Size.values();
		String[] names = Size.names();
		String[] options = Size.options();
		System.out.println(String.join(" ,", names));
		System.out.println(Arrays.toString(Size.names()));
		for(Size s: values) {
		System.out.println(s + "(" + 
		s.getAbbreviation() + ")");
		}
		System.out.println(options + "선택은: ");
		String input = scanner.nextLine();
		input = input.trim().toUpperCase();
		Size size = null;
//		Size size = Enum.valueOf(Size.class, input);
		
		switch(input) {
		case "SMALL" :
		case "S" :
			size = Size.SMALL;
			System.out.println("소");
			break;
		case "MEDIUM" :
		case "M" :
			size = Size.MEDIUM;
			System.out.println("중");
			break;
		case "LARGE" :
		case "L" :
			size = Size.LARGE;
			System.out.println("대");
			break;
		case "EXTRA_LARGE" :
		case "XL" :
			size = Size.EXTRA_LARGE;
			System.out.println("특대");
			break;
		}
		
		switch (size) {
		case SMALL :
			size = Size.SMALL;
			System.out.println("소");
			break;
		case MEDIUM :
			size = Size.MEDIUM;
			System.out.println("중");
			break;
		case LARGE :
			size = Size.LARGE;
			System.out.println("대");
			break;
		case EXTRA_LARGE :
			size = Size.EXTRA_LARGE;
			System.out.println("특대");
			break;
		
		}
		
//		public static void main(String[] args) {
		addNumbers(3, 4.5, 6f, 30000000000L);
		int i = Integer.MAX_VALUE;
		
//		double mx = max(3.1, 40.4, -5);
//		System.out.println();

//		int[] data = {10};
//		passIntArray(data);
//		System.out.println(data[0]);
//
//		ArrayList<Integer> numbers = new ArrayList<>();
//		Integer sevenInt = Integer.valueOf(7);
//		triple(sevenInt);
//		boolean b = sevenInt == sevenInt2;
//		b = sevenInt.equals(sevenInt2);
//		int seven = sevenInt.intValue();
//		
//		numbers.add(Integer.valueOf(7));
//		numbers.add(8);
//		
//		
//		int j = numbers.get(0);
		System.out.println();
	}

}
