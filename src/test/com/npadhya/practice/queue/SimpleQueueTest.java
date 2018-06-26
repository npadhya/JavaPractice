package com.npadhya.practice.queue;

import com.npadhya.practice.interfaces.Queue;
import com.npadhya.practice.nodes.Node;
import org.testng.annotations.Test;

public class SimpleQueueTest {

    Queue q = new SimpleQueue();

    @Test
    public void simpleQueueTest1(){
        q.push(new Node("First",1));
        q.push(new Node("Second",2));
        q.push(new Node("Third",3));
        q.push(new Node("Forth",4));
        q.push(new Node("Fifth",5));

        q.print();

    }

    @Test
    public void simpleQueueTest2(){
        q.push(new Node("First",1));
        q.push(new Node("Second",2));
        q.push(new Node("Third",3));
        q.push(new Node("Forth",4));
        q.push(new Node("Fifth",5));

        q.print();

        q.pop();
        q.print();

    }

    @Test
    public void simpleQueueTest3(){
        q.push(new Node("First",1));
        q.push(new Node("Second",2));
        q.push(new Node("Third",3));
        q.push(new Node("Forth",4));
        q.push(new Node("Fifth",5));


        q.print();

        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.print();

    }
}
