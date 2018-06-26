package com.npadhya.practice.stack;

import com.npadhya.practice.interfaces.Stack;
import com.npadhya.practice.nodes.Node;
import org.testng.annotations.Test;

public class SimpleStackTest {

    Stack s = new SimpleStack();

    @Test
    public void simpleStackTest1(){
        s.push(new Node("First",1));
        s.push(new Node("Second",2));
        s.push(new Node("Third",3));
        s.push(new Node("Forth",4));
        s.push(new Node("Fifth",5));

        s.print();

    }

    @Test
    public void simpleStackTest2(){
        s.push(new Node("First",1));
        s.push(new Node("Second",2));
        s.push(new Node("Third",3));
        s.push(new Node("Forth",4));
        s.push(new Node("Fifth",5));

        s.print();

        s.pop();
        s.print();

    }

    @Test
    public void simpleStackTest3(){
        s.push(new Node("First",1));
        s.push(new Node("Second",2));
        s.push(new Node("Third",3));
        s.push(new Node("Forth",4));
        s.push(new Node("Fifth",5));


        s.print();

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.print();

    }
}
