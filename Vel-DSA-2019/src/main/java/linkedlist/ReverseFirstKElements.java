package linkedlist;

public class ReverseFirstKElements<E> {

	public Node<Integer> reverFirstKElements(Node<Integer> head, int k) {
		if (head == null || head.next == null || k <= 0) {
			return head;
		}
		// Take first k elements from list
		int position = 0;
		Node<Integer> temp = head;
		Node<Integer> prev = head;
		while (position < k) {
			prev = temp;
			temp = temp.next;
			position++;
		}
		// Seperate first list
		prev.next = null;
		// create second list from k+1th element
		Node<Integer> second = temp;

		// Reverse it
		head = reverse(head);
		// Add it back to Original list
		position = 0;
		temp = head;
		while (position < k - 1) {
			temp = temp.next;
			position++;
		}
		temp.next = second;

		return head;
	}

	private Node<Integer> reverse(Node<Integer> head) {
		if (head.next == null) {
			return head;
		}

		Node<Integer> prev = null;
		Node<Integer> current = head;
		Node<Integer> next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;

		return head;
	}

}
