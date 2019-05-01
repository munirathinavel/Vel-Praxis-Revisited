package searching;

/**
 * 
 * @author <b>Munirathinavel Chinnasamy</b>
 *
 *         <P>
 *         Binary Search is applied on a sorted list & compare the given value
 *         with the middle element and moving the search either left or
 *         right.</BR>
 *         </BR>
 *         If value is not present then return -1.
 *         </P>
 */
public class BinarySearch {

	public static int binarySearch(int a[], int left, int right, int val) {
		return new BinarySearch().binarySearchRecursive(a, val, left, right);

	}

	public int binarySearchRecursive(int a[], int val, int left, int right) {
		if (a == null || a.length == 0) {
			return -1;
		}

		if (left > right) {
			return -1;
		}

		int middle = left + (right - left) / 2;

		// Return value
		if (a[middle] == val) {
			return middle;
			// Move Left
		} else if (a[middle] > val) {
			right = middle - 1;
			return binarySearchRecursive(a, val, left, right);
			// Move Right
		} else if (a[middle] < val) {
			left = middle + 1;
			return binarySearchRecursive(a, val, left, right);
		} else {
			return -1;
		}
	}

	public static int binarySearch(int a[], int val) {
		return new BinarySearch().binarySearchIterative(a, val);

	}

	public int binarySearchIterative(int a[], int val) {
		if (a == null || a.length == 0) {
			return -1;
		}

		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int middle = left + (right - left) / 2;

			if (a[middle] == val) {
				return middle;
			} else if (a[middle] > val) {
				right = middle - 1;
			} else if (a[middle] < val) {
				left = middle + 1;
			} else {
				return -1;
			}
		}
		return -1;
	}

}
