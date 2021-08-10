import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 6, 6, 7, 7, 7, 8};
		int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);  // 공장 메소드
//		<==> int[] arr2 = {4, 6};  // 공장 메소드
		// 이부분에서 2~4까지 출력하라는 부분과
		for(int i = 0; i < arr2.length; i++) {
			int j;
			System.out.println(arr2[i]);
		
		}
	}
}
