/**
 * 
 */
package stack;

/**
 * @author m.chinnasamy
 *
 */
public class InfixToPostfixConversion {

	public String convertInfixToPostfix(String infixString) {
		StringBuilder postfixString = new StringBuilder();
		LinkedListStack<Character> stack = new LinkedListStack<Character>();
		for (char c : infixString.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				postfixString.append(c);
			} else if ('(' == c) {
				stack.push(c);
			} else if (')' == c) {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfixString.append(stack.pop());
				}
				if (!stack.isEmpty() && stack.peek() != '(') {
					return "Invalid Expression!";
				} else {
					stack.pop();
				}
			} else {
				while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(c)) {
					postfixString.append(stack.pop());
				}
				stack.push(c);
			}
		}

		while (!stack.isEmpty()) {
			postfixString.append(stack.pop());
		}
		return postfixString.toString();
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
