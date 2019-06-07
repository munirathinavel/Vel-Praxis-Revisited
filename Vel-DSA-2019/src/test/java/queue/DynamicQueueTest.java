package queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class DynamicQueueTest {

	@Test
	public void testDynamicQueue() {
		DynamicQueue queue = new DynamicQueue();

		assertEquals(true, queue.enqueue(1));
		assertEquals(true, queue.enqueue(2));
		assertEquals(true, queue.enqueue(3));
		assertEquals(true, queue.enqueue(4));
		assertEquals(true, queue.enqueue(5));
		System.out.println(queue);

		assertEquals(1, queue.getFront());
		assertEquals(5, queue.getRear());

		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());

		assertEquals(4, queue.getFront());
		assertEquals(5, queue.getRear());

		assertEquals(4, queue.dequeue());
		assertEquals(5, queue.dequeue());

		System.out.println(queue);
		assertThrows(RuntimeException.class, () -> {
			queue.dequeue();
		});
	}

}
