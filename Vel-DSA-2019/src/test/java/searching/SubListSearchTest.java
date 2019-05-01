package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubListSearchTest {

	@Test
	void testValidInput() {
		Node node5 = new Node(5, null);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node second = new Node(1, node2);

		Node node_4 = new Node(4, null);
		Node node_3 = new Node(3, node_4);
		Node first = new Node(2, node_3);

		boolean isSublist = new SubListSearch().isSubList(first, second);
		assertTrue(true == isSublist);
	}

	@Test
	void testWithHighValidInput2() {
		Node node5 = new Node(6, null);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(5, node4);
		Node node2 = new Node(4, node3);
		Node second = new Node(1, node2);

		Node node_3 = new Node(6, null);
		Node first = new Node(4, node_3);

		boolean isSublist = new SubListSearch().isSubList(first, second);
		assertTrue(true == isSublist);
	}

	@Test
	void testWithLowInvalidInput() {
		Node node5 = new Node(6, null);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(5, node4);
		Node node2 = new Node(4, node3);
		Node second = new Node(1, node2);

		Node node_3 = new Node(7, null);
		Node first = new Node(4, node_3);

		boolean isSublist = new SubListSearch().isSubList(first, second);
		assertTrue(false == isSublist);
	}

	@Test
	void testWithInvalidArray() {
		Node node5 = new Node(6, null);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(5, node4);
		Node node2 = new Node(4, node3);
		Node second = new Node(1, node2);

		boolean isSublist = new SubListSearch().isSubList(null, second);
		assertTrue(false == isSublist);
	}

	@Test
	void testWithNullArray() {

		Node node_3 = new Node(7, null);
		Node first = new Node(4, node_3);

		boolean isSublist = new SubListSearch().isSubList(first, null);
		assertTrue(false == isSublist);
	}
}
