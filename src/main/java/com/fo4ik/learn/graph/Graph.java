package com.fo4ik.learn.graph;

public class Graph {
    private int MAX_VERTS = 10;
    private int[][] adjMatrix;
    private Vertex[] vertexList;
    private int numberVerts;
    private Stack stack = new Stack();
    private Queue queue = new Queue();

    public Graph() {
        // Initialize the graph with a maximum of 10 vertices
        vertexList = new Vertex[MAX_VERTS];
        // Initialize the adjacency matrix to represent edges between vertices
        adjMatrix = new int[MAX_VERTS][MAX_VERTS];
        numberVerts = 0;
    }

    // Add a new vertex to the graph
    public void addVertex(char label) {
        vertexList[numberVerts++] = new Vertex(label);
    }

    // Add an edge between two vertices and set a value for the edge
    public void addEdge(int start, int end, byte value) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = value;
    }

    // Find the next unvisited neighbor of a vertex
    public int checkVertex(int vertex) {
        for (int i = 0; i < numberVerts; i++) {
            if (adjMatrix[vertex][i] == 1 && !vertexList[i].isVisited()) {
                return i;
            }
        }
        return -1;
    }

    // Perform Depth-First Search starting from the given vertex index
    public void passInDeep(int index){
        System.out.println(vertexList[index].getLabel()); // Visit the current vertex
        vertexList[index].setVisited(true); // Mark the current vertex as visited
        stack.push(index); // Add the current vertex to the stack

        while (!stack.isEmpty()) {
            int neighbour = checkVertex(stack.peek()); // Find the next unvisited neighbor
            if (neighbour == -1) {
                stack.pop(); // If no unvisited neighbors, backtrack by popping from stack
            } else {
                System.out.println(vertexList[neighbour].getLabel()); // Visit the neighbor
                vertexList[neighbour].setVisited(true); // Mark the neighbor as visited
                stack.push(neighbour); // Add the neighbor to the stack
            }
        }

        // Reset the visited flag for all vertices after the DFS traversal
        for (int i = 0; i < numberVerts; i++) {
            vertexList[i].setVisited(false);
        }
    }

    // Perform Breadth-First Search starting from the given vertex index
    public void passInWidth(int index) {
        System.out.println(vertexList[index].getLabel()); // Visit the current vertex
        vertexList[index].setVisited(true); // Mark the current vertex as visited
        queue.insert(index); // Add the current vertex to the queue
        int vertex;

        while (!queue.isEmpty()) {
            int current = queue.remove(); // Dequeue the front element from the queue
            while ((vertex = checkVertex(current)) != -1) {
                System.out.println(vertexList[vertex].getLabel()); // Visit the neighbor
                vertexList[vertex].setVisited(true); // Mark the neighbor as visited
                queue.insert(vertex); // Enqueue the neighbor
            }
        }

        // Reset the visited flag for all vertices after the BFS traversal
        for (int i = 0; i < numberVerts; i++) {
            vertexList[i].setVisited(false);
        }
    }
}
