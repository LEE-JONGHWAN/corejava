package compareTo.study.shapes;

public class Circle implements IShape {
	int radius;
	String color;

	public Circle(int radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}


	public boolean fitsText(String message) {
		return message.length() < (this.radius/5);
	}
}
