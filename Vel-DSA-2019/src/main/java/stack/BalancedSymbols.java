package stack;

enum Symbols {
	OPEN_PARANTHESIS('('), OPEN_BRACE('{'), OPEN_SQ_BRACKET('['), CLOSE_PARANTHESIS(')'), CLOSE_BRACE('}'),
	CLOSE_SQ_BRACKET(']');

	private char symbol;

	public char getSymbol() {
		return symbol;
	}

	private Symbols(char symbol) {
		this.symbol = symbol;
	}

}

public class BalancedSymbols {

	public boolean isBalancedSymbols(char[] charArray) {
		LinkedListStack<Character> stack = new LinkedListStack<Character>();

		for (Character c : charArray) {
			// Push symbols into the stack
			if (Symbols.OPEN_BRACE.getSymbol() == c || Symbols.OPEN_PARANTHESIS.getSymbol() == c
					|| Symbols.OPEN_SQ_BRACKET.getSymbol() == c) {
				stack.push(c);
				// When close symbols arrive, check if it's counterpart is at the top of the
				// stack
			} else if (Symbols.CLOSE_BRACE.getSymbol() == c) {
				if (!stack.isEmpty() && stack.peek() == Symbols.OPEN_BRACE.getSymbol()) {
					stack.pop();
				} else {
					return false;
				}
			} else if (Symbols.CLOSE_PARANTHESIS.getSymbol() == c) {
				if (!stack.isEmpty() && stack.peek() == Symbols.OPEN_PARANTHESIS.getSymbol()) {
					stack.pop();
				} else {
					return false;
				}
			} else if (Symbols.CLOSE_SQ_BRACKET.getSymbol() == c) {
				if (!stack.isEmpty() && stack.peek() == Symbols.OPEN_SQ_BRACKET.getSymbol()) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
