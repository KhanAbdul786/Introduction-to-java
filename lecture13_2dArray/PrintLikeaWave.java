package lecture13_2dArray;

public class PrintLikeaWave {
	public static void wavePrint(int mat[][]) {
//		int nRows = mat.length;
//		if (nRows == 0) {
//			return;
//		}
//		int mCols = mat[0].length;
//		for (int j = 0; j < mCols; j++) {
//			if (j % 2 == 0) {
//				for (int i = 0; i < nRows; i++) {
//					System.out.print(mat[i][j] + " ");
//				}
//			} else {
//				for (int i = nRows - 1; i >= 0; i--) {
//					System.out.print(mat[i][j] + " ");
//				}
//			}
//		}

		boolean isDown=true;
		int row=mat.length;
		if(row==0) {
			return ;
		}
		int col=mat[0].length;
		for(int j=0;j<col;j++) {
			if(isDown) {
				for(int i=0;i<row;i++) {
					System.out.print(mat[i][j]+" ");
				}
				isDown=false;
			}
			else {
				for(int i=row-1;i>=0;i--) {
					System.out.print(mat[i][j]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int m = arr.length;
		int n = arr[0].length;
		wavePrint(arr);

	}

}
