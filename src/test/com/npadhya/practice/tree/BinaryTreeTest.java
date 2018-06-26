package com.npadhya.practice.tree;

import com.npadhya.practice.nodes.Node;
import org.testng.annotations.Test;

public class BinaryTreeTest {

    BinaryTree binaryTree = new BinaryTree();

    @Test
    public void simpleInsertionTest(){
        Node rootNode = new Node("A",5);
        rootNode.setData(10);
        binaryTree.addNode(rootNode);


        Node nodeB = new Node("B",4);
        nodeB.setData(5);
        Node nodeC = new Node("C",6);
        nodeC.setData(11);
        Node nodeD = new Node("D",3);
        nodeD.setData(3);
        Node nodeE = new Node("E",7);
        nodeE.setData(6);
        Node nodeF = new Node("F",1);
        nodeF.setData(8);
        Node nodeG = new Node("F",1);
        nodeG.setData(13);
        Node nodeH = new Node("F",1);
        nodeH.setData(1);
        Node nodeI = new Node("F",1);
        nodeI.setData(2);
        Node nodeJ = new Node("F",1);
        nodeJ.setData(4);
        Node nodeK = new Node("F",1);
        nodeK.setData(7);
        Node nodeL = new Node("F",1);
        nodeL.setData(9);
        Node nodeM = new Node("F",1);
        nodeM.setData(12);
        Node nodeN = new Node("F",1);
        nodeN.setData(14);


        binaryTree.addNode(nodeB);
        binaryTree.addNode(nodeC);
        binaryTree.addNode(nodeD);
        binaryTree.addNode(nodeE);
        binaryTree.addNode(nodeF);
        binaryTree.addNode(nodeG);
        binaryTree.addNode(nodeH);
        binaryTree.addNode(nodeI);
        binaryTree.addNode(nodeJ);
        binaryTree.addNode(nodeK);
        binaryTree.addNode(nodeL);
        binaryTree.addNode(nodeM);
        binaryTree.addNode(nodeN);

        //binaryTree.BreathFirstSearch();
        binaryTree.DepthFirstSearch();

    }
}
