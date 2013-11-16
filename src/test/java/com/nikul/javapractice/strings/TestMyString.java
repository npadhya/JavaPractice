package com.nikul.javapractice.strings;

public class TestMyString {
	
	public static void main(String[] string){
		
		char[] anotherString;
		MyString myString;
		
		anotherString = "abc".toCharArray();
		myString = new MyString("abc");
		
		System.out.println(myString.LexographicComparision(anotherString));
		
		anotherString = "abc".toCharArray();
		myString = new MyString("abcd");
		
		System.out.println(myString.LexographicComparision(anotherString));
		
		anotherString = "abcde".toCharArray();
		myString = new MyString("abcd");
		
		System.out.println(myString.LexographicComparision(anotherString));
		
		anotherString = "bc".toCharArray();
		myString = new MyString("abcd");
		
		System.out.println(myString.LexographicComparision(anotherString));
		//myString.removeChar('c');
	}
}
