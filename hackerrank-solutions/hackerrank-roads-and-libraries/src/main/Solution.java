package main;

import java.util.Scanner;

/** 
 * @author Timdpr
 * 
 * Finds optimum building cost to provide every citizen access to a library
 * as per hackerrank.com/challenges/torque-and-development
 */

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        for (int i=0; i<queries; i++) {
            int nodes = in.nextInt(); // Cities
            int edges = in.nextInt(); // Roads
            long libCost = in.nextLong();
            long roadCost = in.nextLong();

            // If roadCost > libCost, just build libraries in each city!
            if (edges == 0 || (roadCost > libCost)) {
                System.out.println(libCost * nodes);
                for (int j = 0; j<=edges; j++) {
                    in.nextLine();
                }
            } else {
                // Create and populate adjacency list
                AdjacencyList AL = new AdjacencyList(nodes);
                for (int j=0; j<edges; j++) {
                    AL.setEdge(in.nextInt(), in.nextInt());
                }
                // Find and print optimum cost
                System.out.println(DFS(libCost, roadCost, nodes, AL));
            }
        }
        in.close();
    }

    /**
     * Depth first search finds connected components & # of nodes(cities) in them
     * To each component: -1 to find # of edges(roads), * by roadCost and add 1 libCost
     * 
     * @return Optimum road and library building cost
     */
    public static long DFS(long libCost, long roadCost, int nodes, AdjacencyList AL) {
        long total = 0;
        for (int n = 0; n < nodes; n++) {
            if (!AL.isVisited(n)) {
                total += (getNodesInComponent(AL, n)-1) * roadCost;
                total += libCost;
            }
        }
        return total;
    }

    public static int getNodesInComponent(AdjacencyList AL, int currentNode) {
        int count = 1;
        AL.setVisited(currentNode);
        for (int i : AL.getNode(currentNode)) {
            if (!AL.isVisited(i)) {
                count += getNodesInComponent(AL, i);
            }
        }
        return count;
    }
}
