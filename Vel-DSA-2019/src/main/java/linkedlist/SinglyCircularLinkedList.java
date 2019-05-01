package linkedlist;

public class SinglyCircularLinkedList<E> {

	public int length;
	private Node<E> head;

	public Boolean add(E data) {
		return addFirst(data);
	}

	public Boolean addFirst(E data) {
		Node<E> newNode = new Node<E>(data, null);
		if (head == null) {
			newNode.next = newNode;
			head = newNode;
		} else {
			Node<E> temp = head;
			// Fetch last node
			while (!temp.next.equals(head)) {
				temp = temp.next;
			}
			newNode.next = head;
			temp.next = newNode;
			// Moving head to newNode
			head = newNode;
		}
		length++;
		return true;
	}

	public E getFirst() {
		if (head == null) {
			throw new RuntimeException("List is Empty!");
		}
		return head.data;
	}

	public Boolean addLast(E data) {
		Node<E> newNode = new Node<E>(data, null);
		if (head == null) {
			newNode.next = newNode;
			head = newNode;
		} else {
			if (head.next.equals(head)) {
				newNode.next = head;
				head.next = newNode;
			} else {
				Node<E> temp = head;
				// Fetch last node
				while (!temp.next.equals(head)) {
					temp = temp.next;
				}
				newNode.next = head;
				temp.next = newNode;
			}
		}
		length++;
		return true;

	}

	public E getLast() {
		if (head == null) {
			throw new RuntimeException("List is empty!");
		}
		Node<E> temp = head;
		while (!temp.next.equals(head)) {
			temp = temp.next;
		}
		return temp.data;
	}

	public Integer size() {
		return length;
	}

	public E removeFirst() {
		if (head == null) {
			throw new RuntimeException("List is empty!");
		}
		Node<E> temp = head;
		while (!temp.next.equals(head)) {
			temp = temp.next;
		}
		E data = head.data;
		temp.next = head.next;
		head = head.next;
		length--;
		return data;
	}

	public E removeLast() {
		if (head == null) {
			throw new RuntimeException("List is empty!");
		}
		Node<E> temp = head;
		Node<E> previous = null;
		while (!temp.next.equals(head)) {
			previous = temp;
			temp = temp.next;
		}
		E data = temp.data;
		previous.next = head;
		temp = null;
		length--;
		return data;
	}

	public E remove() {
		return removeLast();
	}

	public boolean remove(int position) {
		if (head == null) {
			throw new RuntimeException("List is empty!");
		}
		Node<E> temp = head;
		Node<E> previous = null;
		int pos = 0;
		while (pos < position && !temp.next.equals(head)) {
			previous = temp;
			temp = temp.next;
		}
		previous.next = head;

		length--;
		return true;
	}

	class Node<E> {
		E data;
		Node<E> next;

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

		@Override
		public String toString() {
			return "" + data;
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if (head == null) {
			return sb.append("]").toString();
		}
		Node<E> temp = head;
		boolean isFirst = true;
		while (temp.next != head) {
			if (isFirst) {
				sb.append(temp.data);
				isFirst = false;
			} else {
				sb.append(", " + temp.data);
			}
			temp = temp.next;
		}
		if (temp.data != null) {
			sb.append(", " + temp.data);
		}
		return sb.append("]").toString();
	}
}
