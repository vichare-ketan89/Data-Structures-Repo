package com.ds.linkedlist.single;

public class Node {
	private Node next;
	private int value;
	
	public Node(int value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node node) {
		this.next = node;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
