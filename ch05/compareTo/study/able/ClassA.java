package compareTo.study.able;

import java.util.Comparator;

// Arrays.sort() =>single parametor
// Arrays.sort() =>double parametor

public class ClassA implements Comparable<ClassA>,
	Comparator<ClassA>
{

	int count;
	String memo;
	
	public ClassA(int count, String memo) {
		this.count = count;
		this.memo = memo;
	}
	
	@Override
	public int compareTo(ClassA o) {
		int res = 
			this.count + this.memo.length()
			- (o.count + o.memo.length());
		return res;
	}

	@Override
	public int compare(ClassA o1, ClassA o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}