package Test6m24days;

public class JavaBE강사{
	//자바BE강사 클래스는 강사명, 담당과목, 강의평점(1.0~5.0)의 필드를
	private String name;
	private String studying;
	private float point;
	
	public String getName() {
		return name;
	}
	public String getStudying() {
		return studying;
	}
	public float getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return "강사명=" + name + ", 담당과목=" + studying + ", 강의평점=" + point;
	}
	
	public JavaBE강사(String name, String studying, float point) {
		super();
		this.name = name;
		this.studying = studying;
		this.point = point;
	}

	
}
