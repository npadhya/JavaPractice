package com.nikul.javapractice.binarytree;

public class Node {

	private int data;
	private Node parant;
	private Node leftChild;
	private Node rightChild;
	
	public Node(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	public Node getParant() {
		return parant;
	}

	public void setParant(Node parant) {
		this.parant = parant;
	}
}
