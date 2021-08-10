package com.jhlee.logger;

	import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

	public class Utility {
		static Random generator = new Random() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 7957823060441155629L;
			public double nextDouble() {
				double result = super.nextDouble();
				try {
					Logger.getGlobal().addHandler(new FileHandler());
				} catch(SecurityException e) {
					e.printStackTrace();
				} catch(IOException e) {
					e.printStackTrace();
				}
				Logger.getGlobal().info("다음 실수: " + result);
				Logger.getGlobal().info("스택 자취: " + 
						Thread.currentThread().getStackTrace());
				new Exception().printStackTrace();	// 아래 참고 			
				return result;
			}
		};
		public static void main(String[] args) throws SecurityException, IOException {
			var out = new StringWriter();
			new Throwable().printStackTrace(new PrintWriter(out));
			String stackTrace = out.toString();
			Logger.getGlobal().addHandler(new FileHandler());
			Logger.getGlobal().info("스택 자취2: " + stackTrace);
			System.out.println(generator.nextDouble());
			Utility util = new Utility();
			util.method_a();

		}
		private void method_a() throws SecurityException, IOException{
			method_03();
		}
		private void method_03() throws SecurityException, IOException{
//			double rate = generator.nextDouble();
			var out = new StringWriter();
			new Throwable().printStackTrace(new PrintWriter(out));
			String stackTrace = out.toString();
			Logger.getGlobal().addHandler(new FileHandler());
			Logger.getGlobal().info("스택 자취2: " + stackTrace);
		}
	}

