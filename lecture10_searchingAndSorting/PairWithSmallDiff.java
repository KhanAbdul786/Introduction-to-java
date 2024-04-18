package lecture10_searchingAndSorting;

public class PairWithSmallDiff {
	public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
	        // Write your code here.
	     int p = 0, q = 0;
			int minDiff = Math.abs(arr1[0] - arr2[0]);
			for (int i = 0; i < arr1.length - 1; i++) {
				int index = i;
				for (int j = i + 1; j < arr1.length; j++) {
					if (arr1[j] < arr1[index]) {
						index = j;
					}
				}
				int smallerNumber = arr1[index];
				arr1[index] = arr1[i];
				arr1[i] = smallerNumber;
			}
			for (int i = 0; i < arr2.length - 1; i++) {
				int index = i;
				for (int j = i + 1; j < arr2.length; j++) {
					if (arr2[j] < arr2[index]) {
						index = j;
					}
				}
				int smallerNumber = arr2[index];
				arr2[index] = arr2[i];
				arr2[i] = smallerNumber;
			}
			while (p < n && q < m) {
				minDiff = Math.min(minDiff, Math.abs(arr1[p] - arr2[q]));
				if (arr1[p] < arr2[q]) {
					p++;
				} else {
					q++;
				}
			}
			return minDiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
