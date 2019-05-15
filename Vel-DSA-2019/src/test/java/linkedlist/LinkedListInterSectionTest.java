package linkedlist;

import org.junit.Test;

public class LinkedListInterSectionTest {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static Node head1, head2;

	private static int getValueAtInterSection(Node head1, Node head2) {
		int length1 = 0, length2 = 0;
		Node temp1 = head1;
		Node temp2 = head2;
		while (true) {
			if (temp1 != null) {
				length1++;
				temp1 = temp1.next;
			}
			if (temp2 != null) {
				length2++;
				temp2 = temp2.next;
			}
			if (temp1 == null && temp2 == null) {
				break;
			}
		}
		temp1 = head1;
		temp2 = head2;
		if (length1 - length2 < 0) {
			return getIntersectingNode(temp2, temp1, length2 - length1);
		} else {
			return getIntersectingNode(temp1, temp2, length1 - length2);
		}
	}

	private static int getIntersectingNode(Node temp1, Node temp2, int length) {
		for (int i = 0; i < length; i++) {
			temp1 = temp1.next;
		}
		while (temp1.next != null && temp2.next != null) {
			if (temp1.data == temp2.data) {
				return temp1.data;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		if (temp1.next == null || temp2.next == null) {
			return -1;
		}
		return temp1.data;
	}

	@Test
	public void testIntersection() {
		LinkedListInterSectionTest list1 = new LinkedListInterSectionTest();
		list1.head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);

		list1.head2 = new Node(10);
		head2.next = new Node(4);
		head2.next.next = new Node(5);

		System.out.println("Value at Intersection is " + getValueAtInterSection(head1, head2));
	}

	@Test
	public void testNotIntersection() {
		LinkedListInterSectionTest list1 = new LinkedListInterSectionTest();
		list1.head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);

		list1.head2 = new Node(10);
		head2.next = new Node(15);

		System.out.println("Value at Intersection is " + getValueAtInterSection(head1, head2));
	}

}
