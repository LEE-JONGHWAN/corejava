package excep.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


 class InputNotSufficientException extends IOException {
	 /**
	 * 
	 */
	private static final long serialVersionUID
		= -1264392062735226946L;
	/**
	 * 
	 * @param detailedExcepMessage 예외의 상세 설명글
	 */
	public InputNotSufficientException(String detailedExcepMessage) {
		super(detailedExcepMessage);
	}
}

public class EOFExcepTest {

	/**
	 * 
	 * @param args
	 * @throws InputNotSufficientException 
	 */
	public static void main(String[] args)
		throws InputNotSufficientException {
	int count = 300;
//	int i = 0;

	try (var scanner = new BufferedReader(
			new FileReader("resources\\input.txt"))) {
		for (int i = 0; i < count; i++) {
			int charCode = scanner.read();
			if (charCode == -1)
				throw new InputNotSufficientException("불충분 문자 수: " + i);
		}
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}

	
	
//	try (Scanner scanner = new Scanner
//			(new File("resources\\input.txt"))) {
//		for (i = 0; i < count; i++) {
//			scanner.nextInt();
//		}
//	} catch (FileNotFoundException e1) {
//		e1.printStackTrace();
//	} catch (NoSuchElementException e) {
//		String gripe = "예상 길이: " + count + "실제: " + i;
//		throw new InputNotSufficientException(gripe);
//	}
	System.out.println("끝.");

	}
}
