package queue;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class LinkedListQueue {

	Node front;
	Node rear;
	int size;

	public LinkedListQueue() {
		front = rear = null;
		size = 0;
	}

	public boolean enqueue(int data) {
		Node newNode = new Node(data);
		if (front == null && rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
		return true;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty!");
		}
		int data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		return data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getFront() {
		return front.data;
	}

	public int getRear() {
		return rear.data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = front;
		if (isEmpty()) {
			return "Queue is Empty!";
		}
		while (temp != rear) {
			sb.append(temp.data + " ");
			temp = temp.next;
		}
		if (temp != null) {
			sb.append(temp.data);
		}
		return sb.toString();
	}

	public int getSize() {
		return size;
	}
}
