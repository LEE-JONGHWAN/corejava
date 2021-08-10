package compareTo.study.shapes;

public class Sign {
	  private IShape shape;
	  private String text;
	  
	public Sign(IShape shape, String text) {
		super();
		this.shape = shape;
		this.text = text;
	}

	public IShape getShape() {
		return shape;
	}
	@Override
	public String toString() {
		return shape + "[" + text + "]";
	}
}
