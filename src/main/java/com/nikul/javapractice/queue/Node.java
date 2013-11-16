package com.nikul.javapractice.queue;

public class Node {

	private int data;
	private Node rear;
	private Node front;
	
	public Node(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getRear() {
		return rear;
	}
	public void setRear(Node rear) {
		this.rear = rear;
	}
	public Node getfront() {
		return front;
	}
	public void setFront(Node front) {
		this.front = front;
	}
	
	
}
