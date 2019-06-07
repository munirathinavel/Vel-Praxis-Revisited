package stack;

import java.util.Stack;

public class PrefixToInfixConversion {

	public String convertPrefixToInfix(String infix) {
		Stack<String> s = new Stack<>();
		// Reverse the string
		infix = new StringBuilder(infix).reverse().toString();

		for (char c : infix.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				s.push("" + c);
			} else {
				// (A+B)
				s.push("(" + s.pop() + c + s.pop() + ")");
			}
		}
		return s.pop();
	}

}
