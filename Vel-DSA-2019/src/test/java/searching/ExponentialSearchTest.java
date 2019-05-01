package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExponentialSearchTest {

	@Test
	void testValidInput() {
		int a[] = { 12, 34, 46, 56, 78, 96, 345 };
		int val = 96;

		ExponentialSearch search = new ExponentialSearch();
		int index = search.exponentialSearch(a, val);
		assertEquals(5, index);
	}

	@Test
	void testWithHighInvalidInput() {
		int a[] = { 12, 34, 46, 56, 78, 96, 345 };
		int val = 960;

		ExponentialSearch search = new ExponentialSearch();
		int index = search.exponentialSearch(a, val);
		assertEquals(-1, index);
	}

	@Test
	void testWithLowInvalidInput() {
		int a[] = { 12, 34, 46, 56, 78, 96, 345 };
		int val = -122;

		ExponentialSearch search = new ExponentialSearch();
		int index = search.exponentialSearch(a, val);
		assertEquals(-1, index);
	}

	@Test
	void testWithInvalidArray() {
		int a[] = {};
		int val = 960;

		ExponentialSearch search = new ExponentialSearch();
		int index = search.exponentialSearch(a, val);
		assertEquals(-1, index);
	}

	@Test
	void testWithNullArray() {
		int a[] = null;
		int val = 960;

		ExponentialSearch search = new ExponentialSearch();
		int index = search.exponentialSearch(a, val);
		assertEquals(-1, index);
	}
}
