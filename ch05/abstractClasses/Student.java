package abstractClasses;

import java.util.Objects;

public class Student extends Person
{
	public static void main(String[] args) {
		Student s1 = new Student("최모송", "전산");
		Student s2 = new Student("최모송", "전자");
		System.out.println(s1.equals(s2));
	}
	@Override
	public boolean equals(Object otherObject) {
	      // 같은 참조인지 시험
	      if (this == otherObject) 
	    	  return true;

	      // 인자가 null 이면 같을 확율 0
	      if (otherObject == null) 
	    	  return false;

	      // 두 객체 형이 다르면 같을 확율 0
	      if (getClass() != otherObject.getClass())
	         return false;

	      // 인자가 null 아니고, Employee 객체일때 처리
	      Student other = (Student) otherObject;

	      // 각 필드 값이 같은지 검사
	      return Objects.equals(major, other.major);
	   }
	
   private String major;

   /**
    * @param name the student's name
    * @param major the student's major
    */
   public Student(String name, String major)
   {
      // pass name to superclass constructor
      super(name);
      this.major = major;
   }
   
   @Override
   public String getDescription() {
      return "a student majoring in " + major;
   }
}
