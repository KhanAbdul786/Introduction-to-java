package lecture10_searchingAndSorting;

public class MergeSort {
	public static int[] sortMerge(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;

		int[] arr3 = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < m) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while (j < n) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		return arr3;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 6, 11, 12, 17  };
		int[] arr2 = { 2, 8, 12, 16, 19  };
		int[] k = sortMerge(arr1, arr2);
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}

	}

}
