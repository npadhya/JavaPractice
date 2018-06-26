package com.npadhya.practice.leetCode;

import java.util.Arrays;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class MaximumBinaryTree {

    public static TreeNode constructMaximumBinaryTree(int[] nums) {

        TreeNode root = new TreeNode(nums[0]);
        TreeNode leftRoot = null;
        TreeNode rightRoot = null;

        for(int i = 1 ; i < nums.length ; i++){
            TreeNode tempNode = new TreeNode(nums[i]);
            if(nums[i] > root.val){
                tempNode.left = root;
                root = tempNode;
                leftRoot = root.left;
                rightRoot = null;
            } else {
                if(rightRoot == null || nums[i] > rightRoot.val){
                    tempNode.left = rightRoot;
                    root.right = tempNode;
                    rightRoot = tempNode;
                } else {
                    TreeNode temp = root;
                    while(temp != null && temp.right != null){
                        temp = temp.right;
                    }
                    temp.right = tempNode;
                }
            }
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return root;
    }

}
