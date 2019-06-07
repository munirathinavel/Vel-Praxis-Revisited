package stack;

public class SortStack {

	public LinkedListStack<Integer> sortStack(LinkedListStack<Integer> stack) {
		LinkedListStack<Integer> sortedStack = new LinkedListStack<Integer>();

		while (!stack.isEmpty()) {
			int temp = stack.pop();
			while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
				stack.push(sortedStack.pop());
			}
			sortedStack.push(temp);
		}
		return sortedStack;
	}

	public void sortStackRecursion(LinkedListStack<Integer> stack) {
		if (!stack.isEmpty()) {
			int temp = stack.pop();
			sortStackRecursion(stack);
			insertToSortedStack(stack, temp);
		}
	}

	public void insertToSortedStack(LinkedListStack<Integer> stack, int val) {
		if (stack.isEmpty() || stack.peek() < val) {
			stack.push(val);
		} else {
			int temp = stack.pop();
			insertToSortedStack(stack, val);
			stack.push(temp);
		}
	}

}
