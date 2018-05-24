package com.npadhya.practice.tree;

import com.npadhya.practice.nodes.Edge;
import com.npadhya.practice.nodes.Node;
import com.npadhya.practice.strings.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TreeTests {
    TreeUtil myTreeUtil = new TreeUtil();

    @Test
    public void firstTreeTest(){
        Node nodeA = new Node("A",1);
        Node nodeB = new Node("B",1);
        Node nodeC = new Node("C",1);
        Edge edgeAB = new Edge();
        edgeAB.setSourceNode(nodeA);
        edgeAB.setDestinationNode(nodeB);
        edgeAB.setWeight(1);

        Edge edgeBC = new Edge();
        edgeBC.setSourceNode(nodeB);
        edgeBC.setDestinationNode(nodeC);
        edgeBC.setWeight(2);

        Edge edgeAC = new Edge();
        edgeAC.setSourceNode(nodeA);
        edgeAC.setDestinationNode(nodeC);
        edgeAC.setWeight(3);

        SimpleTree simpleTree = new SimpleTree();
        simpleTree.addEdge(edgeAB);
        simpleTree.addEdge(edgeAC);
        simpleTree.addEdge(edgeBC);

        System.out.println("Total number of Vertex in the tree are : " + simpleTree.vertexSize() );
        System.out.println("Total number of Edge in the tree are : " + simpleTree.edgeSize() );

        TreeUtil myTreeUtil = new TreeUtil();
        myTreeUtil.printTree(simpleTree);
    }
}
