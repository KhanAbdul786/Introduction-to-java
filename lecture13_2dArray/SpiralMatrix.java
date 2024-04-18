package lecture13_2dArray;

public class SpiralMatrix {
	public static void spiralMatrix(int[][] arr, int rows, int cols) {
		if (rows == 0) {
			return;
		}

		int total = rows * cols;

		int rowStart = 0;
		int rowEnd = rows - 1;
		int colStart = 0;
		int ColEnd = cols - 1;
		int count = 0;

		while (count < total) {
			// left to right
			for (int i = colStart; count < total && i <= ColEnd; i++) {
				System.out.print(arr[rowStart][i] + " ");
				count++;
			}
			rowStart++;
			// top to bottom
			for (int i = rowStart; count < total && i <= rowEnd; i++) {
				System.out.print(arr[i][ColEnd] + " ");
				count++;
			}
			ColEnd--;

			// right to left
			for (int i = ColEnd; count < total && i >= colStart; i--) {
				System.out.print(arr[rowEnd][i] + " ");
				count++;
			}
			rowEnd--;
			// bottom to top
			for (int i = rowEnd; count < total && i >= rowStart; i--) {
				System.out.print(arr[i][colStart] + " ");
				count++;
			}
			colStart++;
		}

	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int n = arr.length;
		int m = arr[0].length;
		spiralMatrix(arr, n, m);

	}

}
