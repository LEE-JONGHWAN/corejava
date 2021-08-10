package innerclass;

public class ArrayAlg {
	
	public static class Pair {
		private double min;
		private double max;

		public Pair(double min, double max) {
			this.min = min;
			this.max = max;
		}

		public double getMin() {
//			Object ob = ArrayAlg.this;
			return min;
		}

		public double getMax() {
			return max;
		}

	}
	
	public static void main(String[] args) {
		var dArray = new Double[] { 1.2, -4.5, 99d, -40d };
		ArrayAlg.Pair result = ArrayAlg.findPair(dArray);
		System.out.println("극값: [" + result.getMin() + 
				", " + result.getMax() + "]");

	}
	public static ArrayAlg.Pair findPair(Double[] dArray) {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;

		for (double d : dArray) {
			if (d < min)
				min = d;
			if (d > max)
				max = d;
		}
		ArrayAlg x = new ArrayAlg();
		return new Pair(min, max);
	}


}
