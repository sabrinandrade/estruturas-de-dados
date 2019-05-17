package com.tree;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		this.root = null;
	}

	public void addNode(Character value) {
		if(this.root != (null))
			addNode(new Node(value), this.root);
		else
			this.root = new Node(value);
	}

	private void addNode(Node newNode, Node root) {
		if(newNode.getValue() < root.getValue()) {
			if(root.getLeft() == null)
				root.setLeft(newNode);
			else
				addNode(newNode, root.getLeft());

		} else if (newNode.getValue() > root.getValue()){
			if(root.getRight() == null)
				root.setRight(newNode);
			else
				addNode(newNode, root.getRight());
		}

	}

	public void remove(Character value) {
		this.root = remove(this.root, value);
	}

	private Node remove(Node node, Character key) {
		if(node == null)
			return node;
		
		// SEARCH
		if(node.getValue() > key)       
			node.setLeft(remove(node.getLeft(), key));
		else if(node.getValue() < key)
			node.setRight(remove(node.getRight(), key));

		// REMOVE
		else {          
			if(node.getRight() == null)
				node = node.getLeft();
			else if(node.getLeft() == null)
				node = node.getRight();
			else { 
				Node temp = findMinFromRight(node.getRight());
				node.setValue(temp.getValue());				
				node.setRight(remove(node.getRight(), temp.getValue()));

			}
		}

		return node;
	}

	private Node findMinFromRight(Node node) {
		while(node.getLeft() != null)
			node = node.getLeft();

		return node;

	}

//	private Node findMinFromLeft(Node node) {
//		while(node.getRight() != null)
//			node = node.getRight();
//
//		return node;
//
//	}

	public void print() {
		printRED(this.root);
//		printERD(this.root);
//		printEDR(this.root);
		System.out.println("\n--");
	}

	private void printRED(Node root) {
		if(root != null ) {
			System.out.print(root.getValue() + " ");
			printRED(root.getLeft());
			printRED(root.getRight());
		}
	}

//	private void printERD(Node root) {
//		if(root != null ) {
//			printERD(root.getLeft());
//			System.out.print(root.getValue() + " ");
//			printERD(root.getRight());
//		}
//	}

//	private void printEDR(Node root) {
//		if(root != null ) {
//			printEDR(root.getLeft());
//			printEDR(root.getRight());
//			System.out.print(root.getValue() + " ");
//		}
//	}

}