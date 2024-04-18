package lecture13_2dArray;

public class PrintColWise {
	public static int[] printColWise(int[][] a) {
		int row=a.length;
		int col=a[0].length;
		int[] arr=new int[row*col];
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				int res=i*col+j;
				arr[i*col+j]=a[i][j];
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr= {{4},{2},{3},{1}};
		int[] a=printColWise(arr);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
