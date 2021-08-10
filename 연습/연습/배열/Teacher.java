package 연습.배열;

/**
 * 
 * 이곳은 선생님의 정보를 지정하는 곳으로
 * 학생의 성적 및 주소를 입력할 수 있도록 한다.
 * 
 * @author 이종환(Lee JongHwan)
 * @version 1.0.0
 *
 */

enum Tcname{
	김선생,박선생,오선생
}

public class Teacher{
	private String tcname;
	private String tcteach;
	private String staddress;
	private double stnum;
	
	public String getTcname() {
		return tcname;
	}
	public void setTcname(String tcname) {
		this.tcname = tcname;
	}
	
	public String getTcteach() {
		return tcteach;
	}
	public void setTcteach(String tcteach) {
		this.tcteach = tcteach;
	}
	
	public String getStaddress() {
		return staddress;
	}
	public void setStaddress(String staddress) {
		this.staddress = staddress;
	}
	
	public double getStnum() {
		return stnum;
	}
	public void setStnum(double stnum) {
		this.stnum = stnum;
	}
	
	public Teacher(String tcname, String tcteach, String staddress, double stnum) {
		super();
		this.tcname = tcname;
		this.tcteach = tcteach;
		this.staddress = staddress;
		this.stnum = stnum;
	}
	
	public String toString() {
		return "선생님이름: " + tcname + " 성적: " + stnum + " 담당 과목: ";
	}
	

}
