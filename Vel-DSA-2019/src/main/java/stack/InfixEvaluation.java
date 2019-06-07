package stack;

import java.text.MessageFormat;
import java.util.Stack;

/**
 * <P>
 * This class is used to calculate total for a given Infix Expression
 * </P>
 * 
 * @author m.chinnasamy
 *
 */
public class InfixEvaluation {

	public Integer evaluateInfix(String infix) {
		Stack<Character> operator = new Stack<Character>();
		Stack<Integer> digits = new Stack<Integer>();

		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);
			if (Character.isDigit(c)) {
				StringBuilder sb = new StringBuilder();
				while (i < infix.length() && Character.isDigit(infix.charAt(i))) {
					sb.append(infix.charAt(i++));
				}
				i--;
				digits.push(Integer.parseInt(sb.toString()));
			} else if ('(' == c) {
				operator.push(c);
			} else if (')' == c) {
				while (!operator.isEmpty() && operator.peek() != '(') {
					evaluateAndPushToStack(digits, operator.pop());
				}

				if (!operator.isEmpty() && operator.peek() != '(') {
					return -1;
				} else {
					operator.pop();
				}
			} else {
				while (!operator.isEmpty() && getPrecedence(c) <= getPrecedence(operator.peek())) {
					evaluateAndPushToStack(digits, operator.pop());
				}
				operator.push(c);
			}
		}

		while (!operator.isEmpty()) {
			evaluateAndPushToStack(digits, operator.pop());
		}
		System.out.println(MessageFormat.format("Prefix:{0}, result:{1}", infix, digits.peek()));
		return digits.pop();
	}

	public boolean isLetterOrDigit(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
	}

	private void evaluateAndPushToStack(Stack<Integer> digits, char c) {
		int right = digits.pop();
		int left = digits.pop();
		// Calculate & evaluate current operator
		switch (c) {
		case '+':
			digits.push(left + right);
			break;
		case '-':
			digits.push(left - right);
			break;
		case '*':
			digits.push(left * right);
			break;
		case '/':
			digits.push(left / right);
			break;
		}
	}

	public int getPrecedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		}
		return -1;
	}

}
