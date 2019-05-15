package linkedlist;

import org.junit.Test;

public class SumLinkedListsInDigitTest {

	@Test
	public void testSumLinkedListsInDigit() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("list1 before:" + list);
		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println("list2 before:" + list2);

		SumLinkedListsInDigit<Integer> sumList = new SumLinkedListsInDigit<>();
		SinglyLinkedList<Integer> list3 = new SinglyLinkedList<Integer>();
		list3.head = sumList.sumLinkedLists(list.head, list2.head);
		System.out.println("After sum list3" + list3);
	}

	@Test
	public void testSumLinkedListsInDigit_2() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(5);
		list.add(4);
		list.add(8);
		System.out.println("list1 before:" + list);
		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.add(2);
		list2.add(5);
		list2.add(7);
		System.out.println("list2 before:" + list2);

		SumLinkedListsInDigit<Integer> sumList = new SumLinkedListsInDigit<>();
		SinglyLinkedList<Integer> list3 = new SinglyLinkedList<Integer>();
		list3.head = sumList.sumLinkedLists(list.head, list2.head);
		System.out.println("After sum list3" + list3);
	}

	@Test
	public void testSumLinkedListsInDigit_3() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(5);
		list.add(0);
		list.add(2);
		System.out.println("list1 before:" + list);
		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.add(9);
		list2.add(0);
		list2.add(1);
		System.out.println("list2 before:" + list2);

		SumLinkedListsInDigit<Integer> sumList = new SumLinkedListsInDigit<>();
		SinglyLinkedList<Integer> list3 = new SinglyLinkedList<Integer>();
		list3.head = sumList.sumLinkedLists(list.head, list2.head);
		System.out.println("After sum list3" + list3);
	}

}
