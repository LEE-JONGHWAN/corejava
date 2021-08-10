package com.ospa.excep;

import java.io.IOException;
import java.io.InputStream;

public class NestedTry {

	
		static InputStream in = null;
		public static void main(String[] args) {
			try {
				callM();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}	
			
		private static void callM() throws IOException {
				try {
				} finally {
					if (in != null)
					in.close();
		}
	}
}	
