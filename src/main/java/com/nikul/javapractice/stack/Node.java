package com.nikul.javapractice.stack;

public class Node {

	private int data;
	private Node top;
	private Node bottom;
	
	public Node(int data){
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getTop() {
		return top;
	}
	public void setTop(Node top) {
		this.top = top;
	}
	public Node getBottom() {
		return bottom;
	}
	public void setBottom(Node bottom) {
		this.bottom = bottom;
	}
	
	
}
