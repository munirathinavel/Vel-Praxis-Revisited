package stack;

import org.junit.Test;

public class SortStackTest {

	@Test
	public void testSortStack() {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		stack.push(21);
		stack.push(2);
		stack.push(63);
		stack.push(24);
		stack.push(15);
		System.out.println(stack);

		SortStack sort = new SortStack();
		LinkedListStack<Integer> sortStack = sort.sortStack(stack);
		System.out.println(sortStack);
	}

	@Test
	public void testSortStack_Recursion() {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		stack.push(21);
		stack.push(2);
		stack.push(63);
		stack.push(24);
		stack.push(15);
		System.out.println(stack);

		SortStack sort = new SortStack();
		sort.sortStackRecursion(stack);
		System.out.println(stack);
		sort.insertToSortedStack(stack, 4);
		
		System.out.println(stack);
	}

}
