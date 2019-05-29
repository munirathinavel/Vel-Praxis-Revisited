package stack;

public class FixedArrayStack {
	int MAX_SIZE = 100;
	int a[];
	int top;

	public FixedArrayStack() {
		top = -1;
		a = new int[MAX_SIZE];
	}

	public FixedArrayStack(int size) {
		MAX_SIZE = size;
		top = -1;
		a = new int[MAX_SIZE];
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public boolean push(int val) {
		if (top >= MAX_SIZE) {
			throw new RuntimeException("Stack is full!");
		}
		a[++top] = val;
		return true;
	}

	public int pop() {
		if (top < 0) {
			throw new RuntimeException("Stack is empty!");
		}
		int val = a[top--];
		return val;
	}

	public int peek() {
		if (top < 0) {
			throw new RuntimeException("Stack is empty!");
		}
		return a[top];
	}
}
