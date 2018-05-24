package com.npadhya.practice.strings;

import com.npadhya.practice.strings.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTests {
    StringUtils myStringUtil = new StringUtils();

    @Test
    public void isPalindromTest1(){
        String input = "abcba";
        boolean answer = myStringUtil.isPalindrome(input);
        Assert.assertTrue(answer);
    }

    @Test
    public void isPalindromTest2(){
        String input = "abcdef";
        boolean answer = myStringUtil.isPalindrome(input);
        Assert.assertFalse(answer);
    }

    @Test
    public void isPalindromTest3(){
        String input = "";
        boolean answer = myStringUtil.isPalindrome(input);
        Assert.assertFalse(answer);
    }

    @Test
    public void isPalindromTest4(){
        String input = "a";
        boolean answer = myStringUtil.isPalindrome(input);
        Assert.assertTrue(answer);
    }
}
