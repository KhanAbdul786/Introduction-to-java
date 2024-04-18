package lecture13_2dArray;

public class FindLargest {
//	public static void findLargest(int[][] mat) {
//		boolean isRow=true;
//		int max=Integer.MIN_VALUE;
//		int row=mat.length;
//		int index=0;
//		if(row==0) {
//			System.out.println("Row "+index+" "+max);
//		}
//		int col=mat[0].length;
//		for(int i=0;i<row;i++) {
//			int sum=0;
//			for(int j=0;j<col;j++) {
//				sum=sum+mat[i][j];
//			}
//			if(sum>max) {
//				max=sum;
//				index=i;
//			}
//		}
//		
//		for(int i=0;i<col;i++) {
//			int sum=0;
//			for(int j=0;j<row;j++) {
//				sum=sum+mat[j][i];
//			}
//			if(sum>max) {
//				max=sum;
//				index=i;
//				isRow=false;
//			}
//		}
//		if(isRow) {
//			System.out.println("Row "+index+" "+max);
//		}
//		else {
//			System.out.println("Column "+index+" "+max);
	public static void findLargest(int mat[][]) {
		boolean isRow = true;
		int largestSum = Integer.MIN_VALUE;
		int num = 0;
		int nRows = mat.length;
		if (nRows == 0) {
			System.out.println("row " + num + " " + largestSum);
			return;
		}
		int mCols = mat[0].length;
		for (int i = 0; i < nRows; i++) {
			int rowSum = 0;
			for (int j = 0; j < mCols; j++) {
				rowSum += mat[i][j];
			}
			if (rowSum > largestSum) {
				largestSum = rowSum;
				num = i;
			}
		}
		for (int j = 0; j < mCols; j++) {
			int colSum = 0;
			for (int i = 0; i < nRows; i++) {
				colSum += mat[i][j];
			}
			if (colSum > largestSum) {
				largestSum = colSum;
				num = j;
				isRow = false;
			}
		}
		if (isRow) {
			System.out.println("row " + num + " " + largestSum);
		} else {
			System.out.println("column " + num + " " + largestSum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
