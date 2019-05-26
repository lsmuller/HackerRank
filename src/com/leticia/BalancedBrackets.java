package com.leticia;

import java.util.*;

public class BalancedBrackets {

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();
		char[] c = expression.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ')' || c[i] == ']' || c[i] == '}') {
				if (stack.isEmpty() || getClosingBracket(stack.peek()) != c[i]) {
					return false;
				}
				else {
					stack.pop();
				}
			}
			else {
				stack.push(c[i]);
			}
		}
		return stack.isEmpty();
	}

	private static char getClosingBracket(char c) {
		switch (c) {
		case '(':
			return ')';
		case '[':
			return ']';
		case '{':
			return '}';
		default:
			return '!'; //error
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}
}
