package com.testlist;

import java.util.Objects;

import abstractClasses.Employee;

public abstract class Shape {
	private String label;

	public String getLabel() {
		return label;
	}

	abstract public int getArea();

	public Shape(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return "이름: " + label;
	}

	@Override
	public int hashCode() {
		return Objects.hash(label, getArea());
	}
	
	@Override
	public boolean equals(Object otherObject) {
		// 같은 참조인지 시험
		if (this == otherObject)return true;
		// 인자가 null 이면 같을 확율 0
		if (otherObject == null)return false;
		// 인자가 null 아니고, Employee 객체일때 처리
		Shape other = (Shape) otherObject;
		// 각 필드 값이 같은지 검사
		return label.equals(other.label) ;
	}
}
