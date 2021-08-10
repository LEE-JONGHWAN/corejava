package com.ospa.asserts.innerpkg;
//com.ospa.asserts.innerpkg.WrongAssertion

public class WrongAssertion {
	public void initAssertionError() {
		int i = 5;
		assert i >= 10 : "i 가 10보다 작다";
	}
}
