package com.testlist;

public class ShapeTest {
		public static void main(String[] args) {
			Shape[] shapes = new Shape[3];

			shapes[0] =	new Square("복싱장", 10);		
			shapes[1] = new Rectangle("축구장", 100, 60);
			for (Shape s : shapes) {
				System.out.println(s);
			}
					
			var boxingRing = new Rectangle("복싱장3", 20, 5);
			System.out.println(boxingRing.equals(shapes[0]));
			System.out.println(boxingRing.hashCode() == shapes[0].hashCode());
		}
}	
