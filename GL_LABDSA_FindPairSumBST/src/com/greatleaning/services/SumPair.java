package com.greatleaning.services;

import java.util.ArrayList;

import com.greatleaning.model.BinarySearchTree;

public class SumPair {
	BinarySearchTree bst = new BinarySearchTree();
	ArrayList<Integer> numberList = new ArrayList<Integer>();

	int sum;

	public SumPair(int sum, ArrayList<Integer> numberList) {
		this.sum = sum;
		this.numberList = numberList;
	}

	public void findPair() {
		int flag = 0;
		for (int i = 0; i < numberList.size(); i++) {
			int num1 = numberList.get(i);
			int num2 = sum - num1;
			if (numberList.contains(num2)) {
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
