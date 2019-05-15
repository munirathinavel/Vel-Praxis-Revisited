package linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MergeLinkedListTest {

	@Test
	public void testMergeLinkedListIteratively() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);

		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(8);
		list2.add(10);
		list2.add(15);

		MergeLinkedList<Integer> mergeList = new MergeLinkedList<>();

		SinglyLinkedList<Integer> list3 = mergeList.mergeLinkedList(list, list2);

		assertEquals(1, list3.getFirst());
		assertEquals(15, list3.getLast());
		System.out.println(list3);
	}

	@Test
	public void testMergeLinkedListIteratively2() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);

		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(8);
		list2.add(10);
		list2.add(15);

		MergeLinkedList<Integer> mergeList = new MergeLinkedList<>();

		SinglyLinkedList<Integer> list3 = mergeList.mergeLinkedList(list2, list);

		assertEquals(1, list3.getFirst());
		assertEquals(15, list3.getLast());
		System.out.println(list3);
	}

	@Test
	public void testMergeLinkedListRecursively() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);

		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(8);
		list2.add(10);
		list2.add(15);

		Node<Integer> head = list.mergeLinkedListRecursively(list.head, list2.head);

		SinglyLinkedList<Integer> list3 = new SinglyLinkedList<Integer>();
		list3.head = head;

		assertEquals(1, list3.getFirst());
		assertEquals(15, list3.getLast());
		System.out.println(list3);
	}

	@Test
	public void testMergeLinkedListRecursively2() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(25);

		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(8);
		list2.add(10);
		list2.add(15);

		Node<Integer> head = list.mergeLinkedListRecursively(list2.head, list.head);

		SinglyLinkedList<Integer> list3 = new SinglyLinkedList<Integer>();
		list3.head = head;

		System.out.println(list3);
	}
}
