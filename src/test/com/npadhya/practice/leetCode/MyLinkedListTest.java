package com.npadhya.practice.leetCode;

import org.testng.annotations.Test;

public class MyLinkedListTest {

    @Test
    public void test1(){

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        linkedList.get(1);            // returns 2
        linkedList.deleteAtIndex(1);  // now the linked list is 1->3
        linkedList.get(1);            // returns 3

    }

    @Test
    public void test2(){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.get(0);
        linkedList.addAtIndex(1,2);
        linkedList.get(0);
        linkedList.get(1);
        linkedList.addAtIndex(0,1);
        linkedList.get(0);
        linkedList.get(1);
    }
}
