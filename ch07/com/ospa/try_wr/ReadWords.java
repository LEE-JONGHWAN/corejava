package com.ospa.try_wr;

import java.awt.FontFormatException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

	public class ReadWords {

		public static void main(String[] args) {
			readWordsAndWriteThem1();
		}

		private static void readWordsAndWriteThem1() {
			try (var in = new Scanner(new FileInputStream(
								"resources\\words.txt"),
									StandardCharsets.UTF_8);
					var out = new PrintWriter(
								"resources\\hopes.txt",
									StandardCharsets.UTF_8)) {
				while (in.hasNext()) {
					out.println(in.next().toUpperCase());
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			}
		}


