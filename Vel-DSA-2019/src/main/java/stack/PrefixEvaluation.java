package stack;

import java.text.MessageFormat;
import java.util.Stack;

public class PrefixEvaluation {

	public Integer prefixEvaluation(String prefix) {
		Stack<Integer> s = new Stack<>();
		for (int i = prefix.length() - 1; i >= 0; i--) {
			char c = prefix.charAt(i);
			if (Character.isDigit(c)) {
				s.push(Character.getNumericValue(c));
			} else {
				switch (c) {
				case '+':
					s.push(s.pop() + s.pop());
					break;
				case '-':
					s.push(s.pop() - s.pop());
					break;
				case '*':
					s.push(s.pop() * s.pop());
					break;
				case '/':
					s.push(s.pop() / s.pop());
					break;
				}
			}
		}
		System.out.println(MessageFormat.format("Prefix:{0}, Result:{1}", prefix, s.peek()));
		return s.pop();
	}

}
