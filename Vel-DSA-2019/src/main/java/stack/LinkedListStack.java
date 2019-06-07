package stack;

public class LinkedListStack<E> {

	public StackNode<E> top = null;
	int size = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean push(E val) {
		StackNode<E> node = new StackNode<>(val);
		node.next = top;
		top = node;
		size++;
		return true;
	}

	public E pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		E val = top.val;
		top = top.next;
		size--;
		return val;
	}

	public E peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		return top.val;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		StackNode<E> temp = top;
		while (temp.next != null) {
			s.append(temp.val).append(" ");
			temp = temp.next;
		}
		if (temp != null) {
			s.append(temp.val).append(" ");
		}
		return s.toString();
	}
}
