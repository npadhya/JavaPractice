package com.nikul.javapractice.maths;

public class MyMath {

	int temp;
	int temp2;
	/*
	 * This method computes the factorial of a +ve number with recursion
	 */
	public int getFectorial(int number) throws Exception{
		if(number == 0)
			return 1;
		if(number < 0)
			throw new Exception("Not a good number");
		return number*getFectorial(number-1);
	}

	/*
	 * This method calculates the power of the base and returns with recursion.
	 */
	public float getPower(int base, int power){
		if(power == 0)
			return 1;
		if(power < 0)
			throw new IllegalArgumentException("Power is negative");
		System.out.println("-"+base +":"+power);
		return base* getPower(base,power-1);
	}
	
	/*
	 * This method will return the fibonaci series for the given number
	 */
	public long getFibonaci(long number){
		if(number == 0)
			return 0;
		if(number < 2)
			return 1;
		long fibTerm = getFibonaci(number-1) + getFibonaci(number-2);
		return fibTerm;
	}
	
	/*
	 * Revers an integer i.e. 638 -> 836
	 * 456 -> 654
	 */
	public int reversInteger(int number){
		while(number != 0){
			temp = temp*10;
			temp = temp+number%10;
			number = number /10;
		}
		return temp;
	}
	
	/*
	 * This method takes an input number and output true if the number is armstrong number
	 * An Armstrong number is a 3 digit number where sum of each digit's cue is equal to the number it self
	 * Example 153 == (1*1*1)+(5*5*5)+(3*3*3) 
	 */
	public boolean isArmstrongNumber(int number){
		temp=temp2=0;
		int num = number;
		while(number != 0){
			temp = number%10;
			temp2 = temp2 + (temp*temp*temp);
			number = number/10;
		}
		if(temp2 == num)
			return true;
		return false;
	}
	
	/*
	 * Reverse an integer array without any temp variable.
	 * This method will get an integer array and will reverse the array
	 */
	public int[] reversIntegerArray(int[] inputArray){
		int start = 0;
		int end = inputArray.length;
		while(start<end){
			inputArray[start] = inputArray[start]+inputArray[end];
			inputArray[end] = inputArray[start] - inputArray[end];
			inputArray[start] = inputArray[start] - inputArray[end];
		}
		return inputArray;
	}
	
}