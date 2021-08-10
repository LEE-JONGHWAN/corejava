package com.ospa.excep;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class NoSquelch {

	public static void main(String[] args) throws IOException {
		String iFile = "resourceㄴ\\linden_berries.JPG";
		squelch(iFile);
//		throwUp(iFile);
		handleMyself(iFile);
		
		
		
	}

	private static void handleMyself(String iFile) {
		try {
		BufferedImage berries = 
			ImageIO.read(new File(iFile));
		System.out.println(berries.getWidth());
	} catch (Exception e) {
		System.out.println(iFile + "없어!!!!");
		e.printStackTrace();
	}
}
	private static void throwUp(String imgFileName)
		throws IOException{	
		BufferedImage berries = null;
			berries = ImageIO.read(new File(imgFileName));
			System.out.println(berries.getWidth());
	}

	private static void squelch(String imgFileName) {
		try {
			BufferedImage berries = 
					ImageIO.read(new File(imgFileName));
			System.out.println(berries.getWidth());
		} catch (Exception e) {
			// 꿀먹은 벙어리
		}
	}

}
