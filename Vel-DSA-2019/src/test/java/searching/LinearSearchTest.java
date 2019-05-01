package searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinearSearchTest {

	@Test
	void testLinearSearchWithValidInput() {

		int val = 30;
		int array[] = { 23, 34, 56, 23, 45, 30, 45, 67 };

		LinearSearch linearSearch = new LinearSearch();
		int index = linearSearch.linearSearch(array, val);
		assertEquals(5, index);
	}

	@Test
	void testLinearSearchWithInvalidInput() {

		int val = 400;
		int array[] = { 23, 34, 56, 23, 45, 30, 45, 67 };

		LinearSearch linearSearch = new LinearSearch();
		int index = linearSearch.linearSearch(array, val);
		assertEquals(-1, index);
	}

	@Test
	void testLinearSearchWithNullArray() {

		int val = 400;
		int array[] = null;

		LinearSearch linearSearch = new LinearSearch();
		int index = linearSearch.linearSearch(array, val);
		assertEquals(-1, index);
	}

	@Test
	void testLinearSearchWithEmptyArray() {

		int val = 400;
		int array[] = {};

		LinearSearch linearSearch = new LinearSearch();
		int index = linearSearch.linearSearch(array, val);
		assertEquals(-1, index);
	}

}
