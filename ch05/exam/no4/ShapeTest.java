package exam.no4;

public class ShapeTest {

	public static void main(String[] args) {
		Square sq1 = new Square("복싱장", 10);
		Square sq2 = new Square("복싱장", 10);
		Rectangle rect1 = new Rectangle("축구장", 100, 60);
		Rectangle rect2 = new Rectangle("복싱장", 25, 4);
		System.out.println(sq1);
		System.out.println(rect1);
		System.out.println(sq1.equals(rect2));
		System.out.println(sq1.equals(sq2));
		System.out.println(sq1.hashCode() == rect2.hashCode());
	}

}
