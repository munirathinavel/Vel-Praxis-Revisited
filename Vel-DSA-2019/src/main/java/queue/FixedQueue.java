package queue;

public class FixedQueue {
	static int MAX = 10;
	int size = 0;
	int front = 0;
	int rear = 0;
	int array[];
	int capacity;

	FixedQueue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
	}

	FixedQueue() {
		this(MAX);
		this.capacity = MAX;
	}

	public boolean enqueue(int val) {
		if (isFull()) {
			throw new RuntimeException("Queue is full!");
		}
		if (isEmpty()) {
			array[rear] = val;
		} else {
			array[++rear] = val;
		}
		size++;
		return true;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty!");
		}
		size--;
		return array[front++];
	}

	public int getFront() {
		return array[front];
	}

	public int getRear() {
		return array[rear];
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return this.capacity == size;
	}

}
