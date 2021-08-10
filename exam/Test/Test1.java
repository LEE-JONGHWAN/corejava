package Test;
import java.text.DecimalFormat;

public class Test1 {

	public static void main(String[] args) {
		// 2 ** 40 -1, 16진수 11자리
		double result = Math.pow(2, 40) -1;
		System.out.printf("%011x",(long)result);

	}

}
