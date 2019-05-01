package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void testValidInput() {
		int a[] = { 12, 34, 46, 56, 78, 96, 345 };
		int val = 96;

		BinarySearch search = new BinarySearch();
		int index = search.binarySearchRecursive(a, val, 0, a.length - 1);
		assertEquals(5, index);

		index = search.binarySearchIterative(a, val);
		assertEquals(5, index);
	}

	@Test
	void testWithHighInvalidInput() {
		int a[] = { 12, 34, 46, 56, 78, 96, 345 };
		int val = 960;

		BinarySearch search = new BinarySearch();
		int index = search.binarySearchRecursive(a, val, 0, a.length - 1);
		assertEquals(-1, index);

		index = search.binarySearchIterative(a, val);
		assertEquals(-1, index);
	}

	@Test
	void testWithLowInvalidInput() {
		int a[] = { 12, 34, 46, 56, 78, 96, 345 };
		int val = -122;

		BinarySearch search = new BinarySearch();
		int index = search.binarySearchRecursive(a, val, 0, a.length - 1);
		assertEquals(-1, index);

		index = search.binarySearchIterative(a, val);
		assertEquals(-1, index);
	}

	@Test
	void testWithInvalidArray() {
		int a[] = {};
		int val = 960;

		BinarySearch search = new BinarySearch();
		int index = search.binarySearchRecursive(a, val, 0, a.length - 1);
		assertEquals(-1, index);

		index = search.binarySearchIterative(a, val);
		assertEquals(-1, index);
	}

}
