package com.ds.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList linkedList = new LinkedList();
		LinkedListNode linkedListNode = new LinkedListNode(101);
		linkedList.add(linkedListNode);
		
		linkedListNode = new LinkedListNode(102);
		linkedList.add(linkedListNode);
		
		linkedListNode = new LinkedListNode(103);
		linkedList.add(linkedListNode);
		

		linkedListNode = new LinkedListNode(104);
		linkedList.add(linkedListNode);
		
		linkedListNode = new LinkedListNode(105);
		linkedList.add(linkedListNode);
		
		
		linkedList.printLinkedList();
		
		linkedList.deleteNode(201);
		linkedList.deleteNode(102);
		
		linkedListNode = new LinkedListNode(101);
		linkedList.add(linkedListNode);
		
		linkedList.printLinkedList();		
		
		linkedList.search(102);
		linkedList.search(105);
		linkedList.search(106);
		
		linkedListNode = new LinkedListNode(106);
		linkedList.add(linkedListNode);
		
		linkedList.search(106);
		
		linkedList.printLinkedList();
		linkedList.reverseList();
		
		linkedList.printLinkedList();
	}

}
