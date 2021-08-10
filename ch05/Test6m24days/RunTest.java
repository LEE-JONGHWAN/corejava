package Test6m24days;

public class RunTest {
	public static void main(String[] args) {
		RunMenu[] values = RunMenu.values();
		for(RunMenu si: values) { System.out.println("-" + si + "(" + 
				   si.getAbbreviation() + ")"); }
	}
}
