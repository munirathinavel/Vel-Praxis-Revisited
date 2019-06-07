package stack;

import queue.LinkedListQueue;

public class QueueStack {
	LinkedListQueue q1 = new LinkedListQueue();
	LinkedListQueue q2 = new LinkedListQueue();
	int size = 0;

	public boolean push(int val) {
		q1.enqueue(val);
		size++;
		return true;
	}

	public int pop() {
		if (q1.isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		// Move all elements from q1 to q2 except front
		if (q2.isEmpty()) {
			while (q1.getSize() > 1) {
				q2.enqueue(q1.dequeue());
			}
		}
		size--;
		int data = q1.dequeue();

		// Swap the queues
		LinkedListQueue q = q1;
		q1 = q2;
		q2 = q;
		return data;
	}

	public int peek() {
		if (q1.isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		// Move all elements from q1 to q2 except front
		while (q1.getSize() > 1) {
			q2.enqueue(q1.dequeue());
		}
		int data = q1.dequeue(); // top
		// Push last element to q2
		q2.enqueue(data);

		// Swap the queues
		LinkedListQueue q = q1;
		q1 = q2;
		q2 = q;
		return data;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
