package stack;

public class StackNode<E> {
	public E val;
	public StackNode<E> next;

	public StackNode(E val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return String.valueOf(this.val);
	}

}
