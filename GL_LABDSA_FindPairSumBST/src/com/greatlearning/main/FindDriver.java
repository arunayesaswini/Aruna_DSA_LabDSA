package com.greatlearning.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.greatleaning.model.BinarySearchTree;
import com.greatleaning.model.Node;
import com.greatleaning.services.SumPair;

public class FindDriver {

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();

		BinarySearchTree bst = new BinarySearchTree();
		SumPair sum_pair;

		Node root = null;
		Node newNode = null;

		int value;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of nodes");
			int size = sc.nextInt();
			int i;
			for (i = 1; i <= size; i++) {
				System.out.println("Enter Data for the node");
				value = sc.nextInt();
				newNode = new Node(value);
				if (root == null) {
					root = newNode;
				} else
					bst.insertNode(root, newNode);
			}

			bst.inOrder(root);
			System.out.println("numbers in binary search tree");
			alist = bst.getList();
			System.out.println(alist);

			System.out.println("Enter Sum to Search");
			int sum = sc.nextInt();
			sum_pair = new SumPair(sum, alist);
			sum_pair.findPair();
		}
	}

}
