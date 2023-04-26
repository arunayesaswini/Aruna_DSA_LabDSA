package com.greatlearning.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.greatleaning.model.BinarySearchTree;
import com.greatleaning.services.SumPair;

public class FindDriver {

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();

		BinarySearchTree bst = new BinarySearchTree();
		SumPair sum_pair = new SumPair();

		int value;
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("How many numbers you want to Enter?");
			int size = sc.nextInt();

			for (int i = 1; i <= size; i++) {
				System.out.println("Enter Numbers:");
				value = sc.nextInt();
				if (value < 0) {
					System.out.println("Enter only positive numbers");
					value = sc.nextInt();
				}
				bst.insert(value);
			}

			System.out.println("Numbers entered are:");
			alist = bst.getList();
			System.out.println(alist);

			System.out.println("Enter Sum to Search");
			int sum = sc.nextInt();
			sum_pair.findPair(sum, alist);
		}
	}

}
