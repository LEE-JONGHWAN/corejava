package chap_08.generic;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class GenericMethod {
	private static Logger glog = Logger.getGlobal();
	{
		try {
			FileHandler fHandler = new FileHandler();
			glog.addHandler(fHandler);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}
	public <T> T getMiddle(T... a) {
		return a[a.length / 2];
	}
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod(); 
		GenericMethod gm2 = new GenericMethod(); 
		glog.info("mid: " + gm.<Integer>getMiddle(1, 3, -2, 7, 8));
		glog.info("중간: " + gm.<String>getMiddle("산", "강", "물"));
	}
}

