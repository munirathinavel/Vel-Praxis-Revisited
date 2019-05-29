package stack;

public class StackNode {
	int val;
	StackNode next;

	public StackNode(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return String.valueOf(this.val);
	}

}
