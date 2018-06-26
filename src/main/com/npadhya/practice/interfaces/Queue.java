package com.npadhya.practice.interfaces;

import com.npadhya.practice.nodes.Node;

public interface Queue extends DataStructures{
    boolean push(Node input);
    Node pop();
    boolean hasNext();
}
