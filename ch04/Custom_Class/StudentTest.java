package Custom_Class;


public class StudentTest {

	public static void main(String[] args) {
	 /**
	  *  두 학생을 만들고, 한 학생은 휴학을 개시하게 하고,
	  *  다른 학생은 휴학을 종료시키고,
	  *  두 학생의 학점(gpa)을 0.3증가시킨다.
	  */
			boolean empo = true; 
			boolean free = false;
			
			Student []ef = new Student[2];
			
			 ef[0] = new Student(123232, "이명동", 2.7f, empo);
			 ef[1] = new Student(456232, "박돌쇠", 4.2f, free);


			      // raise everyone's salary by 5%
			      for (Student e : ef)
			         e.raiseSalary(5);

			      // print out information about all Employee objects
			      for (Student e : ef)
			         System.out.println("name=" + e.getStud_Name() + ",salary=" + e.getStud_gpa() + ",hireDay=" 
			            + e.getHireDay());
		   

	}
}
