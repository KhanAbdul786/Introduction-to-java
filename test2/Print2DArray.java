package test2;

public class Print2DArray {
	public static void print2DArray(int[][] arr) {
		int row=arr.length;
		if(row==0) {
			return;
		}
		int col=arr.length;
		for (int i = 0; i < row; i++) {
			int rc=row-i;
			while(rc!=0) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j]+" ");
				}
				rc--;
				System.out.println();
			}
			
		}
	}

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		print2DArray(arr);

	}

}
