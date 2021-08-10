package com.ospa.excep;

import java.io.IOException;
import java.util.Scanner;

class EVException extends IOException {
	EVException(String desc) {
		super(desc, null);
	}
}

public class Transform {

	public static void main(String[] args) {
		getEyeVision();
	}

	private static void getEyeVision() {
		System.out.println("시력: ");
		Scanner in = new Scanner(System.in);
		String eyeVisionStr = in.next();
		Double eyeVisionDbl = null;
		try {
			eyeVisionDbl = convertEyeVision(eyeVisionStr);
			System.out.println("시력: " + eyeVisionDbl);
		} catch (EVException ev) {
			ev.printStackTrace();
		}
	}

	private static Double convertEyeVision(String eyeVisionStr) 
			throws EVException {
		Double eyeVisionDbl = null;
		try {
			eyeVisionDbl = Double.parseDouble(eyeVisionStr);
			return eyeVisionDbl;
		} catch (NullPointerException e) {
			throw (new EVException("시력 정보가 없습니다."));
		} 
		catch (NumberFormatException e) {
			String msg = "시력 입력(\"" + eyeVisionStr + "\")은 숫자가 아닙니다.";
			throw (new EVException(msg));
		}
	}

}
