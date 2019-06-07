package stack;

import java.util.Stack;

public class PostfixToPrefixConversion {
	public String convertPostfixToPrefix(String postfix) {
		Stack<String> s = new Stack<>();
		for (char c : postfix.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				s.push(String.valueOf(c));
			} else {
				String op1 = s.pop(); // B
				String op2 = s.pop(); // A
				s.push(c + op2 + op1); // +AB
			}
		}
		return s.pop();
	}
}
