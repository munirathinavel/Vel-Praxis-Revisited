package stack;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class InfixToPostfix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		StringBuilder out = new StringBuilder();
		Stack<Character> stack;
		while (t > 0) {
			String line = s.next();
			stack = new Stack<Character>();

			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (Character.isLetterOrDigit(c)) {
					out.append(c);
				} else if ('(' == c) {
					stack.push(c);
				} else if (')' == c) {
					while (!stack.isEmpty() && stack.peek() != '(') {
						out.append(stack.pop());
					}

					if (!stack.isEmpty() && stack.peek() != '(') {
						System.out.println("Invalid Expression");
						break;
					} else {
						stack.pop();
					}
				} else {
					while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
						out.append(stack.pop());
					}
					stack.push(c);
				}
			}

			while (!stack.isEmpty()) {
				if (stack.peek() == '(') {
					System.out.println("Invalid Expression");
					continue;
				}
				out.append(stack.pop());
			}

			System.out.println(out.toString());
			t--;
		}
	}

	public static int getPrecedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
}