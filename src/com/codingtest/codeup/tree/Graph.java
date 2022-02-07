package com.codingtest.codeup.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<List<GraphNode>> graph;
    Integer length;

    public Graph(int num) {
        this.graph = new LinkedList<>();
        this.length=num;
        for(int i=0; i<length; i++){
            graph.add(new LinkedList<>());
        }
    }

    public void addNode(Integer from,Integer to){
        GraphNode toNode=new GraphNode(to);
        graph.get(from-1).add(toNode);
    }

    public void print(){
        for(int i =0; i<graph.size();i++){
            System.out.print((i+1));
            for(int j =0; j< graph.get(i).size();j++){
                System.out.print("->" + graph.get(i).get(j).getVertex() +" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addNode(1,2);
        graph.addNode(1,3);
        graph.addNode(1,4);
        graph.addNode(2,4);
        graph.addNode(3,4);
        graph.print();

    }



}
