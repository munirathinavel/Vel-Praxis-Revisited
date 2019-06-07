package queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class StackQueueOnEnqueueTest {

	@Test
	public void testLinkedListQueue() {
		StackQueueOnEnqueue queue = new StackQueueOnEnqueue();
		
		System.out.println(queue);
		assertEquals(true, queue.enqueue(1));
		System.out.println(queue);
		assertEquals(true, queue.enqueue(2));
		System.out.println(queue);
		assertEquals(true, queue.enqueue(3));
		System.out.println(queue);
		assertEquals(true, queue.enqueue(4));
		System.out.println(queue);
		assertEquals(true, queue.enqueue(5));
		System.out.println(queue);

		assertEquals(1, queue.dequeue());
		System.out.println(queue);
		assertEquals(2, queue.dequeue());
		System.out.println(queue);
		assertEquals(3, queue.dequeue());
		System.out.println(queue);
		assertEquals(4, queue.dequeue());
		System.out.println(queue);
		assertEquals(5, queue.dequeue());

		System.out.println(queue);
		assertThrows(RuntimeException.class, () -> {
			queue.dequeue();
		});
	}

}
