package com.nikul.javapractice.maths;

public class MyMath {

	int temp;
	int temp2;

	/*
	 * This method computes the factorial of a +ve number with recursion
	 */
	public int getFectorial(int number) throws Exception {
		if (number == 0)
			return 1;
		if (number < 0)
			throw new Exception("Not a good number");
		return number * getFectorial(number - 1);
	}

	/*
	 * This method calculates the power of the base and returns with recursion.
	 */
	public float getPower(int base, int power) {
		if (power == 0)
			return 1;
		if (power < 0)
			throw new IllegalArgumentException("Power is negative");
		System.out.println("-" + base + ":" + power);
		return base * getPower(base, power - 1);
	}

	/*
	 * This method will return the fibonaci series for the given number
	 */
	public long getFibonaci(long number) {
		if (number == 0)
			return 0;
		if (number < 2)
			return 1;
		long fibTerm = getFibonaci(number - 1) + getFibonaci(number - 2);
		return fibTerm;
	}

	/*
	 * Revers an integer i.e. 638 -> 836 456 -> 654
	 */
	public int reversInteger(int number) {
		while (number != 0) {
			temp = temp * 10;
			temp = temp + number % 10;
			number = number / 10;
		}
		return temp;
	}

	/*
	 * This method takes an input number and output true if the number is
	 * armstrong number An Armstrong number is a 3 digit number where sum of
	 * each digit's cue is equal to the number it self Example 153 ==
	 * (1*1*1)+(5*5*5)+(3*3*3)
	 */
	public boolean isArmstrongNumber(int number) {
		temp = temp2 = 0;
		int num = number;
		while (number != 0) {
			temp = number % 10;
			temp2 = temp2 + (temp * temp * temp);
			number = number / 10;
		}
		if (temp2 == num)
			return true;
		return false;
	}

	/*
	 * Reverse an integer array without any temp variable. This method will get
	 * an integer array and will reverse the array
	 */
	public int[] reversIntegerArray(int[] inputArray) {
		int start = 0;
		int end = inputArray.length;
		while (start < end) {
			inputArray[start] = inputArray[start] + inputArray[end];
			inputArray[end] = inputArray[start] - inputArray[end];
			inputArray[start] = inputArray[start] - inputArray[end];
		}
		return inputArray;
	}

	/*
	 * Shifting operations left shift - '<<' right shit - '>>'
	 */
	public void logicalOperations(int n) {
		System.out.println("The number is : " + n);
		int temp = 0;

		temp = n >> 1;
		System.out.println("Right Shift : " + temp);
		temp = n >> 2; // Do right shift operation 2 times. i.e. divide the
						// number by 4.
		System.out.println("Right Shift 2 : " + temp);

		temp = n << 1;
		System.out.println("Left Shift : " + temp);
		temp = n & 0;
		System.out.println("& op : " + temp);
		temp = n | 0;
		System.out.println("| op : " + temp);
	}

	/*
	 * Is number divisible by
	 * the method takes 2 argument. 
	 * 	1> The number to be divided
	 * 	2> The number should be divisible by
	 * 
	 * The Logic is to increment a count by the divisible number till the count is less than the number.
	 * Once the count is not less than the number divisible by check if both are equal (This is the case where the given number is divisible by the given divider)
	 * if at the end its not equal and the count is greater than its not divisible by.
	 * 
	 */
	public boolean isDivisibleBy(long number, int divisibleBy) {
		int x = divisibleBy;
		long n = number;
		if(divisibleBy == 0)
			throw new ArithmeticException("Divide by zero");
		System.out.println("Check if "+ number +" is divisible by " + divisibleBy);
		int count =0;
		while (x < n) {
			x = x + divisibleBy;
			count++;
		}
		System.out.println(count);
		if (x == n ){
			return true;
		}else{
			return false;
		}
	}

	/*
	 * Binary String to Int value This method will take a String input "Binary"
	 * format - "100110" and the return is an integer converted from the binary
	 */
	public int convertToInteger(String binaryInput) {
		int outputInteger = 0;
		outputInteger = (int) Integer.parseInt(binaryInput, 2);
		return outputInteger;
	}
}