package com.npadhya.practice.arrays;

import com.npadhya.practice.matrix.NqueenProblem;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NQueenTest {

    @Test
    public void nQueenTest(){
        boolean result = NqueenProblem.nQueenPlaement(8);
        System.out.println(result);
        Assert.assertTrue(result);
    }
}
