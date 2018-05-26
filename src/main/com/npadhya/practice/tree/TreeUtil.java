package com.npadhya.practice.tree;

import com.npadhya.practice.graphs.GraphUtil;
import com.npadhya.practice.interfaces.Tree;
import com.npadhya.practice.nodes.Node;

import java.util.List;

public class TreeUtil extends GraphUtil {

    public void breathFirstSearch(Tree inTree, Node root){
        System.out.println("Doing Breath first search for the Tree");
    }

    public void depthFirstSearch(Tree inTree, Node root){
        System.out.println("Doing depth first search for the Tree");
    }

    public List<Node> findPath(Tree tree, Node root, Node leaf){
       return null;
    }

    public void printTree(Tree inTree){
        inTree.print();
    }
}
