package searching;

public class SubListSearch {

	public boolean isSubList(Node first, Node second) {
		Node head = first;
		if (first == null || second == null) {
			return false;
		}
		boolean isSubList = false;
		while (second != null) {
			if (isSubList && first == null) {
				return true;
			}
			if (first.data == second.data) {
				isSubList = true;
				first = first.next;
			} else {
				isSubList = false;
				first = head;
			}
			second = second.next;
		}

		return isSubList;
	}

}

class Node {
	int data;
	Node next;

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}