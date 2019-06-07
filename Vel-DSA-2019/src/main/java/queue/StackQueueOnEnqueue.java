package queue;

import stack.LinkedListStack;
import stack.StackNode;

public class StackQueueOnEnqueue {
	LinkedListStack<Integer> s1 = new LinkedListStack<Integer>();
	LinkedListStack<Integer> s2 = new LinkedListStack<Integer>();
	int size = 0;

	public boolean enqueue(int val) {

		// Move s1 to S2 until s1 is empty S1 - [3,2,1], S2 - []
		// After move S1 - [], S2 - [1,2,3]
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		// Push new value to S1
		// S1 - [4], S2 - [1,2,3]
		s1.push(val);

		// Push S2 to S1 again
		// S1 - [1,2,3,4], S2 - []
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		size++;
		return true;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty!");
		}
		size--;
		return s1.pop();
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		StackNode<Integer> temp = s1.top;
		StringBuilder sb = new StringBuilder();
		if (isEmpty()) {
			return "Queue is Empty!";
		}
		while (temp != null) {
			sb.append(temp.val + " ");
			temp = temp.next;
		}
		return sb.toString();
	}

}
