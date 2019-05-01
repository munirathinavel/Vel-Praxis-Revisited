package searching;

import java.util.Arrays;

public class ExponentialSearch {

	public int exponentialSearch(int[] a, int val) {
		if (a == null) {
			return -1;
		}
		int length = a.length;
		if (length == 0 || a[0] > val || a[length - 1] < val) {
			return -1;
		}

		if (a[0] == val) {
			return 0;
		}

		int i = 1;
		while (i < length && a[i] <= val) {
			i = i * 2;
		}
		return BinarySearch.binarySearch(a, i / 2, Math.min(i, length), val);
		// We can use Java Library as well
		// return Arrays.binarySearch(a, i / 2, Math.min(i, length), val);
	}

}
