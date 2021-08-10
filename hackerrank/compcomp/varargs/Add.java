package compcomp.varargs;

public class Add {

	public void add(int... intVals) {
		int sum = 0;
		if (intVals.length > 0) {
			sum += intVals[0];
			System.out.print(intVals[0]);
		}
		for(int i =1; i < intVals.length; i++ ) {
			sum += intVals[i];
					System.out.print("+" + intVals[i]);
		}
		System.out.println("=" + sum);
	}

}
