package com.npadhya.practice.leetCode;

import org.testng.annotations.Test;

public class AllPathsFromSourceToTargetTest {

    @Test
    public void test1(){

        int[][] input= new int[][]{{4,3,1},{3,2,4},{3},{4},{}};

        AllPathsFromSourceToTarget.allPathsSourceTarget(input);
    }
}
