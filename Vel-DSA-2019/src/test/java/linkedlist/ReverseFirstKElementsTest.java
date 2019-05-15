package linkedlist;

import org.junit.Test;

public class ReverseFirstKElementsTest {

	@Test
	public void testReverseFirst_3_Elements() {
		SinglyLinkedList<Integer> list = prepareList();

		ReverseFirstKElements<Integer> reverse = new ReverseFirstKElements<>();
		list.head = reverse.reverFirstKElements(list.head, 3);
		System.out.println("ReverseFirst_3_Elements after:" + list);
	}

	@Test
	public void testReverseFirst_5_Elements() {
		SinglyLinkedList<Integer> list = prepareList();

		ReverseFirstKElements<Integer> reverse = new ReverseFirstKElements<>();
		list.head = reverse.reverFirstKElements(list.head, 5);
		System.out.println("ReverseFirst_5_Elements after:" + list);
	}

	@Test
	public void testReverseFirst_1_Elements() {
		SinglyLinkedList<Integer> list = prepareList();

		ReverseFirstKElements<Integer> reverse = new ReverseFirstKElements<>();
		list.head = reverse.reverFirstKElements(list.head, 1);
		System.out.println("ReverseFirst_1_Elements after:" + list);
	}

	@Test
	public void testReverseFirst_0_Elements() {
		SinglyLinkedList<Integer> list = prepareList();

		ReverseFirstKElements<Integer> reverse = new ReverseFirstKElements<>();
		list.head = reverse.reverFirstKElements(list.head, 0);
		System.out.println("ReverseFirst_0_Elements after:" + list);
	}

	@Test
	public void testReverseFirst_K_Elements_EmptyList() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

		ReverseFirstKElements<Integer> reverse = new ReverseFirstKElements<>();
		list.head = reverse.reverFirstKElements(list.head, 1);
		System.out.println("ReverseFirst_K_Elements_EmptyList after:" + list);
	}

	private SinglyLinkedList<Integer> prepareList() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		System.out.println("reverFirstKElements before:" + list);
		return list;
	}

}
