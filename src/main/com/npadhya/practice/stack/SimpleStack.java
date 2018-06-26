package com.npadhya.practice.stack;

import com.npadhya.practice.interfaces.Stack;
import com.npadhya.practice.nodes.Node;

public class SimpleStack implements Stack {

    private int size = 0;

    private Node headNode;
    private Node lastNode;

    @Override
    public boolean push(Node input) {
        if(input == null){
            System.out.println("Null input, Nothing to add");
            return false;
        }
        size++;
        if(headNode == null){
            headNode = input;
            lastNode = headNode;
        } else {
            headNode.setNextPointer(input);
            input.setPreviousPointer(headNode);
            headNode = headNode.getNextPointer();
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return this.size > 0;
    }

    @Override
    public Node pop() {
        if(size <= 0){
            System.out.println("Empty stack, Returning null");
            return null;
        }
        Node returnNode = headNode;
        headNode = headNode.getPreviousPointer();
        this.size--;
        return returnNode;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void print() {
        System.out.println("Size of the queue is :" +  this.size);
        Node tempNode = headNode;
        while(tempNode != null){
            System.out.println(tempNode.toString());
            tempNode = tempNode.getPreviousPointer();
        }
    }
}
