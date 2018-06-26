package com.npadhya.practice.matrix;

public class IntervalPresent {

    public static boolean isPresent(int[][] input, int start, int end, int numToSearch){
        if(end < 0 || start > input.length || start >= end){
            return false;
        }

        int indexToSearch = (start + end) / 2;
        System.out.println("-------------");
        System.out.println(start);
        System.out.println(end);
        System.out.println(indexToSearch);
        if(numToSearch >= input[indexToSearch][0] && numToSearch <= input[indexToSearch][1]){
            return true;
        } else {
            if(numToSearch >= input[indexToSearch][0] && numToSearch >= input[indexToSearch][1])
                return isPresent(input, indexToSearch+1, end, numToSearch);
            else
                return isPresent(input, start, indexToSearch, numToSearch);
        }
    }
}
