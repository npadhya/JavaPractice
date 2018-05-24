package com.npadhya.practice.interfaces;

import com.npadhya.practice.nodes.Edge;
import com.npadhya.practice.nodes.Node;

import java.util.List;

public class Tree extends Graph{

    public boolean addVertex(Node vertex) {
        return super.addVertex(vertex);
    }

    public boolean addEdge(Edge edge){
        if(vertexes.contains(edge.getDestinationNode())){
            System.out.println("Tree can not have cycles : Destination node already exists");
            return false;
        }
        return super.addEdge(edge);
    }

    public int countLeafNodes() {
        return 0;
    }

    public int getTreeHeight() {
        return 0;
    }
}
