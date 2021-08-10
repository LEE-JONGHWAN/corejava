package com.ospa.excep;

import java.io.IOError;
import java.io.IOException;

public class MainExcep {

	public static void main(String[] args) {
		try {
		throw new IOException("예외발생!!");
	} catch (IOException e){
		System.out.println();
		e.printStackTrace();
		}
	}
}
