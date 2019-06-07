package stack;

import java.util.Stack;

public class PrefixToPostfixConversion {

	public String convertPrefixToPostfix(String prefix) {
		Stack<String> s = new Stack<>();
		prefix = new StringBuilder(prefix).reverse().toString();
		for (char c : prefix.toCharArray()) {
			if (isLetterOrDigit(c)) {
				s.push("" + c);
			} else {
				s.push(s.pop() + s.pop() + c);
			}
		}
		return s.pop();
	}

	private boolean isLetterOrDigit(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
	}
}
