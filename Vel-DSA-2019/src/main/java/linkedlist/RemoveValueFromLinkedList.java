package linkedlist;

public class RemoveValueFromLinkedList {

	public Node<Integer> removeAllValues(Node<Integer> head, int data) {
		while (head != null && head.data == data) {
			head = head.next;
		}
		Node<Integer> current = head;
		while (current != null && current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}

	public Node<Integer> removeAllValuesRecursively(Node<Integer> head, int data) {
		if (head == null) {
			return null;
		}
		head.next = removeAllValues(head.next, data);
		return head.data == data ? head.next : head;
	}

}
