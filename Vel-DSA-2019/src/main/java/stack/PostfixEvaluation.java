package stack;

/**
 * <P>
 * This class is used to calculate total for a given Postfix Expression
 * </P>
 * 
 * @author m.chinnasamy
 *
 */
public class PostfixEvaluation {

	public int convertInfixToPostfix(String postfix) {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		int right;
		int left;
		for (char c : postfix.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(Character.getNumericValue(c));
			} else {
				right = stack.pop();
				left = stack.pop();
				switch (c) {
				case '+':
					stack.push(left + right);
					break;
				case '-':
					stack.push(left - right);
					break;
				case '*':
					stack.push(left * right);
					break;
				case '/':
					stack.push(left / right);
					break;
				}
			}
		}
		return stack.pop();
	}

}
