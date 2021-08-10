package compareTo.study.shapes;

public class Ractangle implements IShape {
	int length;
	int width;
	String color;
	
	
	public Ractangle(int length, int width, String color) {
		super();
		this.length = length;
		this.width = width;
		this.color = color;
	}

	

	@Override
	public String toString() {
		return "Ractangle [length="
				+ length + ", width=" + width
				+ ", color=" + color + "]";
	}

	@Override
	public boolean fitsText(String message) {
	    return message.length() < this.width/3;
	}
}
