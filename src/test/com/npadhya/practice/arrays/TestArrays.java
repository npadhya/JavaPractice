package com.npadhya.practice.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestArrays {
    ArrayUtils myArrayUtils = new ArrayUtils();

    @Test
    public void areaOfRectangleTest1(){
        int[] graph = {2,3,6,7,7,5,1};
        int ans = myArrayUtils.areaOfRectangle(graph);
        Assert.assertEquals(ans,20);
    }

    @Test
    public void areaOfRectangleTest2(){
        int[] graph = {1,2,3,4,5,3,3,2};
        int ans = myArrayUtils.areaOfRectangle(graph);
        Assert.assertEquals(ans,20);
    }

    @Test
    public void areaOfRectangleUsingStackTest(){
        int[] graph = {1,2,3,4,5,3,3,2};
        int ans = myArrayUtils.areaOfRectangleUsingStack(graph);
        Assert.assertEquals(ans,20);
    }

    @Test
    public void areaOfRectangleUsingStackTest2(){
        int[] graph = {4,4,4,3,3,3,2,2,2};
        int ans = myArrayUtils.areaOfRectangleUsingStack(graph);
        Assert.assertEquals(ans,18);
    }

    @Test
    public void longestConsiqutiveSubsequenceTest1(){
        int ans = myArrayUtils.longestConsiqutiveSubsequence(new int[]{4,11,1,8,3,6,9,5});
        Assert.assertEquals(ans,4);
    }

    @Test
    public void longestConsiqutiveSubsequenceTest2(){
        int ans = myArrayUtils.longestConsiqutiveSubsequence(new int[]{1,2,3,4,5,6});
        Assert.assertEquals(ans,6);
    }

    @Test
    public void longestConsiqutiveSubsequenceTest3(){
        int ans = myArrayUtils.longestConsiqutiveSubsequence(new int[]{6,5,4,3,2,1});
        Assert.assertEquals(ans,6);
    }

    @Test
    public void longestConsiqutiveSubsequenceTest4(){
        int ans = myArrayUtils.longestConsiqutiveSubsequence(new int[]{1,3,5,7,9,11,13});
        Assert.assertEquals(ans,1);
    }
}
