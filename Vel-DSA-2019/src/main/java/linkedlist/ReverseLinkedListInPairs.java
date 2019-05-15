package linkedlist;

import java.util.Stack;

public class ReverseLinkedListInPairs {
	Node left;

	public void reverseListInPairsBySwapDataIteratively(Node<Integer> head) {
		if (head == null) {
			throw new RuntimeException("List is empty!");
		} else if (head.next == null) {
			return;
		}

		Node<Integer> temp = head;
		while (temp != null && temp.next != null) {
			// Swap 2 values
			swapValues(temp);
			// Move temp 2 steps forward (1-> 3)
			temp = temp.next.next;
		}
		return;
	}

	public void reverseListInPairsBySwapDataRecursively(Node<Integer> head) {
		if (head == null) {
			throw new RuntimeException("List is empty!");
		} else if (head.next == null) {
			return;
		}
		// When more than 1 elements present in List
		swapRecursively(head);
	}

	private void swapRecursively(Node<Integer> head) {
		// Base Condition.
		// Check if 2 nodes are present. If not, return
		if (head == null || head.next == null) {
			return;
		}
		// Swap 2 values
		swapValues(head);

		// Jump 2 nodes at a time
		reverseListInPairsBySwapDataIteratively(head.next.next);
		return;
	}

	private void swapValues(Node<Integer> head) {
		int data = head.data;
		head.data = head.next.data;
		head.next.data = data;
	}

	public Node<Integer> reverseListInPairsBySwapLinkIteratively(Node<Integer> head) {

		if (head == null) {
			throw new RuntimeException("List is empty!");
		} else if (head.next == null) {
			return head;
		}

		// Initialize the previous & current pointers
		Node prev = head;
		Node current = head.next;
		// Changing the head to current. Moving head to next pointer
		head = current;

		while (true) {
			// Take a back-up of next node.
			Node next = current.next;
			// Make previous node as next node of current node
			current.next = prev;

			// When next is null or next is last node.
			if (next == null || next.next == null) {
				prev.next = next;
				break;
			}

			// Set next node of previous
			prev.next = next.next;

			// Move previous & current node to next set
			prev = next;
			current = prev.next;
		}

		return head;
	}

	public Node reverseRecursively(Node node) {
		// Base Condition for single node
		if (node == null || node.next == null) {
			return node;
		}

		// Return 2nd element so that it becomes head after reversing the list
		Node newHead = node.next;

		// Take remaining list & pass it to recursive function
		Node remaining = node.next.next;

		// Move 1st element to next of 2nd element
		node.next.next = node;

		// Set next of node to remaining list
		node.next = reverseRecursively(remaining);

		return newHead;

	}

	public boolean palindromeList(Node<Integer> head) {

		if (head == null || head.next == null) {
			return true;
		}

		// 1. Get middle element of the list
		Node slow = head, fast = head, prev = head;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		// Taking mid element as a back-up for ODD number of elements
		Node mid = null;
		if (fast != null) {
			mid = slow;
			slow = slow.next;
		}

		// 2. Reverse the second half of the list.
		prev.next = null; // Terminate 1st list
		Node secondHalf = slow;

		// reverse second half such that we can comapre elements at same position from
		// both lists.
		secondHalf = reverse(secondHalf);

		// 3. Compare lists
		boolean result = comapreLists(head, secondHalf);

		// 4. Reverse 2nd half list again.
		secondHalf = reverse(secondHalf);

		if (mid != null) {
			prev.next = mid;
		} else {
			prev.next = secondHalf;
		}

		return result;
	}

	private boolean comapreLists(Node<Integer> head1, Node head2) {
		Node first = head1, second = head2;

		while (first != null && second != null) {
			if (first.data == second.data) {
				first = first.next;
				second = second.next;
			} else {
				return false;
			}
		}

		if (first == null && second == null) {
			return true;
		}
		return false;
	}

	private Node reverse(Node secondHalf) {
		Node prev = null;
		Node current = secondHalf;
		Node next;
		while (current != null) {
			// Back next node
			next = current.next;
			// Change link from next nde to previous node
			current.next = prev;
			// Move previous & current pointers
			prev = current;
			current = next;
		}
		secondHalf = prev;
		return secondHalf;
	}

	private Node reverse2(Node second) {
		if (second.next == null) {
			return second;
		}
		Node current = second;
		Node prev = null;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		second = prev;

		return second;
	}

	public boolean palindromeList2(Node<Integer> head) {
		if (head == null || head.next == null) {
			return true;
		}

		// 1. Find middle element of the list
		Node prev = head;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		Node mid = null;
		if (fast != null) {
			mid = slow;
			slow = slow.next;
		}
		// terminate fist list
		prev.next = null;

		// 2. Reverse 2nd list
		Node second = slow;
		second = reverse2(second);

		// 3. Compare 2 lists
		boolean result = compareLists2(head, second);

		// 4. Reverse 2nd again to get original form
		second = reverse2(second);

		if (mid != null) {
			prev.next = mid;
		} else {
			prev.next = second;
		}
		return result;
	}

	private boolean compareLists2(Node<Integer> head1, Node head2) {
		Node first = head1;
		Node second = head2;
		while (first != null && second != null) {
			if (first.data != second.data) {
				return false;
			} else {
				first = first.next;
				second = second.next;
			}
		}
		if (first == null && second == null) {
			return true;
		}
		return false;
	}

	public boolean palindromeListWithStack(Node<Integer> head) {
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;
		while (temp != null) {
			stack.push(temp);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			if (stack.peek() != null && stack.peek().data != temp.data) {
				return false;
			}
			stack.pop();
			temp = temp.next;
		}
		if (temp != null) {
			return false;
		}
		return true;
	}

	public boolean palindromeListWithRecursion(Node<Integer> head) {
		left = head;
		return isPalindrome(head);
	}

	public boolean isPalindrome(Node right) {
		if (right == null) {
			return true;
		}
		boolean isP = isPalindrome(right.next);
		if (isP == false) {
			return false;
		}
		boolean isP1 = left.data == right.data;
		left = left.next;
		return isP1;
	}

}
