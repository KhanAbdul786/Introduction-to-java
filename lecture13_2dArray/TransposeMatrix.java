package lecture13_2dArray;

public class TransposeMatrix {
	public static int[][] transpose(int m,int n,int[][] mat){
		 m=mat.length;
		 n=mat[0].length;
		
		int[][] arr=new int[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i]=mat[i][j];
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr= {{1,2},{3,4}};
		int m=arr.length;
		int n=arr[0].length;
		int[][] arr1 = transpose(m, n, arr);
		int a=arr1.length;
		int b=arr1[0].length;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
