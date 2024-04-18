package lecture9_Arrays_1;

public class Largest {
	public static int latgest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8,9};
		System.out.println(latgest(arr));

	}

}
