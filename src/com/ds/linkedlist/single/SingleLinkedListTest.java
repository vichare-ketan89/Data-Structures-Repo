package com.linkedlist.single;

public class SingleLinkedListTest {
	
	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		
		linkedList.printList();
		
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(10);
		linkedList.add(50);
		linkedList.add(70);
		
		linkedList.printList();
		
		linkedList.search(70);
		linkedList.search(40);
		linkedList.search(35);
		linkedList.search(83);
		linkedList.search(10);
		
		linkedList.removeNode(50);
		linkedList.printList();
	}
}
