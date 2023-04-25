package com.greatleaning.services;

import java.util.Stack;

public class Expression {
	Stack<Character> stack = new Stack<Character>();

	String expression;

	public Expression(String input) {
		expression = input;
	}

	public boolean checkExpression() {
		for (char c : expression.toCharArray()) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char s;
			switch (c) {
			case '}':
				s = stack.pop();
				if (s == '[' || s == '(')
					return false;
				break;

			case ']':
				s = stack.pop();
				if (s == '{' || s == '(')
					return false;
				break;

			case ')':
				s = stack.pop();
				if (s == '[' || s == '{')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}

}
