package hackerrank.arraylist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.Logger;

import com.jhlee.logger.JLogger;

public class InsertTail {
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

	        public SinglyLinkedList() {
	            this.head = null;
	        }
	    }

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
	    	SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
	    	if (head == null) {
	    		head = newNode;
	    	} else {
	    		/**
	    		 * find tail node
	    		 */
	    		SinglyLinkedListNode tail = head;
	    		while(tail.next != null) {
	    			tail = tail.next; // traverse the list 
	    		}
	    		tail.next = newNode;
	    	}
	    	return head;
	    }

	    private static Scanner scanner;
	    
	    private static Logger logger = JLogger.getLogger();
	    public static void main(String[] args) throws IOException {
	    	scanner = new Scanner(Path.of("resources\\input.txt"));
	        BufferedWriter bufferedWriter = 
	        		new BufferedWriter(new FileWriter("resources\\output.txt"));
	        SinglyLinkedList llist = new SinglyLinkedList();

	        int llistCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        for (int i = 0; i < llistCount; i++) {
	            int llistItem = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        	
	          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
	          llist.head = llist_head;
	        }

	        printSinglyLinkedList(llist.head, "\n", bufferedWriter);
	        bufferedWriter.newLine();
	        logger.info("Done");
	        bufferedWriter.close();
	        
	        scanner.close();
	    }
}
