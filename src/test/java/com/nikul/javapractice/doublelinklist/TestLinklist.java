package com.nikul.javapractice.doublelinklist;

import com.nikul.javapractice.doublelinklist.DoubleLinklistImpl;

public class TestLinklist {

	public static void main(String[] args){
		DoubleLinklistImpl link = new DoubleLinklistImpl();
		
		link.addNode(1);
		link.addNode(2);
		link.addNode(3);
		link.addNode(4);
		link.addNode(5);
		link.addNode(6);
		
		link.showList();
		
		link.removeNode(4);
		link.removeNode(0);
		
		link.showList();
		
		int[] someArrya = {4,5,6,7,8,9};
		link.convertToLinkList(someArrya);
		link.showList();
		
		System.out.println("Nth element : " + link.getNthElement(3));
	}
}