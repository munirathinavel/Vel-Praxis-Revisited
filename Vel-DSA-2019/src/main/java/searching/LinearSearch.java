package searching;

/**
 * 
 * @author <b>Munirathinavel Chinnasamy</b>
 *
 *         <P>
 *         Linear Search is used to search the given value on all elements
 *         through the list & return the index. </BR>
 *         </BR>
 *         If value is not present then return -1.
 *         </P>
 */
public class LinearSearch {

	public int linearSearch(int[] a, int val) {
		if (a == null) {
			return -1;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
