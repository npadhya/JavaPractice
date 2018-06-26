package com.npadhya.practice.leetCode;


public class MyLinkedList {

    class SinglyListNode {
        int val;
        SinglyListNode next;
        SinglyListNode(int x) { val = x; }
    }

    SinglyListNode headNode = null;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        SinglyListNode headNode;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        SinglyListNode tempPointer = headNode;
        while(index >= 0){
            if(tempPointer == null || tempPointer.next == null){
                return -1;
            }
            tempPointer = tempPointer.next;
            index--;
        }
        return tempPointer.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(headNode == null){
            headNode = new SinglyListNode(val);
        } else {
            SinglyListNode tempHead = new SinglyListNode(val);
            tempHead.next = headNode;
            headNode = tempHead;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        SinglyListNode tempPointer = headNode;
        if(headNode != null){
            while(tempPointer.next != null){
                tempPointer = tempPointer.next;
            }
            SinglyListNode temp = new SinglyListNode(val);
            tempPointer.next = temp;
        } else {
            addAtHead(val);
        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        SinglyListNode tempPointer = headNode;
        int i = 0;
        for( ; i < index -1 && tempPointer.next != null ; i++){
            tempPointer = tempPointer.next;
        }
        if(i < index - 1 ){
            return;
        }
        if(tempPointer == null)
            return;
        SinglyListNode newNode = new SinglyListNode(val);
        newNode.next = tempPointer.next;
        tempPointer.next = newNode;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        SinglyListNode tempPointer = headNode;
        if(tempPointer == null)
            return;
        int i = 0;
        for( ; i < index - 1 && tempPointer.next != null ; i++){
            tempPointer = tempPointer.next;
        }
        if(i < index - 1) {
            return;
        }
        if(tempPointer.next == null)
            return;
        else {
            tempPointer.next = tempPointer.next.next;
        }

    }
}
