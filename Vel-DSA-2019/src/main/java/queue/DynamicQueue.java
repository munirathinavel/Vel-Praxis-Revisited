package queue;

public class DynamicQueue {
	static int MAX = 4;
	int front, rear, size;
	int queue[];
	int capacity;

	public DynamicQueue() {
		this(MAX);
		this.capacity = MAX;
	}

	public DynamicQueue(int capacity) {
		queue = new int[capacity];
		this.capacity = capacity;
		rear = front = size = 0;
	}

	public boolean enqueue(int val) {
		expand();
		queue[rear % capacity] = val;
		rear++;
		size++;
		return true;
	}

	private void expand() {
		if (getSize() == capacity) {
			int newCapacity = capacity << 1;
			int[] newArray = new int[newCapacity];
			System.arraycopy(queue, front, newArray, 0, getSize());
			this.capacity = newCapacity;
			queue = newArray;
		}
	}

	public int getFront() {
		return queue[front];
	}

	public int getRear() {
		return queue[rear - 1];
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty!");
		}
		shrink();
		size--;
		int data = queue[front % capacity];
		front++;
		return data;
	}

	private void shrink() {
		if (getSize() < capacity / 2) {
			int newArray[] = new int[capacity >> 1];
			System.arraycopy(queue, front, newArray, 0, getSize());
			this.capacity = capacity >> 1;
			front = 0;
			rear = rear - size + 1;
			queue = newArray;
		}
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (isEmpty()) {
			return "Queue is empty!";
		}
		for (int i = front; i < rear; i++) {
			sb.append(queue[i] + " ");
		}
		return sb.toString();
	}

}
