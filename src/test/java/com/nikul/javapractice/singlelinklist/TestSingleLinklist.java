package com.nikul.javapractice.singlelinklist;

import static org.junit.Assert.*;

import org.junit.*;

public class TestSingleLinklist {

	@Test
	public void testLinklistIsPresent(){
		SingleLinklistImpl singlyLinklist = new SingleLinklistImpl();
		assertNotNull(singlyLinklist);
	}
	
	@Test
	public void testCreateNewList(){
		SingleLinklistImpl singlyLinklist = new SingleLinklistImpl();
		assertNotNull(singlyLinklist.createLinklist(4));
	}
	
	@Test
	public void testLinklistIsNotEmpty(){
		SingleLinklistImpl singlyLinklist = new SingleLinklistImpl();
		assertTrue(singlyLinklist.isListEmpty());
	}
	
	@Test
	public void testMultiplePushInList(){
		SingleLinklistImpl singlyLinklist = new SingleLinklistImpl();
		singlyLinklist.addData(1);
		singlyLinklist.addData(2);
		singlyLinklist.addData(3);
	}
	
	@Test
	public void testRemovingDataEmptiesTheList(){
		SingleLinklistImpl singlyLinklist = new SingleLinklistImpl();
		singlyLinklist.addData(1);
		singlyLinklist.addData(2);
		singlyLinklist.removeData();
		singlyLinklist.removeData();
		assertTrue(singlyLinklist.isListEmpty());
	}
	
	@Test
	public void testPrintLinklist(){
		SingleLinklistImpl singlyLinklist = new SingleLinklistImpl();
		singlyLinklist.addData(1);
		singlyLinklist.addData(2);
		singlyLinklist.addData(3);
		singlyLinklist.addData(4);
		singlyLinklist.showList();
	}
}