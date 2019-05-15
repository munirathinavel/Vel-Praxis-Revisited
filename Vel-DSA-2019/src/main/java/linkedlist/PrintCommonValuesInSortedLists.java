package linkedlist;

public class PrintCommonValuesInSortedLists {

	public Node<Integer> printCommonValues(Node<Integer> head1, Node<Integer> head2) {
		if (head1 == null || head2 == null) {
			return head1;
		}
		Node<Integer> temp1 = head1;
		Node<Integer> temp2 = head2;
		Node<Integer> head3 = new Node<>(0);
		Node<Integer> temp3 = head3;
		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				System.out.print(temp1.data + " ");
				temp3.next = new Node<>(temp1.data);
				temp1 = temp1.next;
				temp2 = temp2.next;
				temp3 = temp3.next;
			} else if (temp1.data < temp2.data) {
				temp1 = temp1.next;
			} else {
				temp2 = temp2.next;
			}
		}

		return head3.next;
	}

}
