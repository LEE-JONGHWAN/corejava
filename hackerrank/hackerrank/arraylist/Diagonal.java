package hackerrank.arraylist;

import static java.util.stream.Collectors.toList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import hackerrank.arraylist.InsertTail.SinglyLinkedListNode;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int lSum = 0;
    	int rSum = 0;
        for(int row = 0; row < arr.size(); row ++) {
        	List<Integer> aRow = arr.get(row);
        	for(int col = 0; col < aRow.size(); col++) {
        		if (row == 1 && col == 1)
        			System.out.println();
        		if(row == col) 
        			lSum += aRow.get(col);
        		if(row + col == arr.size() -1)
        			rSum += aRow.get(col);
        		
        	}
        }
        return Math.abs(lSum - rSum);
    }
}

public class Diagonal {
    public static void main(String[] args) throws IOException {
    	File initialFile = new File("resources\\input.txt");
    	InputStream targetStream = new FileInputStream(initialFile);
        BufferedReader bufferedReader = 
        		new BufferedReader(new InputStreamReader(targetStream));
        BufferedWriter bufferedWriter = 
        		new BufferedWriter(new FileWriter("resources\\output.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        
        bufferedWriter.newLine();
 
	    
        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Solutions {

    public static void printSinglyLinkedList(SinglyLinkedListNode node, 
    		String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    	return null;
    }
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
    	var ptr = head;
    	while (ptr != null) {
    		System.out.println(ptr.data);
    		ptr = ptr.next;
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	   Scanner scanner = new Scanner(Path.of("source\\pp.txt"));
    	    SinglyLinkedList llist = new SinglyLinkedList();

    	    int llistCount = scanner.nextInt();
    	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    	    for (int i = 0; i < llistCount; i++) {
    	        int llistItem = scanner.nextInt();
    	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    	        llist.insertNode(llistItem);
    	    }

    	    printLinkedList(llist.head);

    	    scanner.close();
    	}
}