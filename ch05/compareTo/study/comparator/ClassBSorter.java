package compareTo.study.comparator;

import java.util.Comparator;

public class ClassBSorter implements Comparator<ClassB>{

	@Override
	public int compare(ClassB o1, ClassB o2) {
		return (o1.getMei().length() + o1.getSeva()) -
		(o2.getMei().length() + o2.getSeva());
	}

}
