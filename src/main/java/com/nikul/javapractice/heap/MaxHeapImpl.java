package com.nikul.javapractice.heap;

public class MaxHeapImpl {

	HeapNode temp;
	HeapNode root;
	
	/**
	 * Insert in to Heap
	 */
	public void push(HeapNode node, int data){
		temp = new HeapNode(data);
		if(isEmpty()){
			root = temp;
		} else {
			if(root.getData() > data){
				if(root.getLeftChild() == null ){
					root.setLeftChild(temp);
				}else if(root.getRightChild() == null){
					root.setRightChild(temp);
				}else{
					
				}
			}else{
				
			}
		}
	}
	
	/**
	 * return true if Heap is empty
	 */
	public boolean isEmpty(){
		if(root != null)
			return false;
		else
			return true;
	}
}
