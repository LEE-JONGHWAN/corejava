package compareTo.study.vehicle;

public class Car implements IVehicle {

	int mileage;
	int year;
	int numDoors;
	int numPassengers;
	
	
	public Car(int mileage, int year, int numDoors, int numPassengers) {
		super();
		this.mileage = mileage;
		this.year = year;
		this.numDoors = numDoors;
		this.numPassengers = numPassengers;
	}

	boolean builtBefore(int otherYear) {
		return this.year < otherYear;
	}
	
	@Override
	public double tuneUpCost() {
		return 100_0000;
	}

	@Override
	public boolean canCarry(int numPassengers) {
		return this.numPassengers >= numPassengers;
	}

}
