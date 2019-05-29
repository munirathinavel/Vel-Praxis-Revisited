package stack;

public class LinkedListStack {

	StackNode top = null;
	int size = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean push(int val) {
		StackNode node = new StackNode(val);
		node.next = top;
		top = node;
		size++;
		return true;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		int val = top.val;
		top = top.next;
		size--;
		return val;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		return top.val;
	}
}
