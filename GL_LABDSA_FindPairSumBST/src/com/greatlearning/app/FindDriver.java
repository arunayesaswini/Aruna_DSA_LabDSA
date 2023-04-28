package com.greatlearning.app;


import java.util.Scanner;
import com.greatleaning.services.SumPair;

public class FindDriver {

	public static void main(String[] args) {

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
				sum_pair.insert(value);
			}

			

			System.out.println("Enter Sum to Search");
			int sum = sc.nextInt();
			sum_pair.findPair(sum);
		}
	}

}
