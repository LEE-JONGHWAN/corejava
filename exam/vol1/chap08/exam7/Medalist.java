package vol1.chap08.exam7;

public class Medalist<T> {
	T goldMedal;
	T silverMedal;
	T bronzeMedal;
	
	public T getGoldMedal() {
		return goldMedal;
	}
	public void setGoldMedal(T goldMedal) {
		this.goldMedal = goldMedal;
	}
	public T getSilverMedal() {
		return silverMedal;
	}
	public void setSilverMedal(T silverMedal) {
		this.silverMedal = silverMedal;
	}
	public T getBronzeMedal() {
		return bronzeMedal;
	}
	public void setBronzeMedal(T bronzeMedal) {
		this.bronzeMedal = bronzeMedal;
	}
	@Override
	public String toString() {
		return "메달수상자\n\t금: " + goldMedal 
				+ "\n\t은: " + silverMedal 
				+ "\n\t동: " + bronzeMedal;
	}
	
}
