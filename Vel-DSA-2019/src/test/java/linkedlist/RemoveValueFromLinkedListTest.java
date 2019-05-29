package linkedlist;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RemoveValueFromLinkedListTest {

	@Test
	public void testRemoveAllValues_Iterative() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(5));
		assertTrue(list.add(5));
		assertTrue(list.add(1));
		assertTrue(list.add(5));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(5));
		assertTrue(list.add(6));
		assertTrue(list.add(7));
		assertTrue(list.add(5));

		RemoveValueFromLinkedList fromLinkedList = new RemoveValueFromLinkedList();
		list.head = fromLinkedList.removeAllValues(list.head, 5);
		System.out.println(list);
	}

	@Test
	public void testRemoveAllValues_Recursively() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		assertTrue(list.add(5));
		assertTrue(list.add(5));
		assertTrue(list.add(1));
		assertTrue(list.add(5));
		assertTrue(list.add(3));
		assertTrue(list.add(4));
		assertTrue(list.add(5));
		assertTrue(list.add(6));
		assertTrue(list.add(7));
		assertTrue(list.add(5));

		RemoveValueFromLinkedList fromLinkedList = new RemoveValueFromLinkedList();
		list.head = fromLinkedList.removeAllValuesRecursively(list.head, 5);
		System.out.println(list);
	}
}
