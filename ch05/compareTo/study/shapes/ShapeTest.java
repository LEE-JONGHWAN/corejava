package compareTo.study.shapes;

import java.awt.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		IShape circle = new Circle(10, "붉은색");
		IShape rectan = new Ractangle(20, 10, "붉은색");
		String buildingSign = "중앙도서관";
		Sign librarySign = null;
		
		if (circle.fitsText(buildingSign)) {
			librarySign = new Sign(circle, buildingSign);
		} else {
			librarySign = new Sign(rectan, buildingSign);
		}
		System.out.println(librarySign);
	}

}
