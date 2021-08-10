package chap_08.generic;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class ArrayAlg {
	private static Logger logger = Logger.getGlobal();	
////	private static Logger logger = JLogger.getLogger();	
	public static <T>T getMiddle(T...a) {
			return a[a.length / 2];
}
		public static <T extends Comparable > T min(T[] a) { // 거이 맞다
			if (a == null | a.length == 0) return null;
			T smallest = a[0];
			for (int i = 1; i < a.length; i++)
				if (smallest.compareTo(a[i]) > 0)
					smallest = a[i];
			return smallest;
		}

	public static void main(String[] args) throws SecurityException, IOException {
		logger.addHandler(new FileHandler());
//		var str = ArrayAlg.getMiddle("산은", "산2", "물은");
//		double str = ArrayAlg.getMiddle(1.57, (double)3, (double)2);
		Object str = ArrayAlg.getMiddle("1.57", 3, null);
		logger.info("mid: " + str);
		System.out.println(str);
	}
}

