package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyCircularLinkedListTest {

	@Test
	void testLinkedList() {
		SinglyCircularLinkedList<Integer> list = new SinglyCircularLinkedList<Integer>();
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
		assertEquals(3, list.getFirst());
		assertEquals(4, list.size());

		assertEquals(4, list.removeLast());
		System.out.println(list);
		assertEquals(1, list.getLast());
		assertEquals(3, list.size());

		assertEquals(true, list.remove(1));
		System.out.println(list);
		assertEquals(2, list.size());

		assertTrue(list.remove(new Integer(3)));
		System.out.println(list);
		assertEquals(1, list.size());

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

}
