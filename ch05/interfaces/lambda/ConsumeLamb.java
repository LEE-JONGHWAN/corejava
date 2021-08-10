package interfaces.lambda;

import java.util.function.IntConsumer;

class PrintGreet implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello, World!");

	}
}

public class ConsumeLamb {

	static void repeat(int count, IntConsumer action) {
		for (int i = 0; i < count; i++) {
			action.accept(i); // action 은 (무명객체) 참조, accept 구현은 (실인자)람다식.
		}
	}

	static void repeat(int count, Runnable action) { // 반복횟수 및 할일 
		for (int i = 0; i < count; i++) {
			action.run();
		}
	}
	
	static void repeat2(int count, IntConsumer runner) { // 버전2
		runner.accept(count);
	}


	
	public static void main(String[] args) {
//		IntConsumer iCons =(n) -> {
//			for (int i = 0; i < n; i++) {
//				System.out.println("안녕 ");
//			}
//		}; 
//	
//		iCons.accept(2);
//		iCons.accept(3);
//	}}	
		repeat2(4, (n) -> {
			for (int i = 0; i < n; i++) {
				System.out.println("안녕 ");
			}
		}); 
	}}
		
//		repeat(3, (n) -> System.out.println("Hello, World!" + n));
//		repeat(10, () -> System.out.println("Hello, World!"));
//		repeat(10, new PrintGreet());


