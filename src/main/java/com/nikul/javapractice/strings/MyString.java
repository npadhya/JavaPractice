package com.nikul.javapractice.strings;

import java.util.HashMap;
import java.util.Map;

import com.nikul.javapractice.stack.StackImpl;

public class MyString {

	private String theString;
	
	public MyString(){
		
	}

	public MyString(String str) {
		this.theString = str;
	}

	public String getTheString() {
		return theString;
	}

	/*
	 * do the Lexographic comparison between 2 strings One String is the object
	 * and another String is the passed to the method as Char array
	 */
	public int LexographicComparision(char[] anotherString) {

		if (theString == null) {
			System.out.println("The object is null");
		}
		if (anotherString == null) {
			System.out.println("Please pass in a String");
		}

		char[] thisString = this.getTheString().toCharArray();

		int thisStringLength = thisString.length;
		int anotherStringLength = anotherString.length;
		int count = 0;
		// The following While loop will loop for the min of the length of any
		// of the array
		while (count < Math.min(thisStringLength, anotherStringLength)) {
			if (thisString[count] > anotherString[count]) {
				// System.out.println("This string is bigger");
				return -1;
			} else if (thisString[count] < anotherString[count]) {
				// System.out.println("Another String is bigger");
				return 1;
			} else {
				// System.out.println("The String Matched");
			}
			++count;
		}
		// This if loop is to check if the length of the array is not equal and
		// return accordingly.
		if (thisStringLength < anotherStringLength) {
			// System.out.println("This string is bigger");
			return -1;
		} else if (thisStringLength > anotherStringLength) {
			// System.out.println("Another String is bigger");
			return 1;
		}
		return 0;
	}

	/*
	 * The following method will remove a given character from the string using
	 * StringBuffer
	 */
	public String removeChar(char c) {
		String str = this.getTheString();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) == c)) {
				stringBuffer = stringBuffer.append(str.charAt(i));
			}
		}
		return stringBuffer.toString();
	}

	/*
	 * The following method will replace all the space in a string to '%20'
	 * 
	 * The logic is to calculate all the space in the string and creating a new
	 * char[] with oldLength + space*2
	 * 
	 * start from end if a space encounter put 0,2,% in the new array and reduce
	 * the number by 3 if the space is not encounter simply copy the char from
	 * baseString to newString and reduce the newLength
	 */
	public static char[] replaceString(char[] baseString) {

		int space = 0, newLength, i = 0;
		int length = baseString.length;
		for (i = 0; i < length; i++) {
			if (baseString[i] == ' ') {
				space++;
			}
		}

		newLength = length + space * 2;
		char[] newString = new char[newLength];
		newString[newLength - 2] = '\0';

		for (int j = length - 1; j >= 0; --j) {
			if (baseString[j] == ' ') {
				newString[newLength - 1] = '0';
				newString[newLength - 2] = '2';
				newString[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				newString[newLength - 1] = baseString[j];
				newLength--;
			}
		}

		return newString;
	}

	/*
	 * The following method will reverse a string character by character
	 */
	public String reverseString(String str) {

		char[] string = str.toCharArray();

		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			char temp = string[start];
			string[start] = string[end];
			string[end] = temp;
			start++;
			end--;
		}
		String newString = new String(string);
		return newString;
	}

	/*
	 * The following method find out the position of a subString in a main
	 * String Given a main String an SubString, The method will loop and see
	 * when a SubString is starting in the loop.
	 */
	public static void subString(String mainString, String subString,
			String newString) {
		int i, j = 0;

		StringBuffer sb = new StringBuffer();
		// Start a loop from 0 to either the length of the mainString or if all
		// the subSting is compared with mainString
		for (i = 0; i < mainString.length() && j < subString.length(); ++i) {
			// If char from mainString is matched with char in subString
			if (mainString.charAt(i) == subString.charAt(j)) {
				++j;
			}
			// If the char does not match but some previous char are matched
			// than restart for the subString
			// Example "Internnet" and "net" after comparing 1st 'n' if the 2nd
			// char is not 'n' try re-matching the subSting by reducing the main
			// String.
			else if (j > 0) {
				j = 0;
				i--;
			} else {
				sb.append(mainString.charAt(i));
				j = 0;
				// i--;
			}

		}
		// if j is equal to the subSting length means all the char in subString
		// is matched with mainString
		if (j == subString.length()) {
			// get the number of time i was incremented - the length of the
			// subString.
			sb.append(newString, i - subString.length(), newString.length());
			System.out.println("Yes.. A match " + (i - subString.length()));
		}
	}

	public static void makeSantence(String wrongstring) {
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("This", "1");
		dictionary.put("is", "2");
		dictionary.put("awesome", "some");
		dictionary.put("value", "value");
		dictionary.put("good", "good");
		dictionary.put("item", "item");
		dictionary.put("some", "item");

		StringBuffer sb = new StringBuffer();
		String temp = "";
		String temp2 = "";
		for (int i = 0, j = 1, k = wrongstring.length(); j <= k; j++) {
			temp = wrongstring.substring(i, j);
			if (dictionary.containsKey(temp)) {
				sb.append(temp + " ");
				System.out.println("Word found");
				i = j;
			} else {
				for (int l = 0, n = temp.length(); l <= n; l++) {
					temp2 = temp.substring(l, n);
					if (dictionary.containsKey(temp2)) {
						sb.append(temp2 + " ");
						System.out.println("Word found");
						i = j;
					}
				}
			}
		}
		System.out.println(sb.toString());
	}

	/**
	 * Reverse a sentence separated by " " (space character) using stack
	 * Example: INPUT : This is a great day OUTPUT : day great a is This
	 */
	public String reversSentance(String inputSentence) {
		StringBuffer inString = new StringBuffer(inputSentence);
		StringBuffer outString = new StringBuffer();
		StackImpl myStack = new StackImpl();

		for (int i = 0, j = inputSentence.length(); i < j; i++) {
			if (inString.charAt(i) != ' ') {
				outString.append(inputSentence.substring(i, i + 1));
			} else {
				myStack.stackPush(" " + outString.toString());
				outString.setLength(0);

			}
		}

		while (!myStack.isStackEmpty()) {
			outString.append(myStack.stackPop());
		}
		return outString.toString();
	}

	/**
	 * Reverse a sentence separated by " " (space character) in place Example:
	 * INPUT : This is a great day OUTPUT : day great a is This
	 */
	public String reversSentence2(String inputSentence) {
		char[] string = inputSentence.toCharArray();

		int start = 0;
		int end = inputSentence.length() - 1;
		
		swap(string, start, end);
		int k =0,i=0;
		for (int j = end; i <= j; i++) {
			if (string[i] == ' ') {
				swap(string, k, i - 1);
				k = i + 1;
			}
			if(i == j){
				swap(string,k,j);
			}
		}
		String output = string.toString();
		return output;
	}

	private char[] swap(char[] input, int start, int end) {
		while (start < end) {
			if (input[start] != input[end]) {
				char temp = input[start];
				input[start] = input[end];
				input[end] = temp;
			}
			start++;
			end--;
		}

		return input;
	}
}
