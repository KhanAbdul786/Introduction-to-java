package lecture13_2dArray;

public class RowiseSum {
	public static void rowWiseSum(int[][] mat) {
		int row=mat.length;
		if(row==0) {
			return;
		}
		int col=mat[0].length;
		for(int i=0;i<row;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				sum=sum+mat[i][j];
			}
			System.out.print(sum+" ");
		}
		
	}

	public static void main(String[] args) {
		int[][] mat= {{1,2},{3,4},{5,6}};
		rowWiseSum(mat);

	}

}
