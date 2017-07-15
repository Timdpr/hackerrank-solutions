package main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdjacencyList {
    /** 
     * Stores adjacency list for each vertex 
     */
    private Map<Integer, List<Integer>> adjacencyList;
    private boolean[] visitedList;

    public AdjacencyList(int numberOfNodes) {
        // Create empty adjacency list
        this.adjacencyList = new HashMap<Integer, List<Integer>>();
        for (int i=0; i<numberOfNodes; i++) {
            this.adjacencyList.put(i, new LinkedList<Integer>());
        }
        // Create boolean list to record whether node visited, initially false
        this.visitedList = new boolean[numberOfNodes];
    }

    /**
     * Adds the corresponding destination nodes to nodes in adjacency list.
     * Creates an undirected graph and zero-indexes the nodes (input is 1-indexed)
     */
    public void setEdge(int source, int destination) {
        this.adjacencyList.get(source-1).add(destination-1);
        this.adjacencyList.get(destination-1).add(source-1);
    }

    public List<Integer> getNode(int source) {
        return this.adjacencyList.get(source);
    }

    public void setVisited(int edge) {
        this.visitedList[edge] = true;
    }

    public boolean isVisited(int edge) {
        return this.visitedList[edge];
    }
}
