package linkedlist;

import org.junit.Test;

public class PrintCommonValuesInSortedListsTest {

	@Test
	public void testMergeOddAndEvenNumbers() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(15);
		System.out.println("list1: " + list);

		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(13);
		list2.add(15);
		System.out.println("list2: " + list2);

		PrintCommonValuesInSortedLists commonValues = new PrintCommonValuesInSortedLists();
		SinglyLinkedList<Integer> commonList = new SinglyLinkedList<Integer>();
		commonList.head = commonValues.printCommonValues(list.head, list2.head);
		System.out.println("\nCommon Values" + commonList);
	}

}
