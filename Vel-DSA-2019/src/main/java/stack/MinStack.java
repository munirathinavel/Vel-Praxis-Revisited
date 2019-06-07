package stack;

public class MinStack {
	MinNode top = null;
	int size = 0;

	public Integer getMin() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty!");
		}
		return top.min;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean push(int val) {
		MinNode node = new MinNode(val);
		node.next = top;
		if (top == null) {
			node.min = val;
		} else {
			node.min = top.min > val ? val : top.min;
		}
		top = node;
		size++;
		return true;
	}

	public Integer pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty!");
		}
		int val = top.val;
		top = top.next;
		size--;
		return val;
	}

	public Integer peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty!");
		}
		return top.val;
	}

	class MinNode {
		int val;
		int min;
		MinNode next;

		public MinNode(int val) {
			this.val = val;
		}
	}

}
