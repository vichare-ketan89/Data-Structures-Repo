package com.example.bst;

public class BSTNode {
	private int value;
	private BSTNode leftNode;
	private BSTNode rightNode;
	
	public BSTNode(int value) {
		super();
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BSTNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(BSTNode leftNode) {
		this.leftNode = leftNode;
	}
	public BSTNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(BSTNode rightNode) {
		this.rightNode = rightNode;
	}
	
	@Override
	public String toString() {
		return "Value :: "+ value;
	}
}
