package com.nikul.javapractice.queue;

public class QueueImpl {

	private Node front;
	private Node temp;
	private Node rear;
	
	/*
	 * Queue push method should push the data in to the queue 
	 * The new data is always added to the Rear of the Queue
	 * which shoule be accessible last
	 */
	public void queuePush(int data){
		if(isQueueEmpty()){
			System.out.println("Creating new Queuq..");
			System.out.println("Adding item to REAR");
			front = new Node(data);
			rear = front;
		}else{
			temp = new Node(data);
			rear.setRear(temp);
			temp.setFront(rear);
			rear = rear.getRear();
		}
	}
	
	/*
	 * Queue pull method take the data out of the Queue from the front of the Queue
	 */
	public int queuePull(){
		if(isQueueEmpty()){
			System.out.println("Nothing to PULL");
			return (Integer) null;
		}else{
			System.out.println("Getting Data from the FRONT");
			int data = front.getData();
			front = front.getRear();
			return data;
		}
	}
	
	/*
	 * Show Queue will go through the whole Queue from Front to Rear and disply the content
	 */
	public void showQueue(){
		if(!isQueueEmpty()){
			temp = front;
			while(temp != null){
				System.out.println(temp.getData());
				temp = temp.getRear();
			}
		}
			
	}
	
	/*
	 * This method will check if the Queue is Empty or not 
	 */
	public boolean isQueueEmpty(){
		if(front == null){
			System.out.println("Queue is empty....");
			return true;
		}
		return false;
	}
}
