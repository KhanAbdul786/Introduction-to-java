package lecture9_Arrays_1;

public class ArraySum {
	public static int sumArrays(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum =sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(sumArrays(arr));

	}

}
