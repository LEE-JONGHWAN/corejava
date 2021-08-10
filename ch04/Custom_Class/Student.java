package Custom_Class;

/**
 * 학생에 대한 기준 값을 지정해 둔다.
 */			
class Student {
private int stud_No;
private String stud_Name;
private float stud_gpa;
private boolean stud_휴학중 = false;

public Student(int studNo, String studName, float gpa, boolean 휴학중) {
	stud_No = studNo;
	stud_Name = studName;
	stud_gpa = gpa;
	stud_휴학중 = 휴학중;
}
/**
 *  학생의 성적을 얻는다.
 */
float getStud_gpa() {
	return stud_gpa;		
}
/**
 *  학생의 성적을 세팅한다.
 */
void setStud_gpa(float gpa) {
	stud_gpa = gpa;		
}
/**
 *  이 학생을 휴학하는 상태로 만든다.
 */
void setStud_휴학개시() {
	stud_휴학중 = true;
}
/**
 *  이 학생을 휴학하지 않는 상태로 만든다.
 */
void setStud_휴학종료() {
	stud_휴학중 = false;
}
void raiseSalary() {
	int raiseSalary = 0;
	int setStud_gpa = raiseSalary /100;
}


public String getStud_Name() {
	return stud_Name;
}
public void setStud_Name(String stud_Name) {
	this.stud_Name = stud_Name;
}
public void raiseSalary(int i) {
	// TODO Auto-generated method stub
	
}
public int getHireDay() {
	// TODO Auto-generated method stub
	return 0;
}
	}	

