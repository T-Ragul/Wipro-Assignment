/*Implement an undirected graph in Java with the following functionalities:
Graph Class: Create a Graph class that supports:
Adding vertices and edges.
Removing vertices and edges.
Checking if vertices and edges exist.
Performing graph traversal algorithms like Depth-First Search (DFS) or Breadth-First Search (BFS).*/

import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }
    public void addEdge(int vertex1, int vertex2) {
        adjList.putIfAbsent(vertex1, new ArrayList<>());
        adjList.putIfAbsent(vertex2, new ArrayList<>());
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
    }
    public void removeVertex(int vertex) {
        if (!adjList.containsKey(vertex)) return;

        for (int neighbor : adjList.get(vertex)) {
            adjList.get(neighbor).remove((Integer) vertex);
        }
        adjList.remove(vertex);
    }
    public void removeEdge(int vertex1, int vertex2) {
        if (!adjList.containsKey(vertex1) || !adjList.containsKey(vertex2)) return;

        adjList.get(vertex1).remove((Integer) vertex2);
        adjList.get(vertex2).remove((Integer) vertex1);
    }
    public boolean hasVertex(int vertex) {
        return adjList.containsKey(vertex);
    }

   
    public boolean hasEdge(int vertex1, int vertex2) {
        if (!adjList.containsKey(vertex1)) return false;
        return adjList.get(vertex1).contains(vertex2);
    }

    public List<Integer> bfs(int startVertex) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            result.add(vertex);

            for (int neighbor : adjList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return result;
    }

    public void printGraph() {
        for (int vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            for (int neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);
        graph.addEdge(5, 3);
        graph.addEdge(4, 3);
        System.out.println("Graph Adding Vertex and Edges:");
        graph.printGraph();
        System.out.println("BFS starting from vertex 1:");
        List<Integer> bfsResult = graph.bfs(1);
        for (int vertex : bfsResult) {
            System.out.print(vertex + " ");
        }
        System.out.println();
        System.out.println("Removing edge 1-3");
        graph.removeEdge(1, 3);
        graph.printGraph();
        System.out.println("Removing vertex 2");
        graph.removeVertex(2);
        graph.printGraph();
        System.out.println("Check vertex 2 exists: " + graph.hasVertex(2));
        System.out.println("Checking edge 1,2 exists: " + graph.hasEdge(1, 2));    
    }
}

/*Output:
Graph Adding Vertex and Edges:
1 -> 2 3 
2 -> 1 3 
3 -> 2 1 5 4 
4 -> 3 
5 -> 3 
BFS starting from vertex 1:
1 2 3 5 4 
Removing edge 1-3
1 -> 2 
2 -> 1 3 
3 -> 2 5 4 
4 -> 3 
5 -> 3 
Removing vertex 2
1 -> 
3 -> 5 4 
4 -> 3 
5 -> 3 
Check vertex 2 exists: false
Checking edge 1,2 exists: false
*/
