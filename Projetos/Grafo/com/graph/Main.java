package com.graph;

public class Main {

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		// Duplicated edges
		graph.addEdges(1, 2, 5);
		graph.addEdges(1, 2, 5);
		graph.printGraph();
		
		graph.addEdges(0, 3, 10);
		graph.addEdges(1, 4, 42);
		graph.printGraph();
		
		// Invalid edges
		graph.addEdges(-1, 2, 5);
		graph.addEdges(1, 6, 5);
		graph.addEdges(6, 2, 5);
		graph.addEdges(1, -1, 5);

	}

}
