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

    @Test
    public void testPartitionList(){
        LinkedList ll = new LinkedList(6);
        ll.addNode(2);
        ll.addNode(1);
        ll.addNode(4);
        ll.addNode(9);
        ll.addNode(5);
        ll.addNode(10);
        ll.addNode(11);
        ll.addNode(12);
        ll.addNode(7);
        ll.addNode(13);
        ll.addNode(3);
        ll.addNode(21);
        ll.printLL();
        ll.partList();
        ll.printLL();
    }
}