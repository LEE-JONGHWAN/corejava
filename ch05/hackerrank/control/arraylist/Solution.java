package hackerrank.control.arraylist;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = getScanner();
		var aList = new ArrayList<int[]>();
		createArrayList(scanner, aList);
		processQueries(scanner, aList);
		scanner.close();
	}

	private static void processQueries(Scanner scanner, ArrayList<int[]> aList) {
		int qCnt = scanner.nextInt();

		for (int qry = 0; qry < qCnt; qry++) {
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			int[] data = aList.get(row - 1);
			if (data == null || col > data.length) {
				System.out.println("ERROR!");
			} else {
				System.out.println(data[col - 1]);
			}
		}
	}

	private static void createArrayList(Scanner scanner, 
			ArrayList<int[]> dataList) {
		int size = scanner.nextInt();
		
		for (int row = 0; row < size; row++) {
			int[] line = null;
			int count = scanner.nextInt();
			
			if (count > 0) {
				line = new int[count]; // memory allocation
				for (int i = 0; i < count; i++) {
					line[i] = scanner.nextInt();
				}
			}
			dataList.add(row, line);
		}
	}

	private static Scanner getScanner() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(Path.of("resource\\input.txt"));
			// on Mac': Path.of("data/input.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scanner;
	}
}
