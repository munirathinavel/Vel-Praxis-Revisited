package stack;

import queue.LinkedListQueue;

public class QueueStackSlowPush {
	LinkedListQueue q1 = new LinkedListQueue();
	LinkedListQueue q2 = new LinkedListQueue();
	int size = 0;

	public boolean push(int val) {
		// Push new element to q2 [4]
		q2.enqueue(val);

		// Move all elements from q1 to q2 [1,2,3,4] such that front is newly added
		// element
		while (!q1.isEmpty()) {
			q2.enqueue(q1.dequeue());
		}
		size++;

		// Swap the queue so that we can pop newly added element
		LinkedListQueue q = q1;
		q1 = q2;
		q2 = q;

		return true;
	}

	public int pop() {
		if (q1.isEmpty()) {
			throw new RuntimeException("Stack is Empty!");
		}
		size--;
		return q1.dequeue();
	}

	public int peek() {
		if (q1.isEmpty()) {
			throw new RuntimeException("Stack is Empty!");
		}
		return q1.getFront();
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
