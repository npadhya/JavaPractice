package com.nikul.javapractice.sorting;

public class MySortingImpl {

	/*
	 * This is the insertion Sort algorithm which takes in an array of int and returns an array
	 * in sorted order
	 */
	public int[] insertionSort(int[] inputArray){
		int key = 0;
		for(int i = 1; i < inputArray.length;++i){
			key = inputArray[i];
			int j = i-1;
			while(j>=0 && inputArray[j]>key){
				inputArray[j+1] = inputArray[j];
				j--;
			}
			inputArray[j+1]=key;
		}
		
		return inputArray;
	}
	
	/*
	 * This method is a MergeSort algorithm
	 * initially start = 0;
	 * and finish = length of the array.
	 */
	public int[] mergeSort(int[] mainArray){
		if(mainArray.length == 1)
			return mainArray;
		int len = mainArray.length/2;
		int[] left = new int[len];
	    int[] right = new int[mainArray.length - len];

	    for (int i = 0; i < len; i++)
	        left[i] = mainArray[i];
	    for (int i = len; i < mainArray.length; i++)
	        right[i-len] = mainArray[i];

	    return mergify(mergeSort(left),mergeSort(right));
	}

	/*
	 * Mergify is the helper function for MergeSort. After dividing the main length
	 * Mergify is used to Merge all the array to produce the output.
	 */
	private int[] mergify(int[] left,int[] right){
		int[] outputArray = new int[left.length+right.length];
		int lengthLeft=left.length;
		int lengthRight=right.length;
		
		while (lengthLeft > 0 && lengthRight > 0){
	        if (left[left.length - lengthLeft] < right[right.length - lengthRight]){
	        	outputArray[outputArray.length -lengthLeft-lengthRight] = left[left.length - lengthLeft];
	            lengthLeft--;
	        }else{
	        	outputArray[outputArray.length - lengthLeft-lengthRight] = right[right.length - lengthRight];
	            lengthRight--;
	        }
	    }
	    while (lengthLeft > 0){
	    	outputArray[outputArray.length - lengthLeft] = left[left.length-lengthLeft];
	        lengthLeft--;
	    }
	    while (lengthRight > 0){
	    	outputArray[outputArray.length - lengthRight] = right[right.length-lengthRight];
	        lengthRight--;
	    }
	    return outputArray;
	}
}