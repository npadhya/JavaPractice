package com.npadhya.practice.graphs;

import com.npadhya.practice.interfaces.Graph;
import com.npadhya.practice.interfaces.Tree;
import com.npadhya.practice.nodes.Node;

import java.util.List;

public class GraphUtil {

    public void breathFirstSearch(Tree inTree, Node root){
        System.out.println("Doing Breath first search for the Tree");
    }

    public void depthFirstSearch(Tree inTree, Node root){
        System.out.println("Doing depth first search for the Tree");
    }

    public List<Node> findPath(Tree tree, Node source, Node destination){

        return null;
    }

    public void printGraph(Graph inGraph){
        inGraph.print();
    }
}
