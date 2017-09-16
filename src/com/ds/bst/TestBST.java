package com.ds.bst;

public class TestBST {

	public static void main(String[] args){
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.insert(23);
		binarySearchTree.insert(43);
		binarySearchTree.insert(25);
		binarySearchTree.insert(12);
		binarySearchTree.insert(90);
		binarySearchTree.insert(78);
		binarySearchTree.insert(83);
		binarySearchTree.insert(8);
		
		System.out.print("InOrder :: ");
		binarySearchTree.traverseInOrder(binarySearchTree.getRoot());
		
		System.out.print("\nPre Order :: ");
		binarySearchTree.traversePreOrder(binarySearchTree.getRoot());
		
		System.out.print("\nPost Order :: ");
		binarySearchTree.traversePostOrder(binarySearchTree.getRoot());
	}
}
