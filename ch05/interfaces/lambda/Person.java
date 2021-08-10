package interfaces.lambda;

import java.time.LocalDate;

public class Person{
   LocalDate birthDay;
   private String name;
   private String hobby;
   
   
   public LocalDate getBirthDay() {
	return birthDay;
}

public String getHobby() {
	return hobby;
}

@Override
   public String toString() {
	return "Person [생일=" + birthDay + ", 이름=" + name + "]";
   }

public Person(String name) {
	   this.name = name;
	   this.birthDay = LocalDate.of(1945, 4, 28);
   }
   
   public Person(String name, LocalDate birthDay) {
      this.name = name;
      this.birthDay = birthDay;
   }

   public Person(String name, LocalDate birthDay, String hobby) {
	   this.name = name;
	   this.birthDay = birthDay;
	   this.hobby = hobby;
   }

   public String getName() {
      return name;
   }

public void setbDay(LocalDate of) {
	birthDay = of;
}

}
