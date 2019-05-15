package linkedlist;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class ReverseLinkedListInPairsTest {

	@Test
	public void testMergeLinkedListIteratively_NoItem() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

		System.out.println("Iteratively_NoItem: before" + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		assertThrows(RuntimeException.class, () -> {
			reverseList.reverseListInPairsBySwapDataIteratively(list.head);
		});

		System.out.println("Iteratively_NoItem: after" + list);
	}

	@Test
	public void testMergeLinkedListIteratively_SingleItem() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);

		System.out.println("Iteratively_SingleItem: before " + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		reverseList.reverseListInPairsBySwapDataIteratively(list.head);

		System.out.println("Iteratively_SingleItem: after " + list);
	}

	@Test
	public void testMergeLinkedListIteratively() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println("reverseListInPairsBySwapData: before " + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		reverseList.reverseListInPairsBySwapDataIteratively(list.head);

		System.out.println("reverseListInPairsBySwapData: after " + list);
	}

	@Test
	public void testMergeLinkedListRecursively_NoItem() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

		System.out.println("reverseListInPairsBySwapData before:" + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		assertThrows(RuntimeException.class, () -> {
			reverseList.reverseListInPairsBySwapDataRecursively(list.head);
		});

		System.out.println("reverseListInPairsBySwapData after:" + list);
	}

	@Test
	public void testMergeLinkedListRecursively_SingleItem() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);

		System.out.println("Recursively_SingleItem before:" + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		reverseList.reverseListInPairsBySwapDataRecursively(list.head);

		System.out.println("Recursively_SingleItem after:" + list);
	}

	@Test
	public void testMergeLinkedListRecursively() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println("Recursively before:" + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		reverseList.reverseListInPairsBySwapDataRecursively(list.head);

		System.out.println("Recursively after:" + list);
	}

	@Test
	public void testMergeLinkedListRecursively_OddElements() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		System.out.println("Recursively_OddElements before:" + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		reverseList.reverseListInPairsBySwapDataRecursively(list.head);

		System.out.println("Recursively_OddElements after:" + list);
	}

	@Test
	public void testReverseListInPairsBySwapLinkIteratively() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		System.out.println("SwapLinkIteratively before:" + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		list.head = reverseList.reverseListInPairsBySwapLinkIteratively(list.head);

		System.out.println("SwapLinkIteratively after:" + list);
	}

	@Test
	public void testReverseRecursively() {

		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		System.out.println("SwapLinkIteratively before:" + list);
		ReverseLinkedListInPairs reverseList = new ReverseLinkedListInPairs();
		list.head = reverseList.reverseRecursively(list.head);

		System.out.println("reverseRecursively after:" + list);

	}
	


}
