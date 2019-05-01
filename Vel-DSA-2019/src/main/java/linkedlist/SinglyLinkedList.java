package linkedlist;

import java.util.function.BooleanSupplier;

/**
 * <P>
 * Single Linked List Implementation with varieties add, remove methods.
 * </P>
 * 
 * @author m.chinnasamy
 *
 * @param <E>
 */
public class SinglyLinkedList<E> {
	Node<E> head;
	int length = 0;
	private int counter = 0;

	public SinglyLinkedList() {
	}

	public boolean addFirst(E data) {
		Node<E> newNode = new Node<E>(data, null);
		// Insert 1st Element in Empty Linked List
		if (head == null) {
			head = new Node<E>(data, null);
		} else {
			// Insert at the beginning
			newNode.next = head;
			head = newNode;
		}
		length++;
		return true;
	}

	public E getFirst() {
		return head.data;
	}

	public boolean addLast(E data) {
		Node<E> newNode = new Node<E>(data, null);
		if (head == null) {
			head = newNode;
		} else {
			Node<E> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		length++;
		return true;
	}

	public E getLast() {
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	boolean add(E data) {
		return addLast(data);
	}

	boolean add(E data, int position) {
		if (!isValidPosition(position)) {
			throw new RuntimeException("Invalid position!");
		}
		Node<E> newNode = new Node<E>(data, null);
		if (position == 0) {
			head = newNode;
		} else {
			Node<E> temp = head;
			int pos = 0;
			while (pos < position) {
				temp = temp.next;
				pos++;
			}
			// If it is last node
			if (temp.next == null) {
				temp.next = newNode;
				// For other position
			} else {
				newNode.next = temp.next;
				temp.next = newNode;
			}
		}
		length++;
		return true;
	}

	private boolean isValidPosition(int position) {
		return position >= 0 && position <= length;
	}

	boolean add(Node<E> newNode) {
		Node<E> temp = head;
		// Insert at First
		if (head == null) {
			head = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			// If it is last node
			if (temp.next == null) {
				temp.next = newNode;
				// For other position
			} else {
				newNode.next = temp.next.next;
				temp.next = newNode;
			}
		}
		length++;
		return true;
	}

	public int size() {
		return length;
	}

	E removeFirst() {
		Node<E> temp = head;
		if (head == null) {
			throw new RuntimeException("Empty linked list!");
		}
		head = head.next;
		length--;
		return temp.data;
	}

	E removeLast() {
		if (head == null) {
			throw new RuntimeException("Empty linked list!");
		}
		Node<E> temp = head;
		Node<E> previous = null;
		while (temp.next != null) {
			previous = temp;
			temp = temp.next;
		}
		previous.next = null;
		E val = temp.data;
		temp = null;
		length--;
		return val;
	}

	public boolean remove(E data) {
		if (head.next == null) {
			head = null;
		} else {
			Node<E> temp = head;
			if (data.equals(head.data)) {
				head = head.next;
				temp = null;
			} else {
				Node<E> previous = null;
				while (temp.next != null) {
					if (data.equals(temp.data)) {
						previous.next = temp.next;
						break;
					}
					previous = temp;
					temp = temp.next;
				}
				temp = null;
			}
		}
		length--;
		return true;
	}

	public boolean remove(int position) {
		if (!isValidPosition(position)) {
			throw new RuntimeException("Index out of Bound Exception!");
		}
		if (position == 0) {
			head = null;
		} else {
			Node<E> temp = head;
			if (position == 0) {
				head = head.next;
			} else {
				Node<E> previous = null;
				int pos = 0;
				while (pos < position && temp.next != null) {
					previous = temp;
					temp = temp.next;
					pos++;
				}
				previous.next = temp.next;
				temp = null;

			}
		}
		length--;

		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if (head == null) {
			return sb.append("]").toString();
		} else if (head.next == null) {
			return sb.append(head.data + "]").toString();
		}
		Node<E> temp = head;
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

	/**
	 * This class is used for singly linked list node definition
	 * 
	 * @author m.chinnasamy
	 *
	 * @param <E>
	 */
	class Node<E> {
		E data;
		Node<E> next;

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

		@Override
		public String toString() {
			return "" + this.data;
		}

	}

	public E findNthLastNode(int position) {
		if (length < position || position < 1) {
			throw new RuntimeException("Index is Out of range!");
		}
		Node<E> p1 = head;
		int pos = 1;
		while (pos < position && p1.next != null) {
			p1 = p1.next;
			pos++;
		}

		Node<E> p2 = head;
		while (p1.next != null) {
			p2 = p2.next;
			p1 = p1.next;
		}

		return p2.data;
	}

	public E findNthLastNodeRecursion(int position) {
		if (position < 1 || length < position) {
			throw new RuntimeException("Index out of Range!");
		}
		E data = findNthLastNodeRecursion(head, position);
		counter = 0;
		return data;
	}

	private E findNthLastNodeRecursion(Node<E> temp, int position) {
		if (temp != null) {
			E data = findNthLastNodeRecursion(temp.next, position);
			if (data != null) {
				return data;
			}
			counter++;
			if (counter == position) {
				return temp.data;
			}
		}
		return null;
	}

	boolean isCyclicLinkedList() {
		Node<E> fast = head;
		Node<E> slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public boolean addNode(Node<E> newNode, int position) {
		if (position < 1 && position > length) {
			throw new RuntimeException("Index out of range exception!");
		}

		if (position == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node<E> temp = head;
			int pos = 0;
			Node<E> prev = null;
			while (pos < position && temp.next != null) {
				prev = temp;
				temp = temp.next;
				pos++;
			}
			prev.next = newNode;
			newNode.next = temp;
		}
		return true;
	}

	public boolean addLastNodeToPosition(int position) {
		if (head == null) {
			throw new RuntimeException("List is Empty");
		} else if (position < 1 && position > length) {
			throw new RuntimeException("Index out of range exception!");
		}
		// Find last node
		Node<E> last = head;
		while (last.next != null) {
			last = last.next;
		}
		// Set last node to given position
		Node<E> temp = head;
		int pos = 0;
		while (pos < position && temp.next != null) {
			temp = temp.next;
			pos++;
		}
		last.next = temp;
		return true;
	}

	public E findCyclicNode() {
		Node<E> slow = head;
		Node<E> fast = head;

		boolean isLoop = false;
		// Find where both slow & fast pointers are meeting to know if it is cyclic
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				isLoop = true;
				break;
			}
		}
		// Move slow pointer to head & move both pointers (slow & fast) to one step &
		// when both are equal that is start of the loop
		if (isLoop) {
			slow = head;
			while (slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			return slow.data;
		}
		return null;
	}

	public Integer findLengthOfCyclicList() {
		Node<E> slow = head;
		Node<E> fast = head;

		boolean isLoop = false;
		// Find if loop exists
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				isLoop = true;
				break;
			}
		}

		if (isLoop) {
			slow = head;
			// Get starting node of the Loop
			while (slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			fast = fast.next;
			int length = 1;
			// Find length of the loop
			while (slow != fast) {
				fast = fast.next;
				length++;
			}
			return length;
		}

		return 0;
	}

	public boolean addToSortedList(E data) {
		Node<E> newNode = new Node<E>(data, null);
		if ((int) head.data > (int) data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node<E> temp = head;
			while (temp.next != null && (int) temp.next.data < (int) data) {
				temp = temp.next;
			}
			if (temp.next == null) {
				temp.next = newNode;
			} else {
				newNode.next = temp.next;
				temp.next = newNode;
			}
		}
		length++;
		return true;

	}

	public boolean reverseList() {
		if (head == null) {
			throw new RuntimeException("List is Empty!");
		} else if (head.next == null) {
			return true;
		} else {
			Node<E> current = head;
			Node<E> prev = null;
			while (current != null) {
				// Save next node temporarily.
				Node<E> next = current.next;
				// Set current.next to previous to disconnect the list into reverse
				current.next = prev;
				// Update previous to current to move previous to first element in the list
				prev = current;
				// Move current to next. Current moves until the last element's next (null)
				current = next;
			}
			// Previous will always have updated list
			head = prev;
		}
		return true;
	}

	public boolean reverseLinkedList() {
		if (head == null) {
			throw new RuntimeException("List is Empty!");
		}
		Node<E> current = head;
		Node<E> prev = null;
		while (current != null) {
			Node<E> next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return true;
	}
	
	

}