package com.npadhya.practice.interfaces;

import com.npadhya.practice.nodes.Edge;
import com.npadhya.practice.nodes.Node;

public interface Tree extends DataStructures{

    boolean insertVertex(Node vertex);
    boolean removeVertex(Node vertex);
    boolean removeEdge(Edge edge);
    boolean addEdge(Edge edge);
    int vertexSize();
    int edgeSize();
    int size();
    void print();
}
