package com.nikul.javapractice.singlelinklist;

public class SingleLinklistImpl {

	private Node temp;
	private Node current;
	private Node head;

	/*
	 * This method adds data in to the Link list
	 */
	public void addData(int i) {
		if(isListEmpty()){
			createLinklist(i);
			current = head;
		}else{
			temp = new Node(i);
			current.setNext(temp);
			current = current.getNext();
		}
	}

	/*
	 * create a new linkList
	 */
	public Node createLinklist(int data) {
		return this.head = new Node(data);
	}

	/*
	 * check if a linklist is present or not.
	 */
	public boolean isListEmpty() {
		if(head == null)
			return true;
		return false;
	}

	/*
	 * This method will remove the last node in the list
	 */
	public void removeData() {
		if(head != null){
			temp = head;
			while(temp.getNext()!=null){
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
			temp= null;
		}
	}

	/*
	 * This method will travers through the whole list and 
	 */
	public void showList() {
		if(!isListEmpty()){
			temp = head;
			while(temp != null){
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}	
}