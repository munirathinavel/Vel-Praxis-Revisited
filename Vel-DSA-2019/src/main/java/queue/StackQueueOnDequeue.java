package queue;

import stack.LinkedListStack;
import stack.StackNode;

public class StackQueueOnDequeue {
	int size = 0;
	LinkedListStack<Integer> s1 = new LinkedListStack<>();
	LinkedListStack<Integer> s2 = new LinkedListStack<>();

	public boolean enqueue(int val) {
		s1.push(val);
		size++;
		return true;
	}

	/*
	 * If Stack-2 is empty, move all Stack-1 values into Stack-2 Pop stack 2
	 */
	public int dequeue() {
		if (s1.isEmpty() && s2.isEmpty()) {
			throw new RuntimeException("Queue is empty!");
		}
		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		size--;
		return s2.pop();
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
