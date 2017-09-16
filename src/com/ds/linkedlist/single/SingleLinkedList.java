package com.linkedlist.single;

public class SingleLinkedList {

	private Node root,newNode;

	public Node add(int newValue) {
		if(newNode == null) {
			newNode = new Node(newValue);
			root = newNode;
		}else {
			Node nextNode = new Node(newValue);
			newNode.setNext(nextNode);
			newNode = nextNode;
		}
		return newNode;
	}

	public Node search(int value) {
		if(root == null) {
			System.out.println("Linked List is Empty");
			return null;
		}
		Node temp = root;
		while(temp != null) {
			if(temp.getValue() != value) {
				temp = temp.getNext();
			}else {
				System.out.println(value + " Found.");
				return temp;
			}
		}
		System.out.println(value + " Not Found.");
		return null;
	}

	public void printList() {
		if(root == null) {
			System.out.println("Linked List is Empty");
		}
		Node temp = root;
		while(temp != null) {
			System.out.println(temp.getValue() + " ");
			temp = temp.getNext();
		}
	}

	public boolean removeNode(int value) {
		if(root == null) {
			System.out.println("Linked List is Empty");
			return false;
		}

		Node temp = root, prev = root;
		while(temp != null) {
			if(temp.getValue() == value) {
				//Remove
				if(temp == root) {
					root = root.getNext();
				}else {
					prev.setNext(temp.getNext());
				}
				temp = null;
				return true;
			}else {
				prev = temp;
				temp = temp.getNext();
			}
		}
		
		System.out.println("Node Not Found.");
		return false;
	}
}
