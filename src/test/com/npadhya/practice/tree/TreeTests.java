package com.npadhya.practice.tree;

import com.npadhya.practice.nodes.Edge;
import com.npadhya.practice.nodes.Node;
import org.testng.annotations.Test;

public class TreeTests {

    TreeUtil myTreeUtil = new TreeUtil();

    @Test
    public void firstTreeTest(){
        Node nodeA = new Node("A",1);
        Node nodeB = new Node("B",2);
        Node nodeC = new Node("C",3);
        Node nodeD = new Node("D",4);
        Node nodeE = new Node("E",5);
        Node nodeF = new Node("F",6);
        Node nodeG = new Node("G",7);
        Node nodeH = new Node("H",8);
        Node nodeI = new Node("I",9);

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

        Edge edgeAD = new Edge();
        edgeAD.setSourceNode(nodeA);
        edgeAD.setDestinationNode(nodeD);
        edgeAD.setWeight(5);

        Edge edgeDI = new Edge();
        edgeDI.setSourceNode(nodeD);
        edgeDI.setDestinationNode(nodeI);
        edgeDI.setWeight(15);

        Edge edgeCI = new Edge();
        edgeCI.setSourceNode(nodeC);
        edgeCI.setDestinationNode(nodeI);
        edgeCI.setWeight(7);

        Edge edgeBH = new Edge();
        edgeBH.setSourceNode(nodeB);
        edgeBH.setDestinationNode(nodeH);
        edgeBH.setWeight(3);

        Edge edgeHF = new Edge();
        edgeHF.setSourceNode(nodeH);
        edgeHF.setDestinationNode(nodeF);
        edgeHF.setWeight(13);

        Edge edgeAF = new Edge();
        edgeAF.setSourceNode(nodeA);
        edgeAF.setDestinationNode(nodeF);
        edgeAF.setWeight(4);

        Edge edgeBG = new Edge();
        edgeBG.setSourceNode(nodeB);
        edgeBG.setDestinationNode(nodeG);
        edgeBG.setWeight(4);

        Edge edgeAG = new Edge();
        edgeAG.setSourceNode(nodeA);
        edgeAG.setDestinationNode(nodeG);
        edgeAG.setWeight(4);

        Edge edgeAE = new Edge();
        edgeAE.setSourceNode(nodeA);
        edgeAE.setDestinationNode(nodeE);
        edgeAE.setWeight(5);

        Edge edgeGE = new Edge();
        edgeGE.setSourceNode(nodeG);
        edgeGE.setDestinationNode(nodeE);
        edgeGE.setWeight(6);

        SimpleTree simpleTree = new SimpleTree();
        simpleTree.addEdge(edgeAB);
        simpleTree.addEdge(edgeBC);
        simpleTree.addEdge(edgeAC);
        simpleTree.addEdge(edgeAD);
        simpleTree.addEdge(edgeDI);
        simpleTree.addEdge(edgeCI);
        simpleTree.addEdge(edgeBH);
        simpleTree.addEdge(edgeHF);
        simpleTree.addEdge(edgeAF);
        simpleTree.addEdge(edgeBG);
        simpleTree.addEdge(edgeAG);
        simpleTree.addEdge(edgeAE);
        simpleTree.addEdge(edgeGE);

        System.out.println("Total number of Vertex in the tree are : " + simpleTree.vertexSize() );
        System.out.println("Total number of Edge in the tree are : " + simpleTree.edgeSize() );

        TreeUtil myTreeUtil = new TreeUtil();
        myTreeUtil.printTree(simpleTree);
    }
}
