package com.npadhya.practice.strings;

public class StringUtils {

    public boolean isPalindrome(String inputString){
        if(inputString.length() <= 0 ){
            return false;
        }
        int max = 0;
        for(int i  = 0; i <inputString.length();i++){
            max ^= 1 << (inputString.charAt(i) - 'a');
        }

        return (max & -max) == max;
    }
}
