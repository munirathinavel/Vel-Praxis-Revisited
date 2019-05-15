package linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

	@Test
	void testLinkedList() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));

		System.out.println(list);

		assertEquals(3, list.length);

		assertTrue(list.addFirst(0));
		assertEquals(0, list.getFirst());

		System.out.println(list);

		assertTrue(list.addLast(4));
		System.out.println(list);
		assertEquals(4, list.getLast());
		assertEquals(5, list.size());

		assertEquals(0, list.removeFirst());
		System.out.println(list);
		assertEquals(1, list.getFirst());
		assertEquals(4, list.size());

		assertEquals(4, list.removeLast());
		System.out.println(list);
		assertEquals(3, list.getLast());
		assertEquals(3, list.size());

		assertEquals(true, list.remove(1));
		System.out.println(list);
		assertEquals(2, list.size());

		assertTrue(list.remove(new Integer(3)));
		System.out.println(list);
		assertEquals(1, list.size());

		assertEquals(3, list.removeLast());
		System.out.println(list);

		assertEquals(1, list.removeFirst());
		System.out.println(list);
	}

	@Test
	public void givenLinkedList_whenNullList_thenThrowException() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		assertThrows(RuntimeException.class, () -> {
			list.removeFirst();
		});

		assertThrows(RuntimeException.class, () -> {
			list.removeLast();
		});

		assertTrue(list.add(1));
		assertTrue(list.addFirst(2));
		assertTrue(list.addLast(3));

		System.out.println(list);

		assertTrue(list.remove(1));
		System.out.println(list);
		assertEquals(2, list.removeFirst());
		System.out.println(list);
		assertEquals(1, list.removeLast());

		assertThrows(RuntimeException.class, () -> {
			list.removeLast();
		});

		assertThrows(RuntimeException.class, () -> {
			list.removeFirst();
		});

	}

	@Test
	public void findNthLastNode() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list);

		assertEquals(7, list.findNthLastNode(4));
		assertEquals(8, list.findNthLastNode(3));
		assertEquals(1, list.findNthLastNode(10));
		assertEquals(10, list.findNthLastNode(1));

		assertThrows(RuntimeException.class, () -> {
			list.findNthLastNode(11);
		});

		assertThrows(RuntimeException.class, () -> {
			list.findNthLastNode(0);
		});
	}

	@Test
	public void findNthLastNodeRecursion() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list);

		assertEquals(7, list.findNthLastNodeRecursion(4));
		assertEquals(8, list.findNthLastNodeRecursion(3));
		assertEquals(1, list.findNthLastNodeRecursion(10));
		assertEquals(10, list.findNthLastNodeRecursion(1));

		assertThrows(RuntimeException.class, () -> {
			list.findNthLastNodeRecursion(11);
		});

		assertThrows(RuntimeException.class, () -> {
			list.findNthLastNodeRecursion(0);
		});

	}

	@Test
	public void testIsCyclicList() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));

		// Verify if Cyclic test throws exception when it is not cyclic
		assertFalse(list.isCyclicLinkedList());

		assertTrue(list.add(4));
		assertTrue(list.add(5));
		assertTrue(list.add(6));
		// Make a cyclic list by adding last node into a existing node.
		assertTrue(list.addLastNodeToPosition(2));

		assertTrue(list.isCyclicLinkedList());
	}

	@Test
	public void testfindCyclicNode() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(5));
		assertTrue(list.add(6));

		// Make a cyclic list by adding last node into a existing node.
		assertTrue(list.addLastNodeToPosition(2));

		assertTrue(list.isCyclicLinkedList());

		assertEquals(3, list.findCyclicNode());
	}

	@Test
	public void testfindLengthOfCyclicList() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(5));
		assertTrue(list.add(6));

		// Make a cyclic list by adding last node into a existing node.
		assertTrue(list.addLastNodeToPosition(2));
		assertTrue(list.isCyclicLinkedList());
		assertEquals(3, list.findCyclicNode());
		assertEquals(4, list.findLengthOfCyclicList());

		assertTrue(list.add(6, 4));
		assertEquals(5, list.findLengthOfCyclicList());
	}

	@Test
	public void testAddToSortedList() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(15));
		assertTrue(list.add(26));

		System.out.println(list);

		assertTrue(list.addToSortedList(12));
		assertEquals(7, list.length);
		System.out.println(list);

		assertTrue(list.addToSortedList(8));
		assertEquals(8, list.length);
		System.out.println(list);

		assertTrue(list.addToSortedList(672));
		assertEquals(9, list.length);
		System.out.println(list);
	}

	@Test
	public void testReverseList() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(15));
		assertTrue(list.add(26));

		System.out.println(list);

		assertTrue(list.reverseList());
		System.out.println(list);
	}

	@Test
	public void testReverseLinkedList() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertThrows(RuntimeException.class, () -> {
			list.reverseLinkedList();
		});
		assertTrue(list.add(1));
		assertTrue(list.reverseLinkedList());
		System.out.println(list);
		assertTrue(list.add(2));
		assertTrue(list.add(3));

		assertTrue(list.reverseLinkedList());
		System.out.println(list);
		assertTrue(list.reverseLinkedList());
		System.out.println(list);

		assertTrue(list.add(4));
		assertTrue(list.add(15));
		assertTrue(list.add(26));

		System.out.println(list);

		assertTrue(list.reverseLinkedList());
		System.out.println(list);
	}

	@Test
	public void testReverseLinkedListInterative() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertThrows(RuntimeException.class, () -> {
			list.reverseLinkedListInterative();
		});
		assertTrue(list.add(1));
		assertTrue(list.reverseLinkedListInterative());
		System.out.println(list);
		assertTrue(list.add(2));
		assertTrue(list.add(3));

		assertTrue(list.reverseLinkedListInterative());
		System.out.println(list);
		assertTrue(list.reverseLinkedListInterative());
		System.out.println(list);

		assertTrue(list.add(4));
		assertTrue(list.add(15));
		assertTrue(list.add(26));

		System.out.println(list);

		assertTrue(list.reverseLinkedListInterative());
		System.out.println(list);
	}

	@Test
	public void testReverseLinkedListRecursively() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		/*
		 * assertThrows(RuntimeException.class, () -> {
		 * list.reverseLinkedListRecursively(); });
		 */
		assertTrue(list.add(1));
		assertTrue(list.reverseLinkedListRecursively());
		System.out.println(list);
		assertTrue(list.add(2));
		assertTrue(list.add(3));

		assertTrue(list.reverseLinkedListRecursively());
		System.out.println(list);
		assertTrue(list.reverseLinkedListRecursively());
		System.out.println(list);

		assertTrue(list.add(4));
		assertTrue(list.add(15));
		assertTrue(list.add(26));

		System.out.println(list);

		assertTrue(list.reverseLinkedListRecursively());
		System.out.println(list);
	}

	@Test
	public void testReverseLinkedListRecursively2() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.reverseLinkedListRecursively2());
		System.out.println(list);
		assertTrue(list.add(2));
		assertTrue(list.add(3));

		assertTrue(list.reverseLinkedListRecursively2());
		System.out.println(list);
		assertTrue(list.reverseLinkedListRecursively2());
		System.out.println(list);

		assertTrue(list.add(4));
		assertTrue(list.add(15));
		assertTrue(list.add(26));

		System.out.println(list);

		assertTrue(list.reverseLinkedListRecursively2());
		System.out.println(list);
	}

	@Test
	public void testPrintLinkedListInReverseOrder() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(15));
		assertTrue(list.add(26));

		System.out.println(list);
		assertTrue(list.printLinkedListInReverseOrder());
	}

}
