package loader;


public class IOExcepTest {

	public static void main(String[] args) {
		int[] data = {1, 2, 3};
//		System.out.println(data[-1]);
		throw new ArrayIndexOutOfBoundsException("data 배열 인덱스 오류");
	}

}
