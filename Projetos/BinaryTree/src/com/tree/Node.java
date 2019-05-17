package com.tree;

public class Node {
	
	private Character value;
	private Node left, right;
	
	public Node(Character value) {
		this.value = value;
		this.left = this.right = null;
	}

	public Character getValue() {
		return value;
	}

	public void setValue(Character value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
