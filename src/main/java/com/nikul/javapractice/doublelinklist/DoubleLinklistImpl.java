package com.nikul.javapractice.doublelinklist;

public class DoubleLinklistImpl {

	private Node head;
	private Node temp;
	private Node current;
	
	/*
	 * Function to add Node in the list
	 */
	public void addNode(int newNodeData){
		if(head == null){
			System.out.println("The Linklist does not exist....");
			System.out.println("Creating new Linklist....");
			head = new Node(newNodeData);
			current = head;
		}
		else{
			temp = new Node(newNodeData);
			current.setNext(temp);
			temp.setPrevious(current);
			current = current.getNext();
		}
	}
	
	/*
	 * Remove a node from the list when given the data
	 */
	public void removeNode(int removeNode){
		if(head == null){
			System.out.println("The Linklist is EMPTY !!");
		}else{
			current = head;
			while(current!= null){
				if(current.getData() == removeNode){
					current.getPrevious().setNext(current.getNext());
					current.getNext().setPrevious(current.getPrevious());
				}
				current = current.getNext();
			}
		}
			
	}
	
	/*
	 * Go through the list and display the data
	 */
	public void showList(){
		current = head;
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	/*
	 * Convert an integer Array to linklist and return the Head node.
	 */
	public Node convertToLinkList(int[] inputArray){
		head = null;
		for(int i =0 ; i< inputArray.length;i++){
			addNode(inputArray[i]);
		}
		return head;
	}
	
	/*
	 * Find nth element of a linklist
	 */
	public int getNthElement(int element){
		temp = current = head;
		for(int i = 0 ; i< element;i++){
			current = current.getNext();
		}
		
		while(current != null){
			current = current.getNext();
			temp = temp.getNext();
		}
		return temp.getData();
	}
}
