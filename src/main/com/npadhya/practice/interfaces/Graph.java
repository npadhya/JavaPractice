package com.npadhya.practice.interfaces;

import com.npadhya.practice.nodes.Edge;
import com.npadhya.practice.nodes.Node;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Graph implements DataStructures{

    protected Set<Node> vertexes = new HashSet<Node>();
    protected Set<Edge> edges = new HashSet<Edge>();

    public boolean addVertex(Node vertex){
        vertexes.add(vertex);
        return true;
    }

    public boolean addEdge(Edge edge){
        edges.add(edge);
        vertexes.add(edge.getSourceNode());
        vertexes.add(edge.getDestinationNode());
        List<Node> neighbor = edge.getSourceNode().getNeighbors();
        neighbor.add(edge.getDestinationNode());
        edge.getSourceNode().setNeighbors(neighbor);
        return true;
    }

    public boolean removeVertex(Node vertex){
        vertexes.remove(vertex);
        return true;
    }

    public boolean removeEdge(Edge edge){
        edges.remove(edge);
        edge.getSourceNode().getNeighbors().remove(edge.getDestinationNode());
        return true;
    }

    public int vertexSize(){
        return vertexes.size();
    }
    public int edgeSize(){
        return edges.size();
    }
    public int size(){
        System.out.println("Total size is ");
        return vertexSize() + edgeSize();
    }

    public void print(){
        System.out.println("Printing ....");
        for(Edge eachEdge : edges){
            System.out.println("Edge with weight : " + eachEdge.getWeight() + " has | Source : " + eachEdge.getSourceNode().getStringData() + " | Destination : " + eachEdge.getDestinationNode().getStringData() );
        }
    }

    public int weightOfTheGraph(){
        int count = 0;
        Iterator<Edge> iterator = edges.iterator();

        while(iterator.hasNext()){
            count += iterator.next().getWeight();
        }
        return count;
    }

}
