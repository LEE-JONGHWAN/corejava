package ch03;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class InOutTest {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter("resources\\outFile.txt", 
				StandardCharsets.UTF_8);
		out.println("홍길동2");
		out.close();
		
		return;
	}

}
