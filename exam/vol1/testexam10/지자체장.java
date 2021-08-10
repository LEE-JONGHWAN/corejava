package vol1.testexam10;

import java.util.HashMap;

class 지자체 {
	public String name;
	public 지자체(String name) {
		super();
		this.name = name;
	}
}

public class 지자체장 {
	private double 신고재산;
	private String 단체장명;
	
	public 지자체장(double 신고재산, String 단체장명) {
		super();
		this.신고재산 = 신고재산; // 만원
		this.단체장명 = 단체장명;
	}

	public static void main(String[] args) {
		var 총지자체 = new HashMap<지자체장,지자체>(); // 생략된 내용
		지자체장 동구지자체장 = new 지자체장(1_000_000,"홍길동");
		지자체장 서구지자체장 = new 지자체장(8_000_000,"김말숙");
		지자체장 남구지자체장 = new 지자체장(3_000_000,"김철수");
		지자체장 북구지자체장 = new 지자체장(7_000_000,"남대만");
		지자체 동구지자체 = new 지자체("동구지자체");
		지자체 서구지자체 = new 지자체("서구지자체");
		지자체 남구지자체 = new 지자체("남구지자체");
		지자체 북구지자체 = new 지자체("북구지자체");
		총지자체.put(동구지자체장, 동구지자체);
		총지자체.put(서구지자체장, 서구지자체);
		총지자체.put(남구지자체장, 남구지자체);
		총지자체.put(북구지자체장, 북구지자체);
		System.out.println(총지자체.get(서구지자체장).name);
		
		// 생략된 내용
	}
}
