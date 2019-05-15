package linkedlist;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class FindMiddleElementTest {

	@Test
	public void testMiddleElement_withNoElements() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

		assertThrows(RuntimeException.class, () -> {
			list.findMiddleElement();
		});
	}

	@Test
	public void testMiddleElement_withSingleElements() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));

		assertEquals(1, list.findMiddleElement());
	}

	@Test
	public void testMiddleElement_withEvenNoOfElements() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(5));
		assertTrue(list.add(6));

		assertEquals(4, list.findMiddleElement());
	}

	@Test
	public void testMiddleElement_withOddNoOfElements() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(1));
		assertTrue(list.add(2));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(5));
		assertTrue(list.add(6));
		assertTrue(list.add(7));

		assertEquals(4, list.findMiddleElement());
	}
}
