package linkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuickAccessLinkedListTest {

	@Test
	public void testOrder_1_Access_LinkedList() {
		QuickAccessLinkedList<Integer> list = new QuickAccessLinkedList<>();
		Node<Integer> node1 = new Node<>(1);
		assertTrue(list.add(node1));
		Node<Integer> node2 = new Node<>(2);
		assertTrue(list.add(node2));
		assertTrue(list.add(new Node<Integer>(3)));

		assertTrue(1 == list.get(node1));
		assertTrue(2 == list.get(node2));
	}

}
