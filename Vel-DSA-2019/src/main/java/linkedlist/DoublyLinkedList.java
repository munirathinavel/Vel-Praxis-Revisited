package linkedlist;

import linkedlist.SinglyCircularLinkedList.Node;

/**
 * <P>
 * This class defines the features of Doubly Linked List
 * </P>
 * 
 * @author m.chinnasamy
 *
 * @param <E>
 */

public class DoublyLinkedList<E> {

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
			return "" + this.data;
		}
	}

	Node<E> first;
	Node<E> last;
	int length = 0;

	public DoublyLinkedList() {
	}

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

	public boolean addLast(E data) {
		Node<E> newNode = new Node<E>(data, null, null);
		if (first == null || last == null) {
			first = last = newNode;
		} else {
			last.next = newNode;
			newNode.prev = last;
			last = newNode;
		}
		length++;
		return true;
	}

	public boolean add(E data) {
		return addLast(data);
	}

	public boolean add(E data, int index) {
		Node<E> newNode = new Node<E>(data, null, null);
		if (!isValidRange(index)) {
			throw new RuntimeException("Index out of bound exception!");
		}
		if (first == null || last == null) {
			first = last = newNode;
		} else {
			if (index == 0) {
				first.prev = newNode;
				newNode.next = first;
				first = newNode;
			} else {
				Node<E> temp = first;
				Node<E> prev = null;
				int position = 0;
				while (position < index) {
					prev = temp;
					temp = temp.next;
				}
				newNode.next = temp;
				temp.prev = newNode;
				newNode.prev = prev;
				prev.next = newNode;
			}
		}
		length++;
		return true;
	}

	public E removeFirst() {
		Node<E> temp = first;
		if (first == null || last == null) {
			throw new RuntimeException("List is Empty!");
		} else {
			first = first.next;
			first.prev = null;
		}
		length--;
		return temp.data;
	}

	public E removeLast() {
		Node<E> temp = last;
		if (first == null || last == null) {
			throw new RuntimeException("List is Empty!");
		} else {
			if (first == last) {
				first = last = null;
			} else {
				last = last.prev;
				last.next = null;
			}
		}
		length--;
		return temp.data;
	}

	public boolean remove(E data) {
		if (first == null || last == null) {
			throw new RuntimeException("List is Empty!");
		} else {
			Node<E> temp = first;
			if (first.data == data) {
				if (first == last) {
					first = last = null;
				} else {
					first = first.next;
					first.prev = null;
				}
			} else {
				Node<E> prev = null;
				while (temp.data != data && temp.next != null) {
					prev = temp;
					temp = temp.next;
				}
				if (temp.equals(last)) {
					last = last.prev;
					last.next = null;
				} else {
					prev.next = temp.next;
					temp.next.prev = prev;
				}
			}
		}
		length--;
		return true;
	}

	public boolean remove(int index) {
		if (first == null || last == null) {
			throw new RuntimeException("List is Empty!");
		} else {
			Node<E> temp = first;
			if (index == 0) {
				if (first == last) {
					first = last = null;
				} else {
					first = first.next;
					first.prev = null;
				}
			} else {
				Node<E> prev = null;
				int position = 0;
				while (position < index && temp.next != null) {
					prev = temp;
					temp = temp.next;
				}
				if (temp.equals(last)) {
					last = last.prev;
					last.next = null;
				} else {
					prev.next = temp.next;
					temp.next.prev = prev;
				}
			}
		}
		length--;
		return true;
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
		while (temp.next != null) {
			if (isFirst) {
				sb.append(temp.data);
				isFirst = false;
			} else {
				sb.append(", " + temp.data);
			}
			temp = temp.next;
		}
		if (temp != null && temp.data != null) {
			sb.append(", " + temp.data);
		}
		return sb.append("]").toString();
	}
}
