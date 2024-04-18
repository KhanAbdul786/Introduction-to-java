package lecture11_Arrays2;

public class ReverArray {
	public static void reverseArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		for (int i = 0; i <= (end-start)/2; i++) {
			int temp=arr[i];
			arr[i]=arr[end-i];
			arr[end-i]=temp;
		}
//		while(start<=end) {
//			int temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start++;
//			end--;
//		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		reverseArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
