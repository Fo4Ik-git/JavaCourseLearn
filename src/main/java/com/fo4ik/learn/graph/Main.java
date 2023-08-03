package com.fo4ik.learn.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addEdge(0, 1, (byte) 1);
        graph.addEdge(1, 2, (byte) 1);
        graph.addEdge(2, 3, (byte) 1);
        graph.addEdge(0, 4, (byte) 1);
        graph.addEdge(4, 5, (byte) 1);

        graph.passInDeep(0);
        System.out.println("-----");
        graph.passInWidth(0);
    }

}
