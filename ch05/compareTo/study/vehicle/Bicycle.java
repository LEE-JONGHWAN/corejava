package compareTo.study.vehicle;

public class Bicycle implements IVehicle {
	int mileage;
	int numGears;
	
	public static void main(String...args) {
		Bicycle newKidsBike = new Bicycle(0, 1);
		IVehicle newKidsBike2 = new Bicycle(0, 1);
		newKidsBike2.canCarry(0);
		newKidsBike2.tuneUpCost();
		IVehicle oldCar = new Car(200000, 1995, 2, 5);
		oldCar.canCarry(1);
		Car oldCar2 = new Car(200000, 1995, 2, 7);
		oldCar2.canCarry(0);


		
	}
	
	public Bicycle(int mileage, int numGears) {
		super();
		this.mileage = mileage;
		this.numGears = numGears;
	}

	@Override
	public double tuneUpCost() {
		return 2_0000;
	}

	@Override
	public boolean canCarry(int numPassengers) {
		return numPassengers <= 2;
	}
}
