package com.nt.collection;

public class LinkedListMiddle_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printMiddle(head);
	}

	 public static void printMiddle(Node head) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node slow = head;
	        Node fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;          // move by 1
	            fast = fast.next.next;     // move by 2
	        }

	        System.out.println("Middle element: " + slow.data);
	    }
}

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}