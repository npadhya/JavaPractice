package com.npadhya.practice.leetCode;

import org.testng.annotations.Test;

import java.util.List;

public class PartitionLabelsTest {

    @Test
    public void Test1(){
        PartitionLabels partitionLabels = new PartitionLabels();
        List<Integer> result = partitionLabels.partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(result);
    }
}
