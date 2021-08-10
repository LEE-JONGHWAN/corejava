package Teste76;

import java.io.IOException;
import java.util.logging.Logger;

import com.jhlee.logger.JLogger;

public class NumberRangeException extends IOException {
	/**
	 * 
	 */
	private static final long serialVersionUID 
	= -2065328552526728512L;
	
	public NumberRangeException(String string) {
		super(string);
	}
	
	private static Logger logger = JLogger.getLogger();
	public static void main(String[] args) {
		var nre = new NumberRangeException("값 범위 초과!");
		logger.severe(nre.toString());
		System.out.println(nre.toString());
	}
}
