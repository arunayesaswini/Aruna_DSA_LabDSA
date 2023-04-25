package com.greatleaning.model;

import java.util.ArrayList;

public class BinarySearchTree {
	ArrayList<Integer> numbers = new ArrayList<Integer>();

	// inserting the nodes into Binary Search tree
	public void insertNode(Node root, Node newNode) {

		if (newNode.data < root.data) {
			if (root.left == null)
				root.left = newNode;
			else
				insertNode(root.left, newNode);

		} else {
			if (root.right == null)
				root.right = newNode;
			else
				insertNode(root.right, newNode);

		}
	}

	// in order traversal

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			numbers.add(root.data);
			inOrder(root.right);
		}

	}

	public ArrayList<Integer> getList() {
		return numbers;
	}

}
