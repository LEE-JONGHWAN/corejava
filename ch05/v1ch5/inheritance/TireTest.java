package v1ch5.inheritance;

class SnowTire extends Tire{
	@Override
	void run() {
		System.out.println("눈 타이어");		
	}
}

class Tire {
	void run() {
		System.out.println("일반 타이어");
	}
}
public class TireTest {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // Pol
		snowTire.run(); // 눈
		tire.run(); // 눈,  D.Binding
	}

}
