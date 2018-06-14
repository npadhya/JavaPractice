package com.npadhya.practice.bitwise;

import org.testng.annotations.Test;

public class TestBitwiseUtils {

    BitwiseUtils bitwiseUtils = new BitwiseUtils();

    @Test
    public void testBitWiseNumbers(){
        bitwiseUtils.bitWiseNumbers();
    }

    @Test
    public void testNextExOr(){
        bitwiseUtils.nextExOr();
    }

    @Test
    public void updateBitsTest(){
        bitwiseUtils.updateBits(12123445,5000,17,6);
    }

    @Test
    public void bitWiseNumberPrintTest(){
        bitwiseUtils.bitWiseNumberPrint();
    }

    @Test
    public void bitWiseAndOperationTest() {
        bitwiseUtils.bitWiseAndOperation();
    }

    @Test
    public void arithmeticVsBitwiseShiftTest() {
        bitwiseUtils.arithmeticVsBitwiseShift();
    }

    @Test
    public void bitCountTest(){
        System.out.println(bitwiseUtils.bitCount(6));
        System.out.println(bitwiseUtils.bitCount(-6));
        //bitwiseUtils.temp();
    }
}
