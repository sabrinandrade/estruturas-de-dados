package com.graph;

public class Graph {
	
	private Node[] vertex;
	
	public Graph(int size) {
		vertex = new Node[size];
		
		for(int i = 0; i < size; i++)
			vertex[i] = new Node(i);
	}
	
	public void addEdges(int source, int destination, int weight) {
		Edge newEdge = new Edge(new Node(destination), weight);
		
		if(source < 0 || destination > this.vertex.length || source > this.vertex.length || destination < 0) {
			System.err.println("Invalid node number.");
			return;			
		}
		
		for(Edge e : vertex[source].getEdges()) {
			if(e.getDestination().getNumber() == newEdge.getDestination().getNumber()) {
				System.err.println("Edge already exists.");
				return;
			}
		}
		
		vertex[source].getEdges().add(newEdge);
			
	}
	
	public void printGraph() {
		System.out.println("Graph:");
		for(Node v : vertex) {
			System.out.printf("v%d: ", v.getNumber());
			
			for(Edge e : v.getEdges()) 
				System.out.printf("v%d(%d), ", e.getDestination().getNumber(), e.getWeight());
			
			System.out.println();
		}
	}

}
