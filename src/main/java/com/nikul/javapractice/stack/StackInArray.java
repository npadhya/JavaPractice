package com.nikul.javapractice.stack;

public class StackInArray {
	
	static int stackSize = 18;
	static int[] stackArray  = new int[stackSize];
	static int[] stackPointer = {0,0,0};
	static int[] arrayCapacity = {stackSize/3,stackSize/3,stackSize/3};
	
	
	public static boolean pushDataToArray(int arrayNumber, int data){
		
		if(stackPointer[arrayNumber] < arrayCapacity[arrayNumber]){
			int index = stackPointer[arrayNumber]+arrayNumber*arrayCapacity[arrayNumber];
			stackArray[index] = data;
			stackPointer[arrayNumber]++;
			return true;
		}
		else{
			System.out.println("Stack is full");
			return false;
		}
		
	}
	
	public static int popDataFromArray(int arrayNumber){
		if(stackPointer[arrayNumber] > 0){
			int returnNumber = 0;
			int index = stackPointer[arrayNumber]+arrayNumber*arrayCapacity[arrayNumber]-1;
			returnNumber =  stackArray[index];
			stackPointer[arrayNumber]--;
			return returnNumber;
		}else{
			System.out.println("Stack is empty...");
			return 0;
		}
		
	}
	
	public static void main(String args[]){
		
		pushDataToArray(0, 1);
		pushDataToArray(0, 3);
		pushDataToArray(0, 7);
		pushDataToArray(0, 6);
		pushDataToArray(0, 5);
		pushDataToArray(0, 3);
		pushDataToArray(0, 8);
		pushDataToArray(1, 1);
		pushDataToArray(1, 3);
		pushDataToArray(2, 4);
		
		System.out.println(popDataFromArray(2));
		System.out.println(popDataFromArray(1));
		System.out.println(popDataFromArray(0));
		System.out.println(popDataFromArray(0));
		System.out.println(popDataFromArray(0));
		System.out.println(popDataFromArray(0));
		System.out.println(popDataFromArray(0));
		System.out.println(popDataFromArray(0));
		System.out.println(popDataFromArray(0));
		System.out.println(popDataFromArray(0));
		
	}
}
