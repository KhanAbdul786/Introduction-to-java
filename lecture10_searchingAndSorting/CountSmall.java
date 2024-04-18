package lecture10_searchingAndSorting;

public class CountSmall {
	public static int[] countS(int n, int m, int[] a, int[] b) {
		// Create a vector ans of size n.
		int[] ans = new int[n];
		// For loop from 0 to n-1.
		for (int idx = 0; idx < n; idx++) {
			// set lo = 0, hi = m-1.
			int lo = 0, hi = m - 1, cnt = 0;
			// binary search.
			while (lo <= hi) {
				int mid = lo + (hi - lo) / 2;
				// If element at mid is less than or equal to
				// a[idx], set lo to mid+1, else reduce hi to mid-1.
				if (b[mid] <= a[idx]) {
					cnt = mid + 1;
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
			// update ans at idx with cnt.
			ans[idx] = cnt;
		}
		// return ans.
		return ans;
	}

	public static void main(String[] args) {
		int[] a = { 0, 2, 3 };
		int[] b = { 1, 5 };
		int n = a.length;
		int m = b.length;
		int[] arr = countS(n, m, a, b);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
