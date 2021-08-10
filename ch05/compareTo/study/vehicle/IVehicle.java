package compareTo.study.vehicle;

public interface IVehicle {
	// 경정비 비용
	public double tuneUpCost();

	// 최대 탑승객 수 
	public boolean canCarry(int numPassengers);

}
