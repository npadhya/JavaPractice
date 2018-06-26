package com.npadhya.practice.tree;

import com.npadhya.practice.interfaces.Queue;
import com.npadhya.practice.interfaces.Tree;
import com.npadhya.practice.nodes.Node;
import com.npadhya.practice.queue.SimpleQueue;

public class BinaryTree extends Tree {

    private Node rootNode;

    private Queue q = new SimpleQueue();

    public BinaryTree(){

    }
    public int countLeafNodes() {
        return 0;
    }

    public int getTreeHeight() {
        return 0;
    }

    public void addNode(Node vertex) {
        if(rootNode == null){
            rootNode = vertex;
            rootNode.setParent(null);
        } else {
            addNode(rootNode, vertex);
        }
    }

    private void addNode(Node parentNode, Node childNode){
        if(parentNode != null) {
            if(parentNode.compareTo(childNode) > 0){
                if(parentNode.getRightChild() != null){
                    addNode(parentNode.getRightChild(),childNode);
                } else {
                    childNode.setParent(parentNode);
                    parentNode.setRightChild(childNode);
                }
            } else if(parentNode.compareTo(childNode) < 0){
                if(parentNode.getLeftChild() != null){
                    addNode(parentNode.getLeftChild(),childNode);
                } else {
                    childNode.setParent(parentNode);
                    parentNode.setLeftChild(childNode);
                }
            }
        }
    }

    public void BreathFirstSearch(){
        if(rootNode == null){
            System.out.println("Null tree, Nothing to search");
        } else {
            q.push(rootNode);
            while(q.hasNext()){
                Node tempNode = q.pop();
                System.out.println("Node : " + tempNode.toString());
                if(tempNode.getLeftChild() != null)
                    System.out.println("Left child : " +tempNode.getLeftChild().toString());
                if(tempNode.getRightChild() != null)
                    System.out.println("Right child : " + tempNode.getRightChild().toString());
                q.push(tempNode.getLeftChild());
                q.push(tempNode.getRightChild());
            }
        }
    }

    public void DepthFirstSearch(){
        if(rootNode == null){
            System.out.println("Null tree, Nothing to search");
        } else {
            recursiveDFS(rootNode);
        }
    }

    private static Node recursiveDFS(Node rootNode){

        if(rootNode.getRightChild() == null && rootNode.getLeftChild()==null){
            return rootNode;
        } else{

            if(rootNode.getLeftChild()!= null){
                System.out.print(rootNode.toString());
                System.out.println("LeftChild : " + rootNode.getLeftChild());
                recursiveDFS(rootNode.getLeftChild());
            }

            if(rootNode.getRightChild() != null){
                System.out.print(rootNode.toString());
                System.out.println("RightChild : " + rootNode.getRightChild());
                recursiveDFS(rootNode.getRightChild());
            }

        }
        return rootNode;
    }

    @Override
    public void print(){
        System.out.println(rootNode);
    }
}
