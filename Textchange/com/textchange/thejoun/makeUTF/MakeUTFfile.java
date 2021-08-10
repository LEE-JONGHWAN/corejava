package com.textchange.thejoun.makeUTF;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class MakeUTFfile {

	public static void main(String[] args) {
		
		String filePath = "VectorExample";
		try(BufferedReader br = new BufferedReader(
			new FileReader(filePath))) {
			
			String strCurrentLine;
			
			while((strCurrentLine = br.readLine()) != null) {
				System.out.println(strCurrentLine);
			}
			
		String decodedFromEucKr = null;
		byte[] utf8StringBuffer = decodedFromEucKr.getBytes("utf-8");

		System.out.println();
		System.out.println("utf-8 - length : " + utf8StringBuffer.length);
		String decodedFromUtf8 = new String(utf8StringBuffer, "utf-8");
		System.out.println("String from utf-8 : " + decodedFromUtf8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
