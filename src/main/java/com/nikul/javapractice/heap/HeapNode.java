package com.nikul.javapractice.heap;

public class HeapNode {

	private int data;
	private HeapNode parant;
	private HeapNode leftChild;
	private HeapNode rightChild;
	
	public HeapNode(int data){
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public HeapNode getParant() {
		return parant;
	}
	public void setParant(HeapNode parant) {
		this.parant = parant;
	}
	public HeapNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(HeapNode leftChild) {
		this.leftChild = leftChild;
	}
	public HeapNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(HeapNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
