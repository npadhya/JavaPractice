package com.npadhya.practice.nodes;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>{

    private String stringData;
    private int weight;
    private int data;
    private Node leftChild;
    private Node rightChild;
    private Node parent;
    private Node nextPointer;
    private Node previousPointer;

    private List<Node> neighbors = new ArrayList<Node>();

    public Node(String stringData,int numberData){
        this.stringData = stringData;
        this.weight = numberData;
    }
    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getNextPointer() {
        return nextPointer;
    }

    public void setNextPointer(Node nextPointer) {
        this.nextPointer = nextPointer;
    }

    public Node getPreviousPointer() {
        return previousPointer;
    }

    public void setPreviousPointer(Node previousPointer) {
        this.previousPointer = previousPointer;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public int compareTo(Node o) {
        if (this.data == o.data) {
            return 0;
        } else if (this.data > o.data){
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "stringData='" + stringData + '\'' +
                ", weight=" + weight +
                ", data=" + data +
                '}';
    }
}
