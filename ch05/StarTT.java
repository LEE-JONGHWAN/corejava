
public class StarTT {

	public static void main(String[] args) {
		 for(int i = 1; i <= 5; i++) { //5개의 줄을 생성한다.
			 for(int j = 5; j > 0; j--) { //5부터 줄어드는 반복문.
				if(j > i) {
					System.out.print(" ");
				
				}else {
					System.out.print("*");
				}
			 
			 }
			 System.out.println();
		 }
		 
	}

}
