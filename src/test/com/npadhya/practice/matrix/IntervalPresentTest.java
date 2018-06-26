package com.npadhya.practice.matrix;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntervalPresentTest {

    int[][] input = new int[][]{{0,10},{31,36},{50,70},{71,85},{86,95}};

    @Test
    public void teat1(){
        Assert.assertFalse(IntervalPresent.isPresent(input, 0,input.length, 40));
    }

    @Test
    public void teat2(){
        Assert.assertTrue(IntervalPresent.isPresent(input, 0,input.length, 71));
    }

    @Test
    public void teat3(){
        Assert.assertTrue(IntervalPresent.isPresent(input, 0,input.length, 4));
    }

    @Test
    public void teat4(){
        Assert.assertFalse(IntervalPresent.isPresent(input, 0,input.length, 96));
    }

}
