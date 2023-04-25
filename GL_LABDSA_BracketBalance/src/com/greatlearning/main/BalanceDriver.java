package com.greatlearning.main;
import java.util.Scanner;
import com.greatleaning.services.Expression;

public class BalanceDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the Brackets String");
		String brackets=sc.next();
		
		Expression expression=new Expression(brackets);
		if(expression.checkExpression())
			System.out.println("Entered String contains Balanced Brackets");
		else
			System.out.println("Entered String does not contain Balanced Brackets");
		
		sc.close();

	}

}
