
public class CallByValue {
	static Employee2 kim = null;
	
	public static void main(String[] args) {
		int i = "banana".indexOf('a');
		int j = "banana".indexOf('a', 2);
		System.out.println();
	}

	private static void eraseHim(Employee2 inkim) {
		inkim = null;
		
	}
	
}
