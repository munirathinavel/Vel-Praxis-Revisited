package stack;

import java.util.Stack;

public class InfixToPrefixConversion {

	public String convertInfixToPrefix(String infix) {
		StringBuilder prefix = new StringBuilder();
		Stack<Character> s = new Stack<Character>();
		// Reverse the string
		infix = new StringBuilder(infix).reverse().toString();
		if (infix.contains("(") && infix.contains(")")) {
			infix = infix.replace(")", "$");
			infix = infix.replace("(", ")");
			infix = infix.replace("$", "(");
		}

		for (char c : infix.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				prefix.append(c);
			} else if (c == '(') {
				s.push(c);
			} else if (c == ')') {
				while (!s.isEmpty() && s.peek() != '(') {
					prefix.append(s.pop());
				}

				if (!s.isEmpty() && s.peek() != '(') {
					return "Invalid Expression";
				} else {
					s.pop();
				}
			} else {
				while (!s.isEmpty() && getPrecedence(c) < getPrecedence(s.peek())) {
					prefix.append(s.pop());
				}
				s.push(c);
			}
		}

		while (!s.isEmpty()) {
			if (s.peek() == '(') {
				return "Invalid Expression";
			}
			prefix.append(s.pop());
		}
		return prefix.reverse().toString();
	}

	public int getPrecedence(char c) {
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
