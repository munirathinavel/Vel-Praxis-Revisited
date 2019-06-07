package stack;

import java.util.Stack;

public class PostfixToInfixConversion {

	public String convertPostfixToInfix(String postfix) {
		Stack<String> s = new Stack<>();
		for (char c : postfix.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				s.push(String.valueOf(c));
			} else {
				String op1 = s.pop(); // B
				String op2 = s.pop(); // A
				// (A+B)
				s.push("(" + op2 + c + op1 + ")");
			}
		}
		return s.pop();
	}

}
