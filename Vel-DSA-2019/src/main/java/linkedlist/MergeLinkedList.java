package linkedlist;

public class MergeLinkedList<Integer> {

	public SinglyLinkedList<Integer> mergeLinkedList(SinglyLinkedList<Integer> list1, SinglyLinkedList<Integer> list2) {
		Node<Integer> head1 = list1.head;
		Node<Integer> head2 = list2.head;

		SinglyLinkedList<Integer> list3 = new SinglyLinkedList<Integer>();
		Node<Integer> head = new Node(0);
		list3.head = head;
		while (head1 != null && head2 != null) {
			if ((int) head1.data > (int) head2.data) {
				head.next = head2;
				head2 = head2.next;
			} else {
				head.next = head1;
				head1 = head1.next;
			}
			head = head.next;
		}
		if (head1 != null) {
			head.next = head1;
		} else if (head2 != null) {
			head.next = head2;
		}
		list3.head = list3.head.next;
		return list3;
	}

}
