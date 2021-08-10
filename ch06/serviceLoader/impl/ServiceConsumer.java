package serviceLoader.impl;

import java.util.*;

import serviceLoader.Cipher;

public class ServiceConsumer {
	// @formatter:off
	public static ServiceLoader<Cipher> cipherLoader
		= ServiceLoader.load(Cipher.class);

	public static Cipher getCipher(int minStrength) {
		for (Cipher cipher : cipherLoader) {
			if (cipher.strength() >= minStrength)
				return cipher;
		}
		return null;
	}

	public static Optional<Cipher> getCipher2(int minStrength) {
		return null;
				/*cipherLoader.stream()
				.filter(descr -> descr.type() 
						== serviceLoader.impl.CaesarCipher.class)
				.findFirst()
				.map(ServiceLoader.Provider::get);*/
	}
	// @formatter:on

	public static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cipher cip = getCipher(1);
		byte[] CDRIVES = hexStringToByteArray(
				"e04fd020ea3a6910a2d808002b30309d");
		byte[] cipResult = cip.encrypt(CDRIVES,
				"수요일은 늑대의 자식의 날".getBytes());;
		byte[] decResult = cip.decrypt(cipResult,
				"수요일은 늑대의 자식의 날".getBytes());;
		
		Optional<Cipher> cip2 = getCipher2(1);
		if (cip2.isPresent()) {
			cip2.get().decrypt(cipResult, cipResult);
		}
		Optional<Cipher> cip3 = cipherLoader.findFirst();
		System.out.println();
	}
}
