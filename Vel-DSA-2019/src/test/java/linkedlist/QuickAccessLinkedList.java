package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class QuickAccessLinkedList<T> {
	Node<T> head;
	Map<Node<T>, T> map = new HashMap<>();

	public boolean add(Node<T> node) {
		map.put(node, node.data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
		return true;
	}

	public T get(Node<T> node) {
		return map.get(node);
	}

}
