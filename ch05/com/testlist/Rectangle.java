package com.testlist;

import java.util.Objects;

public class Rectangle extends Shape {
	private String label;
	private int width;
	private int length;
	
	public Rectangle(String label, int width, int length) {
	      super(label);
	      this.width = width;
	      this.length = length;
	}

	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		
		if (obj instanceof Rectangle) {
			Rectangle rect = (Rectangle) obj;
			return getArea() == rect.getArea();
		} else {
		if (obj instanceof Square) {
			Square sqre = (Square) obj;
			return getArea() == sqre.getArea();
		} else {
			return false;
		}
	}
}
	public int getLength() {
		return length;
	}
	

	public int getWidth() {
		return width;
	}
	

	public int getArea() {
		return getWidth() * getLength();
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 크기: " + getWidth()
		+ "x" + getLength() + " 미터인 직사각형";
	}
	
	public static void main(String[] args) {
		var boxingRing = new Rectangle("축구장", 100, 60);
		System.out.println(boxingRing);
	}
	
}
