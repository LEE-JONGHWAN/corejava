package com.ospa.asserts;

import com.ospa.asserts.innerpkg.WrongAssertion;

public class DAtest {
	static void initAssertionError() {
		int i = 5;
		assert i >= 10 : "i 가 10보다 작다";
	}
	public static void main(String[] args) {
		try {
		initAssertionError();
		} catch (AssertionError ae) {
			ae.printStackTrace();
		}
		try {
			WrongAssertion wa = new WrongAssertion();
			wa.initAssertionError();
		} catch (AssertionError ae) {
			ae.printStackTrace();
		}
	}
}
