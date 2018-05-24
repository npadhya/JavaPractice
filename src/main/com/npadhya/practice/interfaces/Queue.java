package com.npadhya.practice.interfaces;

import com.npadhya.practice.nodes.Node;

public interface Queue extends DataStructures{
    boolean add(Node input);
    boolean remove(Node input);
    boolean remove();
}
