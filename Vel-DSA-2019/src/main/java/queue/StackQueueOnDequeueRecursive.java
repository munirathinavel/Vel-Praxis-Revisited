package queue;

import stack.LinkedListStack;
import stack.StackNode;

public class StackQueueOnDequeueRecursive {
	LinkedListStack<Integer> s1 = new LinkedListStack<Integer>();

	public boolean enqueue(int val) {
		s1.push(val);
		return true;
	}

	public Integer dequeue() {
		if (s1.isEmpty()) {
			throw new RuntimeException("Queue is Empty!");
		} else if (s1.getSize() == 1) {
			return s1.pop();
		} else {
			int val = s1.pop();
			int res = dequeue();
			s1.push(val);
			return res;
		}
	}

	@Override
	public String toString() {
		StackNode<Integer> temp = s1.top;
		StringBuilder sb = new StringBuilder();
		if (s1.isEmpty()) {
			return "Queue is Empty!";
		}
		while (temp != null) {
			sb.append(temp.val + " ");
			temp = temp.next;
		}
		return sb.toString();
	}
}
