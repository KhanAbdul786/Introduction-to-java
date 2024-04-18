package lecture13_2dArray;

public class PrintRowWise {
	public static int[] printRowWise(int[][] a) {
		int rows=a.length;
		int cols=a[0].length;
		
		int[] arr=new int[rows*cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int res=i*cols+j;
				arr[i*cols+j]=a[i][j];
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr= {{4,3},{2,1}};
		int[] a=printRowWise(arr);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
