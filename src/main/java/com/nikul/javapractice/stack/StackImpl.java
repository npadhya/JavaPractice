package com.nikul.javapractice.stack;

public class StackImpl {

	private Node top;
	private Node temp;
	
	/*
	 * push data to the TOP of the Stack
	 */
	public void stackPush(String data){
		temp = new Node(data);
		if(isStackEmpty()){
			System.out.println("Creating New stack..");
			System.out.println("Adding Data to TOP");
			top = temp;
		}else{
			top.setTop(temp);
			temp.setBottom(top);
			top = top.getTop();
		}
	}
	
	/*
	 * pop data out of the stack from the TOP of the stack
	 */
	public String stackPop(){
		if(!isStackEmpty()){
			String data = top.getData();
			top = top.getBottom();
			return data;
		}
		return "";
	}
	
	/*
	 * Show Stack will show the contect of the stack from Top to bottom
	 * 
	 */
	public void showStack(){
		temp = top;
		while(temp != null){
			
			System.out.println(temp.getData());
			temp = temp.getBottom();
		}
	}
	
	/*
	 * return boolean indicating isStackEmpty
	 */
	public boolean isStackEmpty(){
		if(top==null){
			System.out.println("The Stack is EMPTY");
			return true;
		}
		return false;
	}
}
