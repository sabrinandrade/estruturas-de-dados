package com.graph;

import java.util.LinkedList;

public class Node {

	private int number;
	private LinkedList<Edge> edges;
	
	public Node(int number) {
		this.number = number;
		edges = new LinkedList<Edge>();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LinkedList<Edge> getEdges() {
		return edges;
	}
	
}
