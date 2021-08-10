package Test6m24days;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

class Comp강사 implements Comparator<JavaBE강사>{

	@Override
	public int compare(JavaBE강사 o1, JavaBE강사 o2) {
		return Float.compare(o2.getPoint(), o1.getPoint());
	}
}

public class LecturerManager {

		public static void main(String[] args) {
			JavaBE강사[] 강사들 = new JavaBE강사[3];
			강사들[0] = new JavaBE강사("김강사", "Java", 4.2f);
			강사들[1] = new JavaBE강사("편강사", "MariaDB", 3.4f);
			강사들[2] = new JavaBE강사("이강사", "Spring", 4.8f);
			
			Arrays.sort(강사들, new Comp강사());
	        Stream<JavaBE강사> 강사흐름 = Arrays.stream(강사들);
	        강사흐름.forEach(System.out::println);
		}

}
