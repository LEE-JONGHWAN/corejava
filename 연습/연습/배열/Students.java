package 연습.배열;

/**
 * 
 * 이곳은 학생의 정보를 지정하는 곳으로
 * 학생이므로 이름 성적 담당 선생님을 볼 수 있도록 한다.
 * 
 * @author 이종환(Lee JongHwan)
 * @version 1.0.0
 *
 */

enum Stname {
	김말수,이기동,박동자
}


public class Students {
	private String stname;
	private String stteach;
	private double stnum;
	

	
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public String getStteach() {
		return stteach;
	}
	public void setStteach(String stteach) {
		this.stteach = stteach;
	}
	
	public double getStnum() {
		return stnum;
	}
	public void setStnum(double stnum) {
		this.stnum = stnum;
	}
	
	public Students(String stname, String stteach, double stnum) {
		super();
		this.stname = stname;
		this.stteach = stteach;
		this.stnum = stnum;
	}
	public String toString() {
		return "이름: " + stname + " 성적: " + stnum + " 담당 선생님: ";
	}
}
