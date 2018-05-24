package com.npadhya.practice.tree;

import com.npadhya.practice.interfaces.Tree;
import com.npadhya.practice.nodes.Edge;
import com.npadhya.practice.nodes.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleTree implements Tree {

    private Set<Node> vertexes = new HashSet<Node>();
    private Set<Edge> edges = new HashSet<Edge>();

    public boolean insertVertex(Node vertex) {
        return vertexes.add(vertex);
    }

    public boolean removeVertex(Node vertex) {
        return vertexes.remove(vertex);
    }

    public boolean removeEdge(Edge edge) {
        edges.remove(edge);
        edge.getSourceNode().getNeighbors().remove(edge.getDestinationNode());
        vertexes.remove(edge.getSourceNode());
        vertexes.remove(edge.getDestinationNode());
        return true;
    }

    public boolean addEdge(Edge edge) {
        edges.add(edge);
        vertexes.add(edge.getDestinationNode());
        vertexes.add(edge.getSourceNode());
        List<Node> neighborList = new ArrayList<Node>();
        neighborList.add(edge.getDestinationNode());
        edge.getSourceNode().setNeighbors(neighborList);
        return true;
    }

    public int vertexSize() {
        return vertexes.size();
    }

    public int edgeSize() {
        return edges.size();
    }

    public int size() {
        System.out.println("Total size of the tree is ");
        return vertexSize() + edgeSize();
    }

    public void print() {
        System.out.println("Printing the Tree");
        for(Edge eachEdge : edges){
            System.out.println("Edge with weight : " + eachEdge.getWeight() + " has | Source : " + eachEdge.getSourceNode().getStringData() + " | Destination : " + eachEdge.getDestinationNode().getStringData() );
        }
    }

}
