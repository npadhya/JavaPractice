package com.npadhya.practice.leetCode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<Integer>();
        int lastIndexOf = Integer.MIN_VALUE;
        int prevLastIndex = -1;
        for(int i = 0 ; i < S.length() ; i++){
            lastIndexOf = Math.max(lastIndexOf,S.lastIndexOf(S.charAt(i)));
            if(i == lastIndexOf){
                result.add(lastIndexOf-prevLastIndex);
                prevLastIndex = i;
                if(lastIndexOf == S.length()){
                    return result;
                }
                lastIndexOf = Integer.MIN_VALUE;
            }
        }
        return result;
    }
}
