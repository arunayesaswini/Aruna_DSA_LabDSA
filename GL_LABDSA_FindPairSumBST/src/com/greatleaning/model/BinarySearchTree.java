package com.greatleaning.model;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> numbers = new ArrayList<Integer>();

	static Node root = null;

	public BinarySearchTree() {
	}

	public void insert(int key) {
		int value = key;
		// creating new node
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
		} else
			insertNode(root, newNode);

	}

	// inserting the nodes into Binary Search tree
	public void insertNode(Node root, Node newNode) {

		if (newNode.data < root.data) {
			if (root.left == null)
				root.left = newNode;
			else
				insertNode(root.left, newNode);

		} else if (newNode.data > root.data) {
			if (root.right == null)
				root.right = newNode;
			else
				insertNode(root.right, newNode);

		} else {
			System.out.println("Number already exists....\n Enter new Number");
			int newValue = sc.nextInt();
			insert(newValue);

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
		inOrder(root);
		return numbers;
	}

}
