package com.nikul.javapractice.maths;

import org.junit.Test;

public class TestMath {

	@Test
	public void testShiftOperations(){
		MyMath math = new MyMath();		
		math.logicalOperations(138954);
	}
	
	@Test
	public void testBinaryToInteger(){
		MyMath math = new MyMath();
		
		System.out.println(math.convertToInteger("0100"));
	}
	
	@Test
	public void testNumberDivisibleBy(){
		MyMath math = new MyMath();
		
		System.out.println(math.isDivisibleBy(35,5));
		System.out.println(math.isDivisibleBy(35,2));
		System.out.println(math.isDivisibleBy(1029937,5));
		System.out.println(math.isDivisibleBy(32,16));
		System.out.println(math.isDivisibleBy(270879340,5));
		System.out.println(math.isDivisibleBy(270879340,0));
		System.out.println(math.isDivisibleBy(270879340,270879340));
	}
}