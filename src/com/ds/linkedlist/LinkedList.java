package com.ds.linkedlist;

public class LinkedList {

	LinkedListNode root;

	public void add(LinkedListNode newNode) {

		if(root == null) {
			root = newNode;
			return;
		}

		LinkedListNode temp = root;
		while(temp.next != null) {//Iterate till last node in the list
			temp = temp.next;
		}
		temp.next = newNode;

		System.out.println(newNode.value + " added.");
	}

	public void deleteNode(int val) {
		if(root == null) {
			return;
		}

		if(root.value == val) {//First Node
			root = root.next;
			return;
		}

		LinkedListNode temp = root, prev = root;
		while(temp.next != null) {
			temp = temp.next;
			if(temp.value == val) {
				prev.next = temp.next;
				temp = null;
				prev = null;
				System.out.println(val + " deleted.");
				return;
			}
			prev = temp;
		}
		System.out.println("Node with value "+ val+" Not found");
	}
	
	public void reverseList() {
		if(root == null) {
			return;
		}
		
		LinkedListNode current = root, next, prev = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		root = prev;
	}

	public boolean search(int val) {
		
		if(root == null) {
			return false;
		}
		LinkedListNode temp = root;
		while(temp != null) {
			if(temp.value == val) {
				System.out.println(val + " Found.");
				return true;
			}
			temp = temp.next;
		}
		System.out.println(val + " not found.");
		return false;
	}

	public void printLinkedList() {
		if(root == null) {
			System.out.println("List is empty");
		}else {
			LinkedListNode temp = root;
			while(temp != null) {
				System.out.print(temp.value + " ");
				temp = temp.next;
			}

			System.out.println("");
		}
	}
}
