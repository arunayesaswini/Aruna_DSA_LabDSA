package com.greatleaning.services;

import java.util.ArrayList;

public class SumPair {

	public SumPair() {

	}

	public void findPair(int sum, ArrayList<Integer> numberList) {
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
