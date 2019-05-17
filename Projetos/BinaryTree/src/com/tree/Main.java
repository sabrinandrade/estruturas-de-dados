package com.tree;

public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.addNode(Character.valueOf('c'));
		tree.addNode(Character.valueOf('b'));
		tree.addNode(Character.valueOf('d'));

		tree.print();

		tree.addNode(Character.valueOf('e'));
		tree.addNode(Character.valueOf('g'));
		tree.addNode(Character.valueOf('a'));

		tree.print();

		tree.remove(Character.valueOf('c'));

		tree.print();

		tree.remove(Character.valueOf('g'));

		tree.print();

	}

}
