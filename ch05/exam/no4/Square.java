package exam.no4;

import com.testlist.Shape;

public class Square extends Shape {
	private int side;
	public Square(String label, int side) {
		super(label);
		this.side = side;
	}
	@Override
	public int getArea() {
		return side * side;
	}
	
	@Override
	public String toString() {
		//한변: 10 미터인 정사각형
		return super.toString() + "한변: "
				+ side + "미터인 정사각형";
	}
	
	public static void main(String[] args) {
		Square sq = new Square("복싱장", 10);
		System.out.println(sq);
	}

}
