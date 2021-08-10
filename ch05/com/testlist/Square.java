package com.testlist;

import java.util.Objects;

public class Square extends Shape {
	private int side;
	public Square(String label, int side) {
		super(label);
		this.side = side;
	}
	
	@Override
	public int getArea() {
		return side * side;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 한변: " + side
		+ " 미터인 정사각형";
	}
			
			public static void main(String[] args) {
				var boxingRing = new Square("복싱장", 10);
				System.out.println(boxingRing);
			}
			
	}
