package com.example.bst;

public class BinarySearchTree {

	private BSTNode rootNode;

	private BSTNode insert (BSTNode currentNode, int value){

		if(currentNode == null){
			currentNode = new BSTNode(value);
			return currentNode;
		}

		if(value > currentNode.getValue()){
			currentNode.setRightNode(insert(currentNode.getRightNode(), value));
		}

		if(value <= currentNode.getValue()){
			currentNode.setLeftNode(insert(currentNode.getLeftNode(), value));
		}

		return currentNode;
	}

	public BSTNode getRoot(){
		return rootNode;
	}

	public void setRoot(BSTNode root){
		rootNode = root;
	}

	public void traverseInOrder(BSTNode rootNode){

		if(rootNode != null){
			traverseInOrder(rootNode.getLeftNode());
			System.out.print(rootNode.getValue()+ " ");
			traverseInOrder(rootNode.getRightNode());
		}
	}
	
	public void traversePreOrder(BSTNode rootNode){

		if(rootNode != null){
			System.out.print(rootNode.getValue()+ " ");
			traversePreOrder(rootNode.getLeftNode());
			traversePreOrder(rootNode.getRightNode());
		}
	}
	
	public void traversePostOrder(BSTNode rootNode){

		if(rootNode != null){
			traversePostOrder(rootNode.getLeftNode());
			traversePostOrder(rootNode.getRightNode());
			System.out.print(rootNode.getValue() + " ");
		}
	}

	public void insert(int value){
		rootNode = insert(rootNode, value);
	}
}
