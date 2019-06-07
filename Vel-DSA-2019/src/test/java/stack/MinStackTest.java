package stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class MinStackTest {

	@Test
	public void testMinStackTest() {
		MinStack stack = new MinStack();

		assertThrows(RuntimeException.class, () -> {
			stack.peek();
		});
		assertThrows(RuntimeException.class, () -> {
			stack.pop();
		});
		assertTrue(stack.push(1));
		assertEquals(1, stack.pop());
		assertTrue(stack.isEmpty());
		assertTrue(stack.push(12));
		assertTrue(stack.push(5));
		assertEquals(5, stack.peek());
		assertFalse(stack.isEmpty());
		assertTrue(stack.push(14));
		assertTrue(stack.push(25));

		assertTrue(stack.push(10));

		assertEquals(5, stack.getMin());

		assertEquals(10, stack.pop());

		assertEquals(5, stack.getMin());

	}
}
