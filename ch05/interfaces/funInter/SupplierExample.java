package interfaces.funInter;

import java.util.function.IntSupplier;

class DiceSupplier implements IntSupplier{
	@Override
	public int getAsInt() {
		return (int) (Math.random() * 6) + 1;
	}
}

public class SupplierExample {

	public static void main(String[] args) {
//		IntSupplier intSupplier = () -> {
//		return (int)(Math.random() * 6) + 1;
//		};
		IntSupplier intSupplier = new DiceSupplier();
		int num = intSupplier.getAsInt();
		System.out.println(num);
	}
}
