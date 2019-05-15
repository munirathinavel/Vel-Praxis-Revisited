package linkedlist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeListTest {

	@Test
	public void testPalindromeList() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		assertFalse(reverseList.palindromeList(list.head));
	}

	@Test
	public void testPalindromeList_ValidInput() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);

		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		assertTrue(reverseList.palindromeList(list.head));
	}

	@Test
	public void testPalindromeList2_ValidInput() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);

		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		assertTrue(reverseList.palindromeList2(list.head));
	}

	@Test
	public void testPalindromeWithStack() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);

		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		assertTrue(reverseList.palindromeListWithStack(list.head));
	}

	@Test
	public void testPalindromeWithRecursion() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);

		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		assertTrue(reverseList.palindromeListWithRecursion(list.head));
	}
}
