package linkedlist;

import org.junit.Test;

public class MergeOddAndEvenNumbersTest {

	@Test
	public void testMergeOddAndEvenNumbers() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);

		MergeOddAndEvenNumbers mergeList = new MergeOddAndEvenNumbers();
		list.head = mergeList.mergeOddAndEvenNumbers(list.head);
		System.out.println(list);
	}

	@Test
	public void testMergeOddAndEvenNumbers_2() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(4);
		list.add(6);
		System.out.println(list);

		MergeOddAndEvenNumbers mergeList = new MergeOddAndEvenNumbers();
		list.head = mergeList.mergeOddAndEvenNumbers(list.head);
		System.out.println(list);
	}

	@Test
	public void testMergeOddAndEvenNumbers_3() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);

		MergeOddAndEvenNumbers mergeList = new MergeOddAndEvenNumbers();
		list.head = mergeList.mergeOddAndEvenNumbers(list.head);
		System.out.println(list);
	}
}
