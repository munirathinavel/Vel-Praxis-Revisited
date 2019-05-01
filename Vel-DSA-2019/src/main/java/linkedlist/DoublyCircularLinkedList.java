package linkedlist;

import linkedlist.DoublyLinkedList.Node;

/**
 * This class is used to implement Doubly Circular Linked List
 * 
 * @author m.chinnasamy
 *
 * @param <E>
 */
public class DoublyCircularLinkedList<E> {

	class Node<E> {
		E data;
		Node<E> prev;
		Node<E> next;

		public Node(E data, Node<E> prev, Node<E> next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

		@Override
		public String toString() {
			return "" + data;
		}
	}

	Node<E> first;
	Node<E> last;
	int length;

	public boolean addFirst(E data) {
		Node<E> newNode = new Node<E>(data, null, null);
		if (first == null || last == null) {
			first = last = newNode;
		} else {
			first.prev = newNode;
			newNode.next = first;
			first = newNode;
		}
		length++;
		return true;
	}

	public boolean add(E data) {
		return addLast(data);
	}

	public boolean add(E data, int position) {
		Node<E> newNode = new Node<E>(data, null, null);
		if (first == null || last == null) {
			first = last = newNode;
		} else if (position == 0) {
			first.prev = newNode;
			newNode.next = first;
			first = newNode;
		} else {
			Node<E> temp = first;
			Node<E> prev = null;
			int pos = 0;
			while (pos < position && temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			newNode.next = temp;
			newNode.prev = prev;
			temp.prev = newNode;
			prev.next = newNode;
		}
		length++;
		return true;
	}

	public boolean addLast(E data) {
		Node<E> newNode = new Node<E>(data, null, null);
		if (first == null && last == null) {
			first = last = newNode;
		} else {
			last.next = newNode;
			newNode.prev = last;
			last = newNode;
		}
		length++;
		return true;
	}

	public E removeFirst() {
		if (first == null) {
			throw new RuntimeException("List is Empty!");
		}
		E data = first.data;
		if (first == last) {
			first = last = null;
		} else {
			first = first.next;
			first.prev = null;
		}
		length--;
		return data;
	}

	public E removeLast() {
		if (first == null) {
			throw new RuntimeException("List is Empty!");
		}
		E data = last.data;
		if (first == last) {
			first = last = null;
		} else {
			last = last.prev;
			last.next = null;
		}
		length--;
		return data;
	}

	public boolean remove(E data) {
		if (first == null) {
			throw new RuntimeException("List is Empty!");
		}
		if (first == last) {
			first = last = null;
			// If first Node
		} else if (first.data.equals(data)) {
			first = first.next;
			first.prev = last;
			last.next = first;
			// If last element
		} else if (last.data.equals(data)) {
			last = last.prev;
			last.next = first;
			first.prev = last;
		} else {
			Node<E> temp = first;
			Node<E> prev = null;
			while (temp.next != last && !temp.data.equals(data)) {
				prev = temp;
				temp = temp.next;
			}

			if (temp.next == null && temp == last) {
				last = last.prev;
				last.next = null;
			} else {
				prev.next = temp.next;
				temp.next.prev = prev;
			}
		}
		length--;
		return true;
	}

	public E remove(int position) {
		if (first == null) {
			throw new RuntimeException("List is Empty!");
		}
		E data = null;
		if (position == 0) {
			data = first.data;
			first = first.next;
			first.prev = null;
		} else {
			Node<E> temp = first;
			Node<E> prev = null;
			int pos = 0;
			while (temp.next != last && pos < position) {
				prev = temp;
				temp = temp.next;
				pos++;
			}
			data = temp.data;
			prev.next = temp.next;
			temp.next.prev = prev;
		}
		length--;
		return data;
	}

	public int size() {
		return length;
	}

	public boolean isValidRange(int index) {
		return index >= 0 && index <= length;
	}

	public E getFirst() {
		return first.data;
	}

	public E getLast() {
		return last.data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if (first == null) {
			return sb.append("]").toString();
		}
		Node<E> temp = first;
		boolean isFirst = true;
		while (temp.next != null && temp.next != last) {
			if (isFirst) {
				sb.append(temp.data);
				isFirst = false;
			} else {
				sb.append(", " + temp.data);
			}
			temp = temp.next;
		}
		if (length == 1) {
			sb.append(temp.data);
		} else {
			if (temp != null && temp.data != null) {
				sb.append(", " + temp.data);
			}
			if (last != null && last.data != null) {
				sb.append(", " + last.data);
			}
		}

		return sb.append("]").toString();
	}
}
