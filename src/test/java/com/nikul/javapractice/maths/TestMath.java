package com.nikul.javapractice.maths;

public class TestMath {

	public static void main(String args[]) throws Exception{
		MyMath math = new MyMath();
		
	//	System.out.println("GetFactorial : " +math.getFectorial(2));
	//	System.out.println("GetPower : " +math.getPower(2, 8));
	//	System.out.println("GetFibonaci :" + math.getFibonaci(1100));
	//	System.out.println(math.reversInteger(456));
		
		System.out.println(math.isArmstrongNumber(371));
		System.out.println(math.isArmstrongNumber(153));
		
	}
}
