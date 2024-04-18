package lecture11_Arrays2;

public class SecondLargest {
	public static int secondLargest(int[] arr,int n) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			if(arr[i]>secondLargest) {
				if(arr[i]!=largest) {
					secondLargest=arr[i];
				}
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		System.out.println(secondLargest(arr, n));

	}

}
