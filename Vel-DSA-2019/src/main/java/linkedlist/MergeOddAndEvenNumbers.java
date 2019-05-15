package linkedlist;

public class MergeOddAndEvenNumbers {

	public Node<Integer> mergeOddAndEvenNumbers(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> temp = head;
		Node<Integer> odd = new Node<>(0);
		Node<Integer> oddTemp = odd;
		Node<Integer> even = new Node<>(0);
		Node<Integer> evenTemp = even;
		while (temp != null) {
			if (temp.data % 2 == 0) {
				evenTemp.next = temp;
				evenTemp = evenTemp.next;
			} else {
				oddTemp.next = temp;
				oddTemp = oddTemp.next;
			}
			temp = temp.next;
		}
		// Setting it as last number so that next odd/even value won't appear on other
		// side
		evenTemp.next = null;
		oddTemp.next = null;
		// setting even numbers to end of odd number (i.e 1,3,5,7 -> 2,4,6)
		oddTemp.next = even.next;

		return odd.next;
	}

}
