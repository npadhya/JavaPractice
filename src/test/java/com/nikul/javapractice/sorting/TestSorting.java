package com.nikul.javapractice.sorting;

public class TestSorting {

	public static void main(String[] args){
		MySortingImpl sorting = new MySortingImpl();
		int[] myArray = {5,4,7,3,8,2};
		for(int i =0; i< myArray.length;i++){
			System.out.print(myArray[i]);
		}
		System.out.println('-');
	//	sorting.insertionSort(myArray);
		for(int i =0; i< myArray.length;i++){
			System.out.print(myArray[i]);
		}
		myArray = sorting.mergeSort(myArray);
		System.out.println('-');
		for(int i =0; i< myArray.length;i++){
			System.out.print(myArray[i]);
		}
	}
}
