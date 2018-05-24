package com.npadhya.practice.nodes;

import java.util.List;

public class Node {

    private String stringData;
    private int numberData;
    private Node nextPointer;
    private Node previousPointer;
    private Node parentPointer;

    private List<Node> neighbors;

    public Node(String stringData,int numberData){
        this.stringData = stringData;
        this.numberData = numberData;
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

    public int getNumberData() {
        return numberData;
    }

    public void setNumberData(int numberData) {
        this.numberData = numberData;
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

    public Node getParentPointer() {
        return parentPointer;
    }

    public void setParentPointer(Node parentPointer) {
        this.parentPointer = parentPointer;
    }
}
