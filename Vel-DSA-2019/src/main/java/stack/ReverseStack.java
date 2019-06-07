package stack;

public class ReverseStack {

	/**
	 * Reverse the stack with recursion
	 * 
	 * @param stack
	 */
	public void reverseStackRecursion(LinkedListStack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		Integer data = stack.pop();
		reverseStackRecursion(stack);
		insertAtBottom(stack, data);

	}

	/**
	 * Insert current value to the top of the stack with recursion
	 * 
	 * @param stack
	 * @param data
	 */
	private void insertAtBottom(LinkedListStack<Integer> stack, Integer data) {
		if (stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, data);
		stack.push(temp);

	}

	public void reverseStack(LinkedListStack<Integer> stack) {
		StackNode<Integer> current = stack.top;
		StackNode<Integer> prev = null;
		StackNode<Integer> next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		stack.top = prev;
	}
}
