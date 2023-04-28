package com.greatleaning.services;

import java.util.ArrayList;

import com.greatleaning.model.BinarySearchTree;

public class SumPair {

	BinarySearchTree bst = new BinarySearchTree();

	public void insert(int value) {
		bst.insert(value);
	}

	public void findPair(int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = bst.getList();
		System.out.println("Numbers Entered are: " + list);

		int flag = 0;
		for (int i = 0; i < list.size(); i++) {
			int num1 = list.get(i);
			int num2 = sum - num1;
			if (list.contains(num2)) {
				System.out.println("Found the Pair");
				System.out.println("sum(" + num1 + "," + num2 + ")");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Pair not found in given numbers");
	}

}
