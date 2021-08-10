package exam.no4;

import com.testlist.Shape;
	
public class Rectangle extends Shape {
	int width;
	int length;
	
	public Rectangle(String label, int width, int length) {
		super(label);
		this.width = width;
		this.length = length;
	}
	@Override
	public int getArea() {
		return width * length;
	}
	
	@Override
	public String toString() {
		//크기: 100x60 미터인 직사각형
		return super.toString() + ",크기: " + length
				+ "x" + width + "미터인 직사각형";
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle("축구장", 100, 60);
		System.out.println(rect);
	}

}
