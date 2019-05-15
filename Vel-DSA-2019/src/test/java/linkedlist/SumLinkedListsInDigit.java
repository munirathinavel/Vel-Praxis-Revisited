package linkedlist;

public class SumLinkedListsInDigit<E> {

	public Node<Integer> sumLinkedLists(Node<Integer> head1, Node<Integer> head2) {
		if (head1 == null && head2 == null) {
			return head1;
		}
		Node<Integer> temp1 = head1;
		Node<Integer> temp2 = head2;
		int carry = 0;
		int sum = 0;
		Node<Integer> temp = new Node<>(0);
		Node<Integer> head3 = temp;
		while (temp1 != null && temp2 != null) {
			sum = (temp1.data + temp2.data + carry) % 10;
			carry = (temp1.data + temp2.data) / 10;
			temp.next = new Node<>(sum);
			if (head3.data == temp.data) {
				head3 = temp;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
			temp = temp.next;
		}

		if (carry > 0) {
			temp.next = new Node<>(carry);
		}

		return head3.next;
	}
}
