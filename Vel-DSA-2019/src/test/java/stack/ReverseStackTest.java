package stack;

import org.junit.Test;

public class ReverseStackTest {

	@Test
	public void testReverseStack_Recursion() {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);

		ReverseStack reverse = new ReverseStack();
		reverse.reverseStackRecursion(stack);
		System.out.println(stack);
	}

	@Test
	public void testReverseStack() {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);

		ReverseStack reverse = new ReverseStack();
		reverse.reverseStack(stack);
		System.out.println(stack);
	}
}
