package queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class FixedQueueTest {

	@Test
	public void testFixedQueue() {
		FixedQueue queue = new FixedQueue();

		assertEquals(true, queue.enqueue(1));
		assertEquals(true, queue.enqueue(2));
		assertEquals(true, queue.enqueue(3));
		assertEquals(true, queue.enqueue(5));

		assertEquals(1, queue.getFront());
		assertEquals(5, queue.getRear());

		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		assertEquals(5, queue.dequeue());

		assertThrows(RuntimeException.class, () -> {
			queue.dequeue();
		});
	}

}
