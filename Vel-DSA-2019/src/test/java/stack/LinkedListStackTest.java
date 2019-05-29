package stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class LinkedListStackTest {

	@Test
	public void testFixedArrayStack() {
		LinkedListStack stack = new LinkedListStack();
		assertThrows(RuntimeException.class, () -> {
			stack.peek();
		});
		assertThrows(RuntimeException.class, () -> {
			stack.pop();
		});
		assertTrue(stack.push(1));
		assertEquals(1, stack.pop());
		assertTrue(stack.isEmpty());
		assertTrue(stack.push(2));
		assertTrue(stack.push(3));
		assertEquals(3, stack.peek());
		assertFalse(stack.isEmpty());
		assertTrue(stack.push(4));
		assertTrue(stack.push(5));
		assertTrue(stack.push(10));
	}

}
