package com.nikul.javapractice.strings;

public class TestMyString {
	
	public static void main(String[] string){
		
		char[] anotherString;
		MyString myString = new MyString();
		
		String s = "Thisiissomegoodawesome 3221iteem312";
		MyString.makeSantence(s);
		
		MyString sentance = new MyString();
		
		String s1 = "This is a gooooooooooooooood day";
		System.out.println(sentance.reversSentance(s1));
		
		//String s1 = "This is a good day";
		System.out.println(sentance.reversSentence2(s1));
		
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
