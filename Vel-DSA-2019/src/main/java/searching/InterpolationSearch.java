package searching;

/**
 * 
 * @author <b>Munirathinavel Chinnasamy</b>
 *
 *         <P>
 *         Interpolation Search is applied on a sorted list & compare the given
 *         value with the middle element (this is found based on the searching
 *         element's location) and moving the search either left or right.</BR>
 *         </BR>
 *         If value is not present then return -1.
 *         </P>
 */
public class InterpolationSearch {

	public int interpolationSearchRecursive(int a[], int val, int left, int right) {
		if (a == null || a.length == 0) {
			return -1;
		}

		if (left >= right) {
			return -1;
		}

		int middle = left + (((right - left) / (a[right] - a[left])) * (val - a[left]));

		// Return value
		if (a[middle] == val) {
			return middle;
			// Move Left
		} else if (a[middle] > val) {
			right = middle - 1;
			return interpolationSearchRecursive(a, val, left, right);
			// Move Right
		} else if (a[middle] < val) {
			left = middle + 1;
			return interpolationSearchRecursive(a, val, left, right);
		} else {
			return -1;
		}
	}

	public int interpolationSearchIterative(int a[], int val) {
		if (a == null || a.length == 0) {
			return -1;
		}

		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			if (a[right] - a[left] == 0) {
				return -1;
			}
			int middle = left + (((right - left) / (a[right] - a[left])) * (val - a[left]));

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
