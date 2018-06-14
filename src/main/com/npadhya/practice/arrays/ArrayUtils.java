package com.npadhya.practice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ArrayUtils {

    public int areaOfRectangle(int[] inputArray){
        int maxArea = 0;

        for(int i = 0 ; i < inputArray.length;i++){
            int newArea = 0;
            int count = 0;
            for(int j = 0 ; j < inputArray.length;j++){
                if(i <= j){
                    if((inputArray[i]<= inputArray[j])){
                        count++;
                    } else {
                        break;
                    }
                } else if( i > j ){
                    if((inputArray[i] <= inputArray[j])){
                        count++;
                    }
                }
                newArea = count * inputArray[i];
            }
            maxArea = Math.max(maxArea,newArea);
        }

        return maxArea;
    }

    public int areaOfRectangleUsingStack(int[] inputArray){
        int maxArea = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        while(i < inputArray.length){
            if(stack.isEmpty() || inputArray[stack.peek()] <= inputArray[i] ){
                stack.push(i);
                i++;
            } else {
                int curMax = stack.pop();
                maxArea = Math.max(maxArea , inputArray[curMax] * ((stack.isEmpty()) ? i: i - stack.peek() - 1));
            }
        }
        while(stack.isEmpty()){
            int curMax = stack.pop();
            maxArea = Math.max(maxArea , inputArray[curMax] * ((stack.isEmpty()) ? i: i - stack.peek() - 1));
        }

        return maxArea;
    }

    public int longestConsiqutiveSubsequence(int[] input){
        int globalMax = 0;
        Set<Integer> inputSet = new HashSet<Integer>();
        for(Integer i : input){
            inputSet.add(i);
        }
        Set<Integer> consiqNumbers = new HashSet<Integer>();

        for(int i = 0 ; i < input.length;i++){
            int localMax = 0;
            int curNum = input[i];
            int temp = curNum+1;
            while(inputSet.contains(curNum) && !consiqNumbers.contains(curNum)){
                consiqNumbers.add(curNum);
                curNum--;
                localMax++;
            }
            while(inputSet.contains(temp) && !consiqNumbers.contains(temp)){
                consiqNumbers.add(temp);
                temp++;
                localMax++;
            }
            globalMax = Math.max(globalMax,localMax);
        }
        return globalMax;
    }
}
