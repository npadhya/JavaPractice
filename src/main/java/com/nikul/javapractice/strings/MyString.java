package com.nikul.javapractice.strings;

public class MyString {

	private String theString;

	public MyString(String str) {
		this.theString = str;
	}

	public String getTheString() {
		return theString;
	}

	/*
	 * do the Lexographic comparision between 2 strings One String is the object
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
		// The following While loop will loop for the min of the length of any of the array
		while(count < Math.min(thisStringLength, anotherStringLength)){
			if(thisString[count]>anotherString[count]){
				//System.out.println("This string is bigger");
				return -1;
			}
			else if(thisString[count]<anotherString[count]){
				//System.out.println("Another String is bigger");
				return 1;
			}
			else{
				//System.out.println("The String Matched");
			}
			++count;
		}
		// This if loop is to check if the length of the array is not equal and return accordingly.
		if(thisStringLength < anotherStringLength){
			//System.out.println("This string is bigger");
			return -1;
		}else if(thisStringLength > anotherStringLength){
			//System.out.println("Another String is bigger");
			return 1;
		}
		return 0;
	}

	/* The following method will remove a given character from the string using
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
	The following method will reverse a string character by character
	*/
	public static String reverseString(String str){

		char[] string = str.toCharArray();
		
		int start = 0;
		int end = str.length()-1;
		while(start < end){
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
	 *  The following method find out the position of a subString in a main String
	 *  Given a main String an SubString, The method will loop and see when a SubString is starting in the loop.
	*/
	public static void subString(String mainString, String subString,String newString){
        int i, j = 0;
        
        StringBuffer sb  = new StringBuffer();
        // Start a loop from 0 to eithr the length of the mainString or if all the subSting is comaired with mainString
        for (i = 0; i < mainString.length() && j < subString.length(); ++i)
        {
            // If char from mainString is matched with char in subString
            if (mainString.charAt(i) == subString.charAt(j))
            {
                ++j;
            }
            // If the char does not match but some previous char are matched than restart for the subString
            // Example "internnet" and "net" after comparing 1st 'n' if the 2nd char is not 'n' try re-matching the subSting by reducing the main String.
            else if(j>0){
                j=0;
                i--;
            }
            else
            {
            	sb.append(mainString.charAt(i));
                j = 0;
                //i--;
            }

        }
        // if j is equal to the subSting length means all the char in subString is matched with mainString
        if (j == subString.length())
        {
        	// get the number of time i was incremented - the length of the subString.
        	sb.append(newString, i-subString.length(), newString.length());
            System.out.println("Yes.. A match "+(i-subString.length()));
        }
	}
}
